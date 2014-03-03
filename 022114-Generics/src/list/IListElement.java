package list;

public interface IListElement<T extends Comparable<?>> {
	public T getValue ();
	public IListElement<T> getNext ();
	public void setNext (IListElement<T> next);
	public boolean equals (T eq);
	int compareTo(IListElement<T> o);
}
