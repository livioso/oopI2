package myvector;

public interface IVector<T extends Comparable<?>> {
	public T getElement (int index);
	public int size ();
	public int capacity ();
	public void pushBack (T toPushBack);
	public T popFront ();
	public T getMaxElement ();
}
