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
		assertEquals(0, ObjectUnderTest.capacity());
	}

	@Test
	public void testGetElement() {
		fail("Not yet implemented");
	}

	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testCapacity() {
		fail("Not yet implemented");
	}

	@Test
	public void testPushBack() {

	}

	@Test
	public void testPopFront() {
		fail("Not yet implemented");
	}

}
