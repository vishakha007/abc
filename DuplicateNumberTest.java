package abc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DuplicateNumberTest {
	int v1, v2;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	v1=3;
	v2=5;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int add=v1+v2;
		assertTrue(add==8);
		//fail("Not yet implemented");
	}

}
