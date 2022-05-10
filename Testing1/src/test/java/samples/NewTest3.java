package samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest3 {
  @Test(groups="Regression")
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\skarthika\\\\Downloads\\\\chromedriver_win32 (13)\\\\chromedriver.exe");
      WebDriver d1=new ChromeDriver();
      d1.get("http://www.leafground.com/");
  
  }
}
