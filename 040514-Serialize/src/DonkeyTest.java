import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DonkeyTest {
	
	/** Test donkey ;-) */
	private Donkey DonkeyUnderTest = new Donkey(0);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getAgeTest() {
		DonkeyUnderTest.setAge(11);
		assertEquals(11, DonkeyUnderTest.getAge());
	}
	
	@Test
	public void serializeDonkeyTest() {
		DonkeyUnderTest.setAge(11);
		assertEquals(11, DonkeyUnderTest.getAge());
	}

}