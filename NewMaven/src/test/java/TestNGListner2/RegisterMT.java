package TestNGListner2;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNGListner1.TestListnerlogin.class)
public class RegisterMT 
{
	WebDriver driver;
	@BeforeSuite
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	@BeforeTest
	public void openurl()
	{
		driver.get("http://demo.guru99.com/test/newtours/register.php");
	}
	
	@BeforeClass
	public void maximizebrowser()
	{
		driver.manage().window().maximize();
	}
  @Test
  public void M1() 
  {
	  driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Bhavana");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9876543289");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("bPatil@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Kadodara");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Surat");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Gujrat");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("413087");
		
		WebElement sel=driver.findElement(By.xpath("//select[@name=\"country\"]"));
		Select s=new Select(sel);
		s.selectByVisibleText("INDIA");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Patil@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("bhavana123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("bhavana123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
  }
  
  @AfterMethod
	public void capturescreenshot() throws IOException
	{
  File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
  FileUtils.copyFile(file, new File("D:\\Dataprovider\\abc2.jpj"));
		
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
