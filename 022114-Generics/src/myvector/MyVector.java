package myvector;

public class MyVector<T extends Comparable<?>> implements IVector<T> {
	
	private Object[] dataStore;
	
	public MyVector (final int capacity) {
		dataStore = new Object[capacity];
	}
	
	// for unit testing only
	public Object[] getDataStore () {
		return dataStore; // NOPMD by livio on 2/24/14 10:43 AM
	}
	
	@SuppressWarnings("unchecked")
	public T getElement (final int index) {
		if(index < this.capacity()) {
			return (T) dataStore[index];
		}
		
		return null;
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
		final Object front = dataStore[0];
		
		// remove leading gap
		for(int i = 1; i < this.capacity(); i++) {
			dataStore[i - 1] = dataStore[i];
			dataStore[i] = null;
		}
		
		return (T) front;
	}

	@Override
	public void pushBack(final T toPushBack) {
		final int nextFreeIndex = this.size();
		dataStore[nextFreeIndex] = (Object) toPushBack;
		
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public T getMaxElement() {
		// empty data store
		if(this.size() == 0) { // NOPMD by livio on 2/24/14 10:41 AM
			return null;
		}
		
		final Object[] sortedDataStore = dataStore;
		java.util.Arrays.sort(sortedDataStore); // NOPMD by livio on 2/24/14 10:41 AM
		return (T) sortedDataStore[sortedDataStore.length - 1];
	}
}
