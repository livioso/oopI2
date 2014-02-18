
public class MyListElement implements IListElement {

	protected Object value = null;
	IListElement next = null;
	
	public MyListElement (Object value, IListElement next) {
		this.value = value;
		this.next = next;
	}
	
	@Override
	public Object getValue() {
		return value;
	}

	@Override
	public IListElement getNext() {
		return next;
	}

	@Override
	public void setNext(IListElement next) {
		this.next = next;

	}
}
