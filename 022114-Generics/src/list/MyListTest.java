package list;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyListTest {
	
	IList<String> ObjectUnderTest;

	@Before
	public void setUp() throws Exception {
		ObjectUnderTest = new MyList<String>();
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
		IListElement<String> first = new list.MyListElement<String>("first", null);
		ObjectUnderTest.append(first);
		
		assertEquals(first, ObjectUnderTest.getHead());
	}

	@Test
	public void testGetTailAppend() {
		IListElement<String> first = new MyListElement<String>("first", null);
		ObjectUnderTest.append(first);
		
		assertEquals(first, ObjectUnderTest.getTail());
	}
	
	@Test
	public void testAppend() {
		IListElement<String> first = new MyListElement<String>("first", null);
		IListElement<String> second = new MyListElement<String>("second", null);
		ObjectUnderTest.append(first);
		ObjectUnderTest.append(second);
		
		assertEquals(first, ObjectUnderTest.getTail());
		assertEquals(second, ObjectUnderTest.getHead());
		
		assertEquals(second, first.getNext());
	}
	
	@Test
	public void testAppendWithThree() {
		IListElement<String> first = new MyListElement<String>("first", null);
		IListElement<String> second = new MyListElement<String>("second", null);
		IListElement<String> third = new MyListElement<String>("third", null);
		
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
	public void testGetLength() {
		assertEquals(0, ObjectUnderTest.getLength());
		
		IListElement<String> first = new MyListElement<String>("first", null);
		IListElement<String> second = new MyListElement<String>("second", null);
		IListElement<String> third = new MyListElement<String>("third", null);
		
		ObjectUnderTest.append(first);
		ObjectUnderTest.append(second);
		ObjectUnderTest.append(third);
		
		assertEquals(3, ObjectUnderTest.getLength());
	}

}
