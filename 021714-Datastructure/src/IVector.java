public interface IVector {
	public Object getElement (int index);
	public int size ();
	public int capacity ();
	public void pushBack (Object p);
	public Object popFront ();
}
