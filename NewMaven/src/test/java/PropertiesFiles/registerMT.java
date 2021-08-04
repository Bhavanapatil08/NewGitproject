package PropertiesFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class registerMT 
{
	public WebDriver driver;
	
	Properties pro=new Properties();
	
	@BeforeSuite
	public void openbrowser() throws IOException
	{
		FileInputStream file=new FileInputStream("D:\\java practical sessions\\NewMaven\\src\\test\\java\\PropertiesFiles\\RegisterMT.property");
		pro.load(file);
		
		System.out.println("Open Browser");
		
		System.out.println("URL== "+pro.getProperty("url"));
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
		
		driver=new ChromeDriver();
		System.out.println("Open Browser Sucessfully");
	}

		@BeforeTest
		public void enterUrl()
		{
			System.out.println("Enter URL");
			driver.get(pro.getProperty("url"));
		}
		
		@Test
		public void DemoRegisterMT()
		{
			
			
			driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys(pro.getProperty("firstName"));
			
			driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys(pro.getProperty("lastName"));
			
			driver.findElement(By.cssSelector("input[name='phone']")).sendKeys(pro.getProperty("phone"));
			
			driver.findElement(By.cssSelector("input[name='userName']")).sendKeys(pro.getProperty("userName"));
			
			driver.findElement(By.cssSelector("input[name='address1']")).sendKeys(pro.getProperty("address1"));
			
			driver.findElement(By.cssSelector("input[name='city']")).sendKeys(pro.getProperty("city"));
			
			driver.findElement(By.cssSelector("input[name='state']")).sendKeys(pro.getProperty("state"));
			
	    	driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys(pro.getProperty("postalCode"));
			
			WebElement sel=driver.findElement(By.cssSelector("select[name='country']"));
			Select s=new Select(sel);
			s.selectByVisibleText(pro.getProperty("country"));
			
			driver.findElement(By.cssSelector("input[name='email']")).sendKeys(pro.getProperty("email"));
			
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys(pro.getProperty("password"));
			
			driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys(pro.getProperty("confirmPassword"));
			
			driver.findElement(By.cssSelector("input[name='submit']")).click();
			
	
	    }
		 @AfterMethod
			public void capturescreenshot() throws IOException
			{
		  File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		  FileUtils.copyFile(file, new File("D:\\Dataprovider\\abc1.jpj"));
				
				System.out.println("Screenshot taken successfully....");
				
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

