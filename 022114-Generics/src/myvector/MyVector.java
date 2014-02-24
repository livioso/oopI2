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
	
	@SuppressWarnings("unchecked")
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
	
	@SuppressWarnings("unchecked")
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
	@SuppressWarnings("unchecked")
	public T getMaxElement() {
		// empty data store
		if(this.size() == 0) {
			return null;
		}
		
		Object[] sortedDataStore = dataStore;
		java.util.Arrays.sort(sortedDataStore);
		return (T) sortedDataStore[sortedDataStore.length - 1];
	}
}
