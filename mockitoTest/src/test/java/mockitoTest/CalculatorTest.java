package mockitoTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class CalculatorTest {

	 Calculator c=null;
	 @Mock
	 CalculatorService service;
	 
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
		c=new Calculator(service);              //object ko build krega  and serive class is a dependency......
	
	}

	@After
	public void tearDown() throws Exception {
	}

	/*@Test
	public void testCalculator() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testadd()   // we can use testadd() also as well as testperform()...
	{
		//fail("Not yet implemented");
		//when(service.add(2,3)).thenReturn(5);
		//service.add(2,3);
		
		//c.add(2, 3);
		when(service.add(2,3)).thenReturn(10);
		assertEquals(10, c.add(2, 3));
		verify(service).add(2,3);
		
		
	}

}




