package PropertiesFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class DemoProperties 
{
	public WebDriver driver;
	
	Properties pro=new Properties();
	
	@BeforeSuite
	public void openbrowser() throws IOException
	{
		FileInputStream file=new FileInputStream("D:\\java practical sessions\\NewMaven\\src\\test\\java\\PropertiesFiles\\parameters.property");
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
		
		Assertion as=new Assertion();
		
		@Test
		public void login()
		{
			String url=driver.getTitle();
			System.out.println("URL is :- " +url);
			
			   
			as.assertEquals("Welcome: Mercury Tours", url);
			
			driver.findElement(By.name("userName")).sendKeys(pro.getProperty("username"));
			driver.findElement(By.name("password")).sendKeys(pro.getProperty("password"));
			driver.findElement(By.name("submit")).click();
		
	    }

}
