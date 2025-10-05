package project1p2;
import java.io.*;
import java.util.*;
public class MainProgram {
	public static void main(String args []) {
		
		/*
		 * The comments below are a series of tests I did to make sure the data structures I utilized in the experiment
		 * worked, since I had no access to any data structure I created in CS2. I wanted to make sure the methods worked as intended to get accurate
		 * results.
		 */
		
		/*MyUnorderedList<Integer> list = new MyUnorderedList<Integer>(4);
		
		list.insertAtFront(1);
		list.insertAtRear(2);
		list.insertAtRear(4);
		list.insertAt(2, 3);
		
		// Result should be: 1, 2, 3, 4
		System.out.println("Integer Test:");
		System.out.println(list.toString());
		System.out.println("List Size: " + list.size());
		
		int removedValue = list.removeAt(2);
		
		System.out.println("Removed Value: " + removedValue);
		
		// Result should be 1, 2, 4
		System.out.println("Resulting List: " + list.toString());
		System.out.println("List Size: " + list.size());
		
		
		int removeOne = list.removeFromFront();
		int removeTwo = list.removeFromRear();
		
		System.out.println("First Removed Value: " + removeOne);
		System.out.println("Second Removed Value: " + removeTwo);
		
		// Result should be 2,
		System.out.println(list.toString());
		System.out.println("List Size: " + list.size());
		
		
		list.insertAtFront(1);
		
		System.out.println(list.toString());
		System.out.println("List Size: " + list.size());
		
		list.insertAtRear(3);
		list.insertAtRear(5);
		list.insertAt(3, 4);
		
		// Expected outcome: 1, 2, 3, 4, 5,
		System.out.println(list.toString());
		System.out.println("List Size: " + list.size());*/
		
		// Above were tests to see how the list performed under the following scenarios using integers.
		
		/*MyUnorderedList<String> list = new MyUnorderedList<String>(4);
		
		list.insertAtFront("Apple");
		list.insertAtRear("Orange");
		list.insertAtRear("Banana");
		list.insertAt(2, "Mango");
		
		// Result should be: Apple, Mango, Orange, Banana
		System.out.println("String Test:");
		System.out.println(list.toString());
		System.out.println("List Size: " + list.size());
		
		String removedValue = list.removeAt(2);
		
		System.out.println("Removed Value: " + removedValue);
		
		// Result should be 1, 2, 4
		System.out.println("Resulting List: " + list.toString());
		System.out.println("List Size: " + list.size());
		
		
		String removeOne = list.removeFromFront();
		String removeTwo = list.removeFromRear();
		
		// The removed Items should be Apple and Banana
		System.out.println("First Removed Value: " + removeOne);
		System.out.println("Second Removed Value: " + removeTwo);
		
		// Result should be: Mango,
		System.out.println(list.toString());
		System.out.println("List Size: " + list.size());
		
		
		list.insertAtFront("Coconut");
		
		// The Result should be: Coconut, Mango,
		System.out.println(list.toString());
		System.out.println("List Size: " + list.size());
		
		list.insertAtRear("Banana");
		list.insertAtRear("Plantain");
		list.insertAt(3, "Fish");
		
		// Expected outcome: Coconut, Mango, Orange, Fish, Plantain,
		System.out.println(list.toString());
		System.out.println("List Size: " + list.size());*/
		
		// Above was to test the unordered list on strings.
		
		
		/*MyStack<Integer> stack = new MyStack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		// Expected Result: 3, 2, 1, null
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());*/
		
		// Above was to test the stack on integers
		
		/*MyStack<String> stack = new MyStack<String>();
		
		stack.push("Apple");
		stack.push("Orange"); {
		stack.push("Pear");
		
		// Expected Result: Pear, Orange, Apple, null
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		*/
		
		// Above was to test the stack on Strings.
		
		// And now, for the actual program
		
		// Reference the current directory. In many filesystems, it is named, "."
		File currentDirectory = new File(".");
		
		// A Linked list, unrelated to the test that will contain the references to test data.
		LinkedList<String> filesToTest = new LinkedList<String>();
		
		// This is a string representation of the current directory that the program is in.
		String [] directoryListings = currentDirectory.list();
		
		// This is the file Reader. It will read the files and insert them into the given data structures.
		FileReader fr;
		Scanner sc;
		
		// Any file that is a .txt file in the current directory is added to the list of test files.
		for(int i = 0; i < directoryListings.length; i++) {
			if(directoryListings[i].contains("i.txt") || directoryListings[i].contains("s.txt")) {
				filesToTest.add(directoryListings[i]);
			}
		}
		
		
		// Display the text files to confirm that they are loaded in the program.
		System.out.println("The test files being utilized:");
		for(int i = 0; i < filesToTest.size(); i++) {
			System.out.println(filesToTest.get(i));
		}
		
		System.out.println("\nInitializing both Data Structures");
		
		// These data structures will be instantiated according to the current test file's data type.
		MyUnorderedList<Integer> intList;
		MyUnorderedList<String> strList;
		MyStack<Integer> intStack;
		MyStack<String> strStack;
		
		// Initializing the file pointer to the file being tested in the loop.
		File fileBeingTested;
		
		// Initializing the StringBuilder
		StringBuilder strbld;
		
		int bVal = 0;
		int primOp = 0;
		try {
			for(int i = 0; i < filesToTest.size(); i++) {
				String currentFilename = filesToTest.get(i);
				fileBeingTested = new File(currentFilename);
				System.out.println("--------------------------Test on File: " + currentFilename + "------------------------------");
				System.out.println("Now Reading " + currentFilename +"...");
				fr = new FileReader(currentFilename);
				sc = new Scanner(fr);
				String fileStr = sc.nextLine();
				
				String [] fileContents = fileStr.split(",");
				if(currentFilename.contains("s.txt")) {
					strList = new MyUnorderedList<String>();
					strStack = new MyStack<String>();
					System.out.println("Now Testing: Unordered Array List for " + currentFilename);
					bVal = Integer.parseInt(currentFilename.split("s.txt")[0]);
					System.out.println("" + Math.pow(10, bVal) + " strings are in this file");
					for(int j = 0; j < fileContents.length; j++) {
						primOp += strList.insertAtRear(fileContents[j]);
					}
					int key = 0;
					System.out.println("Primitive Operations Required to insert all elements: " + primOp);
					primOp = 0;
					
					System.out.println("Primitive Operations Required to find the value at index " + key + " in the data file: " + strList.getAtIndex(key));
					for(; key < strList.size(); key++) {
						primOp += strList.getAtIndex(key);
					}
					System.out.println("Primitive Operations Required to find the value at all indexes: " + primOp);
					
					primOp = 0;
					while(!strList.isEmpty()) {
						primOp += strList.removeFromRear();
					}
					System.out.println("Primitive Operations Required to Remove all elements: " + primOp);
					System.out.println();
					
					primOp = 0;
					System.out.println("Now testing: Node-Based Stack for " + currentFilename);
					System.out.println("" + Math.pow(10, bVal) + " strings are in this file");
					for(int j = 0; j < fileContents.length; j++) {
						primOp += strStack.push(fileContents[j]);
					}
					System.out.println("Primitive Operations Required to insert all elements: " + primOp);
					primOp = strStack.peek();
					System.out.println("Primitive Operations Required to find first element: " + primOp);
					
					primOp = 0;
					int primOpSearch = 0;
					while(!strStack.isEmpty()) {
						primOp += strStack.pop();
						primOp += strStack.peek();
						primOpSearch += primOp;
						primOp = 0;
					}
					System.out.println("Operations Required for searching for the next element " + primOp);
					System.out.println("Operations Required for emptying the entire stack is" + primOpSearch);
					
				}
				else if(currentFilename.contains("i.txt")) {
					intList = new MyUnorderedList<Integer>();
					intStack = new MyStack<Integer>();
					System.out.println("Now Testing: Unordered Array List for " + currentFilename);
					bVal = Integer.parseInt(currentFilename.split("i.txt")[0]);
					System.out.println("" + Math.pow(10, bVal) + " integers are in this file");
					for(int j = 0; j < fileContents.length; j++) {
						primOp += intList.insertAtRear(Integer.parseInt(fileContents[j]));
					}
					System.out.println("Primitive Operations Required to insert all elements: " + primOp);
					int key = 0;
					System.out.println("Primitive Operations Required to insert all elements: " + primOp);
					primOp = 0;
					
					System.out.println("Primitive Operations Required to find the value at index " + key + " in the data file: " + intList.getAtIndex(key));
					for(; key < intList.size(); key++) {
						primOp += intList.getAtIndex(key);
					}
					System.out.println("Primitive Operations Required to find the value at all indexes: " + primOp);
					primOp = 0;
					while(!intList.isEmpty()) {
						primOp += intList.removeFromRear();
					}
					System.out.println("Primitive Operations Required to Remove all elements: " + primOp);
					System.out.println();
					
					primOp = 0;
					System.out.println("Now testing: Node-Based Stack for " + currentFilename);
					System.out.println("" + Math.pow(10, bVal) + " strings are in this file");
					for(int j = 0; j < fileContents.length; j++) {
						primOp += intStack.push(Integer.parseInt(fileContents[j]));
					}
					System.out.println("Primitive Operations Required to insert all elements: " + primOp);
					primOp = intStack.peek();
					System.out.println("Primitive Operations Required to find first element: " + primOp);
					
					primOp = 0;
					int primOpSearch = 0;
					while(!intStack.isEmpty()) {
						primOp += intStack.pop();
						primOp += intStack.peek();
						primOpSearch += primOp;
						primOp = 0;
					}
					System.out.println("Operations Required for searching for the next element " + primOpSearch);
					System.out.println("Operations Required for emptying the entire stack is" + primOpSearch);
				}
				System.out.println("--------------------------Test on File: " + currentFilename + " has concluded-----------------");
			}
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
	}
}
