
public interface IList {
	public IListElement getHead();
	public IListElement getTail();
	public void append (IListElement toAppend);
	public IListElement[] toArray();
	public int getLength();
}
