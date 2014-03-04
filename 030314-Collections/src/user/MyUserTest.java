package user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyUserTest {
	
	private IMyUser classUnderTest;

	@Before
	public void setUp() throws Exception {
		classUnderTest = new MyUser("", 0, 0);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testCreate () {
		classUnderTest = new MyUser("BlaBlaBla", 123, 456);
		
		assertEquals("BlaBlaBla", classUnderTest.getName());
		assertEquals(123, classUnderTest.getAge());
		assertEquals(456, classUnderTest.getMatNumber());
	}
	
	@Test
	public void testEquals() {
		IMyUser equals = new MyUser("", 0, 0);
		equals.setAge(23);
		
		classUnderTest.setAge(23);
		assertTrue(equals.equals(classUnderTest));
	}

	@Test
	public void testCompareTo() {
		IMyUser compared = new MyUser("Sepp", 0, 0);
		compared.setAge(23);
		
		classUnderTest.setAge(23);
		assertEquals(0, classUnderTest.compareTo(compared));
		
		classUnderTest.setAge(24);
		assertEquals(1, classUnderTest.compareTo(compared));
		
		classUnderTest.setAge(21);
		assertEquals(-1, classUnderTest.compareTo(compared));
	}

	@Test
	public void testSetName() {
		classUnderTest.setName("Sepp Blatter");
		assertEquals("Sepp Blatter", classUnderTest.getName());
	}

	@Test
	public void testGetName() {
		classUnderTest.setName("Sepp Blatter");
		assertEquals("Sepp Blatter", classUnderTest.getName());
	}

	@Test
	public void testSetAge() {
		classUnderTest.setAge(101);
		assertEquals(101, classUnderTest.getAge());
	}

	@Test
	public void testGetAge() {
		classUnderTest.setAge(101);
		assertEquals(101, classUnderTest.getAge());
	}

	@Test
	public void testSetMatNumber() {
		classUnderTest.setMatNumber(101);
		assertEquals(101, classUnderTest.getMatNumber());
	}

	@Test
	public void testGetMatNumber() {
		classUnderTest.setMatNumber(101);
		assertEquals(101, classUnderTest.getMatNumber());
	}

	@Test
	public void testToString() {
		classUnderTest.setName("Sepp Blatter");
		classUnderTest.setAge(111);
		classUnderTest.setMatNumber(101);
		
		assertEquals(classUnderTest.toString(), "Sepp Blatter(111) has MatNumber 101");
	}

}
