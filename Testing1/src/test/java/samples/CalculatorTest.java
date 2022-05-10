package samples;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;


@Ignore
public class CalculatorTest {
	
	Calculator calc=new Calculator();

	
	@Test //metadata - the below code information is given - non-executable line
	public void testAdd1() {
		assertEquals(10,calc.add1(5, 5));
		
	}
    @Ignore
	@Test
	public void testSub1() {
	assertEquals(1,calc.sub1(5,4));	
	}
    
    
    @Test //metadata - the below code information is given - non-executable line
	public void testAdd2() {
		assertEquals(10,calc.add1(5, 5));
		
	}

}
