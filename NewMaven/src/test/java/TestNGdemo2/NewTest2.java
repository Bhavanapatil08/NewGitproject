package TestNGdemo2;

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
import org.testng.annotations.Test;

public class NewTest2 {
	
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
		driver.get("http://demowebshop.tricentis.com/register");
	}
	
	@BeforeClass
	public void maximizebrowser()
	{
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void getCookies()
	{
        Set<Cookie> cookies=driver.manage().getCookies();
		
		int count = cookies.size();
		System.out.println("Total cookies are:"+count);
		
		for (Cookie cookie : cookies) {
			
			String name = cookie.getName();
			System.out.println("Name of cookie:"+name);
			
			String domain = cookie.getDomain();
			System.out.println("Domain of cookie:"+domain);
			
			String path = cookie.getPath();
			System.out.println("path of cookie:"+path);
			
			boolean secure = cookie.isSecure();
			System.out.println("Secure:"+secure);
			
			boolean htt = cookie.isHttpOnly();
			System.out.println("http only valid:"+htt);
	    }
  }

	
	
	
  @Test
  public void M1() 
  {
	  driver.findElement(By.cssSelector("input[id=\"gender-female\"]")).click();
		
	    driver.findElement(By.cssSelector("input[id=\"FirstName\"]")).sendKeys("Bhavana");
	    
	    driver.findElement(By.cssSelector("input[id=\"LastName\"]")).sendKeys("Patil");	
	    
	    driver.findElement(By.cssSelector("input[id=\"Email\"]")).sendKeys("Patil@gmail.com");
	    
	    driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("bhavana123");
	    
		driver.findElement(By.cssSelector("input[id=\"ConfirmPassword\"]")).sendKeys("bhavana123");
		
		driver.findElement(By.cssSelector("input[id=\"register-button\"]")).click();
		
  }
  
//  @AfterMethod
//	public void capturescreenshot() throws IOException
//	{
//      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(src, new File("E:\\SS\\Demoshopss.jpg"));
//		
//		System.out.println("Screenshot taken successfully....");
//		
//	}

//	@AfterClass
//	public void deletecookie()
//	{
//		driver.manage().deleteCookieNamed("__utma");
//		
//		Set<Cookie> cookies1=driver.manage().getCookies();
//		
//		int count1=cookies1.size();
//		
//		System.out.println("New count"+count1);
//	}
	@AfterTest
	public void conclose()
	{
		System.out.println("close...");
	}
	

//	@AfterSuite
//	public void closedriver()
//	{
//		System.out.println("Success..");
//		driver.quit();
//	}
	
	
	
	
	
}
