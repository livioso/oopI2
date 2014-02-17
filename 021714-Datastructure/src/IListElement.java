public interface IListElement {
	public Object getValue ();
	public IListElement getNext ();
	public void setNext (IListElement next);
	public boolean equals (Object eq);
}
