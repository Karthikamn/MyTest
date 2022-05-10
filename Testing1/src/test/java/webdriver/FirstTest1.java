package webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest1 {

	WebDriver  driver;

	@BeforeClass
	public void before1() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\skarthika\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");

	
		driver=new ChromeDriver();


		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);



		driver.get("https://www.ilovepdf.com/word_to_pdf");


		






	}

	@Test
	public void firstscript() throws InterruptedException, AWTException {
/*
        driver.findElement(By.id("pickfiles")).click();
        
        Thread.sleep(5000);
        
        String file=("C:\\Users\\skarthika\\OneDrive - HCL Technologies Ltd\\Documents\\ws-certify+for+sap+v11.5.docx");

        StringSelection sc=new StringSelection(file);
        
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
        
        Robot r1=new Robot();
        
        r1.keyPress(KeyEvent.VK_CONTROL);
        r1.keyPress(KeyEvent.VK_V);
        r1.keyRelease(KeyEvent.VK_V);
        r1.keyRelease(KeyEvent.VK_CONTROL);
        r1.keyPress(KeyEvent.VK_ENTER);
        r1.keyRelease(KeyEvent.VK_ENTER);
        
        Thread.sleep(5000);
        
        driver.findElement(By.id("processTask")).click();
        
       driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
       */
                File f1=new File("C:\\Users\\skarthika\\Downloads");
        
        File[] total_files=f1.listFiles();
        
        for(File   find_file:total_files) {
        	if(find_file.getName().equals("ws-certify+for+sap+v11.5.pdf")) {
        		System.out.println("File is downloaded successfully");
        		break;
        	}
        }
        
        
        
        
        
        
        
	}

}
