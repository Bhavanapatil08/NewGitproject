package com.Listners.Tasks;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Jpetlogin 
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
		driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=9FA599B3C3A477613A702A030D8F77E8?signonForm=");
	}
	@BeforeClass
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void getcookie()
	{
		Set<Cookie>s=driver.manage().getCookies();
		System.out.println("Count of cookies:: "+s.size());
	}
	@Test(dataProvider = "logindata")
	public void login(String uname,String pass)
	{
		
		
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals("JPetStore Demo",title);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pass);
		driver.findElement(By.cssSelector("input[name=\"signon\"]")).click();
	
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