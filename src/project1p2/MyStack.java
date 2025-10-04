package project1p2;

public class MyStack <T>{
	
	@SuppressWarnings("hiding")
	private class Node <T>{
		private T data;
		private Node<T> next;
		
		@SuppressWarnings("unused")
		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}
		
		@SuppressWarnings("unused")
		public T getData() {
			return this.data;
		}
		
		@SuppressWarnings("unused")
		public Node<T> getNext(){
			return this.next;
		}
		
		@SuppressWarnings("unused")
		public void setData(T data) {
			this.data = data;
		}
		
		@SuppressWarnings("unused")
		public void setNext(Node<T> next) {
			this.next = next;
		}
	}
	
	private Node<T> head;
	private int size;
	
	public MyStack() {
		head = null;
		size = 0;
	}
	
	public int push(T data) {
		int count = 0;
		if(head == null) {
			head = new Node<T>(data, null);
			count++;
		}
		else {
			Node<T> temp = new Node<T>(data, head);
			count++;
			head = temp;
			count++;
		}
		size++;
		
		return count;
	}
	
	public int pop() {
		int count = 0;
		if(head != null) {
			Node<T> temp = head;
			count++;
			head = head.getNext();
			count++;
			size--;
			count++;
		}
		return count;
	}
	
	public int peek() {
		int count = 0;
		T tempData;
		count++;
		if(head != null) {
			tempData = head.getData();
			count++;
		}
		else {
			tempData = null;
			count++;
		}
		return count;
	}
	
	public int emptyStack() {
		int count = 0;
		while(!isEmpty()) {
			pop();
			count++;
		}
		
		return count;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
}
