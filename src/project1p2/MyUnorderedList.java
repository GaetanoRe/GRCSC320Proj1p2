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
	
	
	public void insertAtFront(T t) {
		if(size == list.length - 1) {
			resizeList();
		}
		size++;
		if(size != 0) {
			for(int i = size - 1; i != 0; i--) {
				list[i] = list[i - 1];
			}
		}
		
		list[0] = t;
		
	}
	
	public void insertAtRear(T t) {
		if(size == list.length - 1) {
			resizeList();
		}
		list[size] = t;
		size++;
	}
	
	public void insertAt(int index, T t) {
		if(size == list.length - 1) {
			resizeList();
		}
		size++;
		for(int i = size; i != index; i--) {
			list[i] = list[i - 1];
		}
		list[index] = t;
	}
	
	public T removeFromFront() {
		if(size != 0) {
			T item = (T) list[0];
			for(int i = 0; i < list.length && list[i] != null; i++){
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
			size--;
			return item;
		}
		
		return null;
	}
	
	public T removeAt(int index) {
		
		if(index < size && size != 0) {
			T item = (T) list[index];
			for(int i = index; i < list.length && list[i] != null; i++) {
				list[i] = list[i + 1];
			}
			size--;
			return item;
		}
		return null;
	}
	
	public int size() {
		return this.size;
	}
	
	public String toString() {
		StringBuilder strbld = new StringBuilder();
		for(int i = 0; i < size; i++) {
			strbld.append(list[i]);
			strbld.append(", ");
		}
		
		return strbld.toString();
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
