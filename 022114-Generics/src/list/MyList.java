package list;

import list.IList;
import list.IListElement;


public class MyList<T extends Comparable<?>> implements IList<T> {
	
	protected IListElement<T> head = null;
	protected IListElement<T> tail = null;
	
	@Override
	public IListElement<T> getHead() {
		return head;
	}
	
	@Override
	public IListElement<T> getTail() {
		return tail;
	}
	
	public int getLength() {
		IListElement<T> iterator = tail;
		int length = 0;
		
		while(iterator != null) {
			length++;
			iterator = iterator.getNext();
		}
		
		return length;
	}

	@Override
	public void append(IListElement<T> toAppend){
		
		assert(null == toAppend.getNext());
		
		// special case: first insert
		if(head == null && tail == null) {
			head = toAppend;
			tail = toAppend;
			return;
		}
		
		// keep in mind: 
		// order is important
		head.setNext(toAppend);
		head = toAppend;
	}
	
	public static <E extends Comparable<E>> IListElement<E> getMaxElement (IListElement<E> list) {
		IListElement<E> iter = list;
		IListElement<E> max = iter;
		
		while (null != iter.getNext()) {
			iter = iter.getNext();
			if(max.compareTo(iter) > 0)  {
				max = iter;
			}
		}
		
		return max;
	}
}
