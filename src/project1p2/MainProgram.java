package project1p2;

public class MainProgram {
	public static void main(String args []) {
		/*
		MyUnorderedList<Integer> list = new MyUnorderedList<Integer>(4);
		
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
		
		MyUnorderedList<String> list = new MyUnorderedList<String>(4);
		
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
		System.out.println("List Size: " + list.size());
		
	}
}
