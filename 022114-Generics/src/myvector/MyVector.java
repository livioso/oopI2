package myvector;

public class MyVector<T extends Comparable<?>> implements IVector<T> {
	
	private Object[] dataStore;
	
	public MyVector (int capacity) {
		dataStore = new Object[capacity];
	}
	
	// for unit testing only
	public Object[] getDataStore () {
		return dataStore;
	}
	
	public T getElement (int index) {
		if(index < this.capacity()) {
			return (T) dataStore[index];
		}
		else {
			return null;
		}
	}
	
	public int size () {
		int size = 0; 
		
		for(size = 0; size < this.capacity(); ++size) {
			if(this.getElement(size) == null) {
				break;
			}
		}
		
		return size;
	}
	
	public int capacity () {
		return dataStore.length;
	}
	
	public T popFront () {
		Object front = dataStore[0];
		
		// remove leading gap
		for(int i = 1; i < this.capacity(); i++) {
			dataStore[i - 1] = dataStore[i];
			dataStore[i] = null;
		}
		
		return (T) front;
	}

	@Override
	public void pushBack(T toPushBack) {
		int nextFreeIndex = this.size();
		dataStore[nextFreeIndex] = (Object) toPushBack;
		
	}

	@Override
	public T getMaxElement() {
		// TODO Auto-generated method stub
		return null;
	}
}
