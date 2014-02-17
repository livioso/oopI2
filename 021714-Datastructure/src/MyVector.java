
public class MyVector implements IVector {
	
	private Object[] dataStore;
	
	public MyVector (int capacity) {
		dataStore = new Object[capacity];
	}
	
	public Object getElement (int index) {
		if(index < this.capacity()) {
			return dataStore[index];
		}
		else {
			return null;
		}
	}
	
	public int size () {
		int size = 0; 
		
		for(size = 0; size < this.capacity(); ++size) {
			if(this.getElement(size).equals(null)) {
				break;
			}
		}
		
		return size;
	}
	
	public int capacity () {
		return dataStore.length;
	}
	
	public void pushBack (Object p) {
		
		
	}
	
	public Object popFront () {
		
		return null;
	}
}
