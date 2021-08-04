package TestNGDataProvider;

                                                                                                                                                        import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo 
{
	WebDriver driver;
	
	@BeforeSuite
	public void m2()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void m3()
	{
		driver.get("http://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	}
	
  @Test(dataProvider = "logindata")
  public void login(String username,String pass) throws InterruptedException 
  {
	  
	driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys(pass);
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();

	Thread.sleep(5000);
	  
  }
  
  @DataProvider(name="logindata")
  public Object[][] datapriverdemo()
  {
	  
	 return new Object[][]
			 {
		 
		 {"bhavi@gmail.com","abc123"},
		 {"bhavana@gmail.com","abc1234"},
		 {"bhavii1234@gmail.com","123456"},
		 {"fal@gmail.com","123456"},
		 {"abc0807@gmail.com","12345678"}
		 
			 };
  }
  @AfterMethod
	public void capturescreenshot() throws IOException
	{
    File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
    FileUtils.copyFile(file, new File("D:\\Dataprovider\\abc.jpj"));
		
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
