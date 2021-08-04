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
public class LoginMT 
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
	  WebElement us=driver.findElement(By.name("userName"));
		us.sendKeys("Patil@gmail.com");
	
		
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("bhavana123");
				
	
		WebElement sub=driver.findElement(By.name("submit"));
		sub.click();
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
	
	
	
