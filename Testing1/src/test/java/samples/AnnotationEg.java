package samples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationEg {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		// DB - connect - setup for connecting to db
		System.out.println("DB connection");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("DB disconnect");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Print before test method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Print after test method");
	}

	@Test
	public void test() {
		System.out.println("Test method 1");
	}
	
	@Test
	public void test1() {
		System.out.println("Test method 2");
	}


}
