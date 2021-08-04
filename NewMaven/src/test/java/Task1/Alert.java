package Task1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alert
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
			driver.get("https://demoqa.com/alerts");
		}
		@BeforeClass
		public void maximize()
		{
			driver.manage().window().maximize();
		}
	
	
		@Test
		public void alert() throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
			driver.switchTo().alert().accept();
			
			
			
			driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
			
			
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(6000);
			
			driver.switchTo().alert().accept();
			
		
			
			
			driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
			driver.switchTo().alert().dismiss();
			
			driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
			driver.switchTo().alert().sendKeys("Bhavana");
			driver.switchTo().alert().accept();
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



