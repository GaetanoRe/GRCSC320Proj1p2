package project1p2;

public class MyUnorderedList<T> {
	private Object []list;
	private int size;
	
	@SuppressWarnings("unchecked")
	public MyUnorderedList() {
		list = (T[]) new Object [100]; 
		size = 0;
	}
	
	@SuppressWarnings("unchecked")
	public MyUnorderedList(int size) {
		list = (T[])  new Object [size];
		this.size = 0;
	}
	
	
	@SuppressWarnings("unchecked")
	public void insertAtFront(T t) {
		if(size + 1 >= list.length) {
			resizeList();
		}
		if(size != 0) {
			T temp = (T) list[1];
			for(int i = size - 1; i >= 0; i--) {
				list[i - 1] = list[i];
			}
		}
		
		list[0] = t;
	}
	
	public void insertAtRear(T t) {
		if(size + 1 >= list.length) {
			resizeList();
		}
		list[size] = t;
	}
	
	public void insertAt(int index, T t) {
		if(size + 1 >= list.length) {
			resizeList();
		}
		for(int i = size - 1; i != index ; i--) {
			list[i - 1] = list[i]; 
		}
		
		list[index] = t;
	}
	
	public T removeFromFront() {
		if(size != 0) {
			T item = (T) list[0];
			for(int i = 0; i < list.length; i++){
				list[i] = list[i + 1];
			}
			size--;
			return item;
		}
		
		return null;	
	}
	
	public T removeFromRear() {
		if(size != 0) {
			T item = (T) list[size - 1];
			list[size - 1] = 0;
			return item;
		}
		
		return null;
	}
	
	public T removeAt(int index, T t) {
		return null;
	}
	
	public int size() {
		return this.size;
	}
	
	
	@SuppressWarnings("unchecked")
	private void resizeList() {
		T[] newList = (T[]) new Object[list.length * 2];
		for(int i = 0; i < list.length; i++) {
			newList[i] = (T) list[i];
		}
		
		list = newList;
	}
}
