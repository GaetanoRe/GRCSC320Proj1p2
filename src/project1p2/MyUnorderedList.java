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
	
	
	public int insertAtFront(T t) {
		
		int count = 0;
		
		if(size == list.length - 1) {
			count += resizeList();
		}
		size++;
		count++;
		if(size != 0) {
			for(int i = size - 1; i != 0; i--) {
				list[i] = list[i - 1];
				count++;
			}
		}
		list[0] = t;
		count++;
		
		return count;
		
	}
	
	public int insertAtRear(T t) {
		int count = 0;
		if(size == list.length - 1) {
			count += resizeList();
		}
		list[size] = t;
		count++;
		size++;
		count++;
		
		return count;
		
	}
	
	public int insertAt(int index, T t) {
		
		int count = 0;
		
		if(size == list.length - 1) {
			count += resizeList();
		}
		size++;
		count++;
		for(int i = size; i != index; i--) {
			list[i] = list[i - 1];
			count++;
		}
		list[index] = t;
		count++;
		
		return count;
	}
	
	public int removeFromFront() {
		
		int count = 0;
		
		if(size != 0) {
			T item = (T) list[0];
			count++;
			for(int i = 0; i < list.length && list[i] != null; i++){
				list[i] = list[i + 1];
				count++;
			}
			size--;
			count++;
			//return item;
		}
		
		return count;	
	}
	
	public int removeFromRear() {
		
		int count = 0;
		
		if(size != 0) {
			T item = (T) list[size - 1];
			count++;
			list[size - 1] = 0;
			count++;
			size--;
			count++;
			// return item;
		}
		
		return count;
	}
	
	public int removeAt(int index) {
		
		int count = 0;
		
		if(index < size && size != 0) {
			T item = (T) list[index];
			count++;
			for(int i = index; i < list.length && list[i] != null; i++) {
				list[i] = list[i + 1];
				count++;
			}
			size--;
			count++;
			// return item;
		}
		return count;
	}
	
	public int indexOf(T value) {
		
		int count = 0;
		
		for(int i = 0; i < size; i++) {
			count++;
			if(value == list[i]) {
				return count;
			}
		}
		
		return count;
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
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public int getAtIndex(int index) {
		int count = 0;
		T value = (T) list[index];
		count++;
		return count;
	}
	
	@SuppressWarnings("unchecked")
	private int resizeList() {
		
		int count = 0;
		
		T[] newList = (T[]) new Object[list.length * 2];
		++count;
		
		for(int i = 0; i < list.length; i++) {
			newList[i] = (T) list[i];
			++count;
		}
		
		list = newList;
		count++;
		
		return count;
	}
	
	
}
