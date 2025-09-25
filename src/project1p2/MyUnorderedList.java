package project1p2;

public class MyUnorderedList<T> {
	private T []list;
	private int size;
	
	@SuppressWarnings("unchecked")
	public MyUnorderedList() {
		list = (T[]) new Object [100]; 
		size = 0;
	}
	
	@SuppressWarnings("unchecked")
	public MyUnorderedList(int size) {
		list = (T[])  new Object [100];
		size = 0;
	}
	
	
	public <T> void InsertAtFront(T t) {
		if(list[0] != null) {
			for(int i = 0; i < list.length; i++) {
				
			}
		}
	}
	
	public int size() {
		return this.size;
	}
	
	@SuppressWarnings("unchecked")
	private <T> void resizeList() {
		T [] newList = (T[])new Object[list.length * 2];
		// Then copy all elements to the new array.
	}
}
