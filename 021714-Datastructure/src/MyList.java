
public class MyList implements IList {
	
	protected IListElement head = null;
	protected IListElement tail = null;
	
	@Override
	public IListElement getHead() {
		return head;
	}
	
	@Override
	public IListElement getTail() {
		return tail;
	}
	
	@Override
	public String toString() {
		return this.toArray().toString();
	}
	
	@Override
	public IListElement[] toArray() {
		IListElement[] asArray = new IListElement[this.getLength()];
		IListElement iterator = head;
		int index = 0;
		
		while(iterator != null) {
			asArray[index++] = iterator;
			iterator = iterator.getNext();
		}
		
		return asArray;
	}
	
	public int getLength() {
		IListElement iterator = head;
		int length = 0;
		
		while(iterator != null) {
			length++;
			iterator = iterator.getNext();
		}
		
		return length;
	}

	@Override
	public void append(IListElement toAppend) {
		
		// special case: first insert
		if(head == null && tail == null) {
			head = toAppend;
			tail = toAppend;
			return;
		}
		
		// keep in mind: 
		// order is important
		head.setNext(toAppend);
		head = toAppend;
	}
}
