package Task1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop
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
		driver.get("https://jqueryui.com/droppable/");
	}
	@BeforeClass
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	@Test
	public void draganddrop()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
	
		List<WebElement> ls=driver.findElements(By.tagName("iframe"));
		int count=ls.size();
		System.out.println(count);
		
		//Frame
		WebElement wb=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(wb);
		Actions action =new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		//
		action.dragAndDrop(target, source).build().perform();
		
		//back to our page
		//driver.switchTo().defaultContent();
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