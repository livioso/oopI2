
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
		
		return asArray;
	}
	
	public int getLength() {
		IListElement iterator = head;
		int length = 0;
		
		while(head != null) {
			length++;
			head = head.getNext();
		}
		
		return length;
	}
}
