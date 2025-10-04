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
		MyUnorderedList<Integer> intList = new MyUnorderedList<Integer>();
		MyUnorderedList<String> strList = new MyUnorderedList<String>();
		MyStack<Integer> intStack;
		MyStack<String> strStack;
		
		// Initializing the file pointer to the file being tested in the loop.
		File fileBeingTested;
		int bVal = 0;
		
		for(int i = 0; i < filesToTest.size(); i++) {
			String currentFilename = filesToTest.get(i);
			fileBeingTested = new File(currentFilename);
			System.out.println("--------------------------Test on File: " + currentFilename + "----------------------------");
			System.out.println("Now Testing: Unordered List");
			if(currentFilename.contains("s.txt")) {
				bVal = Integer.parseInt(currentFilename.split("s.txt")[0]);
				System.out.println("" + Math.pow(10, bVal) + " strings are in this file");
				
			}
		}
		
	}
}
