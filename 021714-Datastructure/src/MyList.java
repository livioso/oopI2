
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
	
	public int getLength() {
		IListElement iterator = tail;
		int length = 0;
		
		while(iterator != null) {
			length++;
			iterator = iterator.getNext();
		}
		
		return length;
	}

	@Override
	public void append(IListElement toAppend){
		
		assert(null == toAppend.getNext());
		
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
