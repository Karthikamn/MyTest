package functionality;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import objectrepository.Elements;

public class Login {

	@Test
	public void logintest() throws IOException {
		WebDriver driver;

		FileInputStream fi=new FileInputStream("src\\test\\java\\functionality\\Config.properties");

		Properties prop=new Properties();

		prop.load(fi);

		String browser_name=	prop.getProperty("browser");

		String path=prop.getProperty("driver_path");

		if(browser_name.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",path);

			driver=new ChromeDriver();


		}

		else if(browser_name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",path); 

		 driver=new FirefoxDriver();

		}

		else
		{
			System.setProperty("webdriver.ie.driver",path); 

			 driver=new InternetExplorerDriver();

		}

        driver.get("https://ksrtc.in/oprs-web/login/perform.do");
        
        driver.manage().window().maximize();

         driver.findElement(By.id("userName")).sendKeys("sdsdsd");
         
         driver.findElement(By.name("password")).sendKeys("dgshjgsj");
         
         driver.findElement(By.id("submitBtn")).click();
         
         File f1=new File("C:\\Users\\skarthika\\OneDrive - HCL Technologies Ltd\\Desktop\\desktop\\reports\\cookies.data");
        
         try {
        	 f1.createNewFile();
        	 
        	 FileWriter fw=new FileWriter(f1);
        	 
        	 BufferedWriter bw=new BufferedWriter(fw);
        	 
        	 for(Cookie ck:driver.manage().getCookies()) {
        		 
        		 bw.write((ck.getName()+";"+ ck.getPath()+";"+ck.getDomain()+";"+ck.getValue()+";"+ck.getExpiry()+";"+ck.isSecure()));
        	
        	      bw.newLine();
        	      
        	   
        	 }
        	 /*
        	 // single cookie info
        	  System.out.println(driver.manage().getCookieNamed("_gat"));
        	 
        	  // add Cookie
        	  Cookie ck1=new Cookie("cookie1","1234567");
        	  
        	  driver.manage().addCookie(ck1);
        	  
        	  //delete Cookie
        	  
        	  driver.manage().deleteAllCookies();
        	  
        	  driver.manage().deleteCookie(ck1);
        	  
        	  driver.manage().deleteCookieNamed("cookie1");
        	  
        	  
        	  */
        	 
        	 
        	  
        	  
        	  
        	  
        	 bw.close();
        	 fw.close();
        	 
        	
        	 Robot r1=new Robot();
        	 
        	Dimension sc_size= Toolkit.getDefaultToolkit().getScreenSize();
        	 
        	Rectangle rect=new Rectangle(sc_size);
        	
        	BufferedImage Source=r1.createScreenCapture(rect);
        	
        	File dest=new File("C:\\Users\\skarthika\\OneDrive - HCL Technologies Ltd\\Desktop\\desktop\\reports\\report2.jpeg");
        	
        	ImageIO.write(Source, "jpeg", dest);
        	
        	
        	
        	 
         }
         
         
         catch(Exception e) {
        	 System.out.println(e);
         }



	}







}
