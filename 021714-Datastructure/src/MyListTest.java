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
		
		ObjectUnderTest.append(new MyListElement("Bla", null));
		ObjectUnderTest.append(new MyListElement("Bla", null));
		ObjectUnderTest.append(new MyListElement("Bla", null));
		ObjectUnderTest.append(new MyListElement("Bla", null));
		
		assertEquals(4, ObjectUnderTest.getLength());
	}

}
