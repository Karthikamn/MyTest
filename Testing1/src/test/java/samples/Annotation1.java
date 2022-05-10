package samples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation1 {
	
  @Test
  public void registration() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\skarthika\\\\Downloads\\\\chromedriver_win32 (13)\\\\chromedriver.exe");
      WebDriver d1=new ChromeDriver();
      d1.get("http://demo.automationtesting.in/Register.html");
  
  }
  
  @Test
  public void login() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\skarthika\\\\Downloads\\\\chromedriver_win32 (13)\\\\chromedriver.exe");
      WebDriver d1=new ChromeDriver();
      d1.get("http://www.leafground.com/");
  
  }
  
 
  /*
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("executes before test method f() & g()");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("executes after test method f()& g()");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("executes before Annotation1 class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("executes after  Annotation1 class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("executes before test method named Test in suite file");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("executes after test method named Test in suite file");
  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("executes before suite named Suite in suite file");
  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("executes after suite named Suite in suite file");
  
  }*/

}
