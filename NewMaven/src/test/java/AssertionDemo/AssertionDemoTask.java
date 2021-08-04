package AssertionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionDemoTask 
{
  WebDriver driver; 
  @Test
  public void test1()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/register");
	  driver.manage().window().maximize();
	  
	  
	  String title=driver.getTitle();
	 
	  Assertion as=new Assertion();
	  as.assertEquals("Demo Web Shop. Register",title);
		
	  
		   
		 
		  
	

    }
}
