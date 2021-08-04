package AssertionDemo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
WebDriver driver;
  @Test
  public void test1()
  {
	    System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
	    Assertion as=new Assertion();
		//driver.get("http://demo.guru99.com/test/newtours/");
		// driver.navigate().back();
		   
		 
		  
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.navigate().to("http://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		   
		as.assertEquals("Demo Web Shop", title);
		  
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("dnyane122");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).click();
		System.out.println("login sucefully");

    }
 
  }
