package list;

public interface IList<T extends Comparable<?>>{
	public IListElement<T> getHead();
	public IListElement<T> getTail();
	public void append (IListElement<T> toAppend);
	public int getLength();
}
