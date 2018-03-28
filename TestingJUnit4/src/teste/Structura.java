package teste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Structura {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownBeforeClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("	setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("	tearDown");
	}

	@Test
	public void test1() {
		System.out.println("		Test1");
	}


	@Test
	public void test3() {
		System.out.println("		Test3");
	}
	
	@Test
	public void test2() {
		System.out.println("		Test2");
	}



}
