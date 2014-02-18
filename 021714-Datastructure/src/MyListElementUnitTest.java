import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyListElementUnitTest {

	public final String OBJECTUNDERTEST_VALUE = "BlaBla";
	IListElement ObjectUnderTest;
	
	@Before
	public void setUp() throws Exception {
		ObjectUnderTest = new MyListElement(OBJECTUNDERTEST_VALUE, null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetValue() {
		assertEquals(OBJECTUNDERTEST_VALUE, ObjectUnderTest.getValue());
	}

	@Test
	public void testGetNext() {
		IListElement next = new MyListElement("SomeValue", null);
		ObjectUnderTest.setNext(next);
		assertEquals(next, ObjectUnderTest.getNext());
	}

	@Test
	public void testSetNext() {
		IListElement next = new MyListElement("SomeValue", null);
		ObjectUnderTest.setNext(next);
		assertEquals(next, ObjectUnderTest.getNext());
	}
}
