import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyListTest {
	
	IList ObjectUnderTest;

	@Before
	public void setUp() throws Exception {
		ObjectUnderTest = new MyList();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetHead() {
		assertEquals(null, ObjectUnderTest.getHead());
	}

	@Test
	public void testGetTail() {
		assertEquals(null, ObjectUnderTest.getTail());
	}
	
	@Test
	public void testGetHeadAppend() {
		IListElement first = new MyListElement("first", null);
		ObjectUnderTest.append(first);
		
		assertEquals(first, ObjectUnderTest.getHead());
	}

	@Test
	public void testGetTailAppend() {
		IListElement first = new MyListElement("first", null);
		ObjectUnderTest.append(first);
		
		assertEquals(first, ObjectUnderTest.getTail());
	}
	
	@Test
	public void testAppend() {
		IListElement first = new MyListElement("first", null);
		IListElement second = new MyListElement("second", null);
		ObjectUnderTest.append(first);
		ObjectUnderTest.append(second);
		
		assertEquals(first, ObjectUnderTest.getTail());
		assertEquals(second, ObjectUnderTest.getHead());
		
		assertEquals(second, first.getNext());
	}
	
	@Test
	public void testAppendWithThree() {
		IListElement first = new MyListElement("first", null);
		IListElement second = new MyListElement("second", null);
		IListElement third = new MyListElement("third", null);
		
		ObjectUnderTest.append(first);
		ObjectUnderTest.append(second);
		ObjectUnderTest.append(third);
		
		assertEquals(first, ObjectUnderTest.getTail());
		assertEquals(third, ObjectUnderTest.getHead());
		
		assertEquals(second, first.getNext());
		assertEquals(third, second.getNext());
		assertEquals(null, third.getNext());
	}

	@Test
	public void testToArray() {
		IListElement first = new MyListElement("first", null);
		IListElement second = new MyListElement("second", null);
		
		ObjectUnderTest.append(first);
		ObjectUnderTest.append(second);
		
		IListElement[] expected = {first, second};
		assertArrayEquals(expected, ObjectUnderTest.toArray());
	}

	@Test
	public void testGetLength() {
		assertEquals(0, ObjectUnderTest.getLength());
		
		IListElement first = new MyListElement("first", null);
		IListElement second = new MyListElement("second", null);
		IListElement third = new MyListElement("third", null);
		
		ObjectUnderTest.append(first);
		ObjectUnderTest.append(second);
		ObjectUnderTest.append(third);
		
		assertEquals(3, ObjectUnderTest.getLength());
	}

}
