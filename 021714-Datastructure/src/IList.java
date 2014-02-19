
public interface IList {
	public IListElement getHead();
	public IListElement getTail();
	public void append (IListElement toAppend);
	public int getLength();
}
