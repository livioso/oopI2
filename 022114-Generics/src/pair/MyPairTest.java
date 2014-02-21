package pair;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyPairTest {
	
	private IMyPair<Integer, String> ObjectUnderTest = null;

	@Before
	public void setUp() throws Exception {
		ObjectUnderTest = new MyPair<Integer, String>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@SuppressWarnings("rawtypes")
	public void testSetKeyValue() {
		ObjectUnderTest.setKeyValue(0xFF, "Sepp");
		
		assertEquals(0xFF, ((MyPair)ObjectUnderTest).key);
		assertEquals("Sepp", ((MyPair)ObjectUnderTest).value);
	}

	@Test
	public void testGetValue() {
		ObjectUnderTest.setKeyValue(0xFF, "Sepp");
		assertEquals("Sepp", ObjectUnderTest.getValue());
	}

}
