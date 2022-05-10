package samples;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest1 {
	
	Calculator calc=new Calculator();

  @Test(dataProvider="dpadd")
  public void add1(int a, int b, int exp_value) {
	  
	Assert.assertEquals(calc.add1(a, b),exp_value);
	
	System.out.println(Thread.currentThread().getId());
  
  }
  
  @DataProvider(name="dpadd")
  public Object[][] g1(){
	  Object[][] t1=new Object[][] {
		  {3,3,6},
		  {6,7,13},
		  {9,9,18},
		  {10,10,30},
		  {4,6,10}
		  
	  };
	  return t1;
  }

  
}
