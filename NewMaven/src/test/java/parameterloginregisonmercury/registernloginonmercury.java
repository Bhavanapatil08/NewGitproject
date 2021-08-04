package parameterloginregisonmercury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class registernloginonmercury 
{
	WebDriver driver;
	@BeforeSuite
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
         driver=new ChromeDriver();
		
	}
	@Test
	@Parameters({"val1","val2","val3","val4","val5","val6","val7","val8","val9","val10","val11","val12"})
	public void register(String val1,String val2,String val3,String val4,String val5,String val6,String val7,String val8,
			String val9,String val10,String val11,String val12)
	{
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys(val1);
		
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys(val2);
		
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys(val3);
		
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys(val4);
		
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys(val5);
		
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys(val6);
		
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys(val7);
		
    	driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys(val8);
		
		WebElement sel=driver.findElement(By.cssSelector("select[name='country']"));
		Select s=new Select(sel);
		s.selectByVisibleText(val9);
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys(val10);
		
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(val11);
		
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys(val12);
		
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		
		
	}

	 @Test(priority=1, dependsOnMethods={"register"})
	@Parameters({"username1","pass"})
	public void Login(String username1,String pass)
	{
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username1);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
	}
}
