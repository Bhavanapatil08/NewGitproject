package Task1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//Use possible  webdriver methods on any websites(Create a seprate class for webdriver methods)

@Listeners(com.Listners.Tasks.Methods.ITestTask.class)
public class SampleWebDriver {
	WebDriver driver;
	@BeforeSuite
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	@BeforeTest
	public void url()
	{
		// get method
		driver.get("http://demowebshop.tricentis.com/login");
	}
	@BeforeClass
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "logindata")
	public void login(String uname,String pass)
	{
		// getTitle method
		String s=driver.getTitle();
		System.out.println("Title:: "+s);
		
		//get current url method
		String s1=driver.getCurrentUrl();
		System.out.println("CurrentUrl:: "+s1);
		
		//getpage source method
		String s2=driver.getPageSource();
		System.out.println(s2);
		
		Assert.assertEquals("http://demowebshop.tricentis.com/login", s1);
		
		// findElement method
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	@DataProvider(name="logindata")
	public Object[][] demo()
	{		
		return new Object[][]
		{
			{"bhavi@gmail.com","abc123"}
		};
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
