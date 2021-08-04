package Task1;

import java.io.File;
import java.io.IOException;

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
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.Listners.Tasks.Methods.ITestTask.class)
public class checkboxesandrdiobutns
{
	
	
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
		driver.get("https://jqueryui.com/checkboxradio/");
	}
	@BeforeClass
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	@Test
	public void box()
	{
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[1]")).click();
		driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[2]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[3]/span[1]")).click();
	}
//	@AfterMethod
//	public void capturescreenshot() throws IOException
//	{
//  File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//  FileUtils.copyFile(file, new File("D:\\Dataprovider\\abc1.jpj"));
//		
//		System.out.println("Screenshot taken successfully....");
//		
//	}
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