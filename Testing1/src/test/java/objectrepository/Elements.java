package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {
	
	@FindBy(id="userName")
	public static WebElement  us;
	
	@FindBy(name="password")
	public static WebElement pswd;
	
	@FindBy(id="submitBtn")
	public static WebElement loginbutton;
	
	

	/*public static WebElement us(WebDriver driver) {
		return driver.findElement(By.id("userName"));
		
	}
	
	public static WebElement pswd(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement loginbutton(WebDriver driver) {
		
		return driver.findElement(By.id("submitBtn"));
	}*/
}
