package box;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoxTest {

	private Box<Integer> BoxUnderTest;
	
	@Before
	public void setUp() throws Exception {
		BoxUnderTest = new Box<Integer>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetGetValue() {
		BoxUnderTest.setValue(7);
		assertEquals(Integer.valueOf(7), (Integer)BoxUnderTest.getValue().intValue());
	}

}
