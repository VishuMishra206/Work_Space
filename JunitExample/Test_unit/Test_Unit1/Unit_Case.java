package Test_Unit1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import JunitTest.TestExample;

public class Unit_Case {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int a=1;
		int b=2;
		TestExample test1=new TestExample();
		int result=test1.Add(a, b);
		assertEquals(3, result);
		
	}
	@Test
	public void testAddString()
	{
		TestExample test2=new TestExample();
		String result=test2.AddString("manisha", "shah");
		assertEquals("manishashah",result);
		
	}
	

}
