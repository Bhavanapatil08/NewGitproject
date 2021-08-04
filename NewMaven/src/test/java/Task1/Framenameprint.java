package Task1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Framenameprint 
{

	WebDriver driver;
	@BeforeSuite
	public void browser()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
		driver=new ChromeDriver();
	
	}
		@BeforeMethod
		public void url()
		{
			driver.get("https://the-internet.herokuapp.com/nested_frames");
		}
		@BeforeClass
		public void maximize()
		{
			driver.manage().window().maximize();
		}
		@Test(priority = 1)
		public void framename1() throws InterruptedException
		{
		   driver.switchTo().frame("frame-top");
		   driver.switchTo().frame("frame-left");
		   
		   WebElement text= driver.findElement(By.xpath("/html/body"));
		   String Frame1=text.getText();
		   System.out.println("Left Frame name is :-" +Frame1);
			

		}
		
		@Test(priority = 2)
		public void framename2() throws InterruptedException
		{
		   driver.switchTo().frame("frame-top");
		   driver.switchTo().frame("frame-middle");
		   
		   WebElement text1= driver.findElement(By.xpath("/html/body"));
		   String Frame2=text1.getText();
		   System.out.println("middle Frame name is :-" +Frame2);
			

		}
		
        @AfterMethod
    	public void capturescreenshot() throws IOException
    	{
      File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		
      FileUtils.copyFile(file, new File("D:\\Dataprovider\\abc1.jpj"));
    		
    		System.out.println("Screenshot taken successfully....");
    		
    	}
    	@AfterClass
    	public void deletcookie()
    	{
    		System.out.println("delet cooike");
    	}
    	  @AfterTest
    			public void conclose()
    			{
    				System.out.println("close...");
    			}

    		@AfterSuite
    			public void closedriver()
    			{
    				System.out.println("Success..");
    				driver.quit();
    			}
        
        

}
