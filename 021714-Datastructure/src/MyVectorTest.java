import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyVectorTest {
	
	IVector ObjectUnderTest;

	@Before
	public void setUp() throws Exception {
		ObjectUnderTest = new MyVector(4);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMyVector() {
		ObjectUnderTest = new MyVector(4);
		
		assertEquals(4, ObjectUnderTest.capacity());
		assertEquals(0, ObjectUnderTest.size());
	}

	@Test
	public void testGetElement() {
		Object valueAdded = new Integer(1);
		ObjectUnderTest.pushBack(valueAdded);
		
		assertEquals(valueAdded, ObjectUnderTest.getElement(0));
	}

	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testCapacity() {
		ObjectUnderTest = new MyVector(4);
		assertEquals(4, ObjectUnderTest.capacity());
	}

	@Test
	public void testPushBack() {
		ObjectUnderTest.pushBack(new Integer(1));
		ObjectUnderTest.pushBack(new Double(2.0));
		
		assertEquals(2, ObjectUnderTest.size());
	}

	@Test
	public void testPopFront() {
		MyVector ObjectUnderTestPopFront = new MyVector(4);
		Object TestValue21 = new Integer(21);
		Object TestValue42 = new Integer(42);
		
		ObjectUnderTestPopFront.pushBack(TestValue21);
		ObjectUnderTestPopFront.pushBack(TestValue42);
		ObjectUnderTestPopFront.pushBack(TestValue21);
		ObjectUnderTestPopFront.pushBack(TestValue42);
		
		// verify we set up everything correctly
		Object[] expectedBeforeArray = {TestValue21, TestValue42, TestValue21, TestValue42};
		assertArrayEquals(expectedBeforeArray, ObjectUnderTestPopFront.getDataStore());
		
		// after popFront
		ObjectUnderTestPopFront.popFront();
		Object[] expectedAfterArray = {TestValue42, TestValue21, TestValue42, null};
		assertArrayEquals(expectedAfterArray, ObjectUnderTestPopFront.getDataStore());
	}

}
