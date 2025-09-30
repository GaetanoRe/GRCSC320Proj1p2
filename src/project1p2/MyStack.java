package project1p2;

public class MyStack <T>{
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
		
		public String toString() {
			StringBuilder strbld = new StringBuilder();
			strbld.append(data);
			return strbld.toString();
		}
	}
	
	private Node<T> head;
	private int size;
	
	public MyStack() {
		head = null;
		size = 0;
	}
	
	public void push(T data) {
		if(head == null) {
			head = new Node<T>(data, null);
		}
		else {
			Node<T> temp = new Node<T>(data, head);
			head = temp;
		}
		size++;
	}
	
	public T pop() {
		if(head != null) {
			Node<T> temp = head;
			head = head.getNext();
			size--;
			return temp.getData();
		}
		return null;
	}
	
	public T peek() {
		if(head != null) {
			return head.getData();
		}
		return null;
	}
	
	
}
