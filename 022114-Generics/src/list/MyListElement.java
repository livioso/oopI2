package list;
import list.IListElement;


public class MyListElement<T extends Comparable<?>> implements IListElement<T> {

	protected T value = null;
	IListElement<T> next = null;
	
	public MyListElement (T value, IListElement<T> next) {
		this.value = value;
		this.next = next;
	}
	
	@Override
	public T getValue() {
		return value;
	}

	@Override
	public IListElement<T> getNext() {
		return next;
	}

	@Override
	public void setNext(IListElement<T> next) {
		this.next = next;

	}

	@Override
	public boolean equals(T eq) {
		// TODO Auto-generated method stub
		return false;
	}
}
