package mercurytours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestMercuryTours 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Bhavana");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9876543289");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("bPatil@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Kadodara");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Surat");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Gujrat");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("413087");
		
		WebElement sel=driver.findElement(By.xpath("//select[@name=\"country\"]"));
		Select s=new Select(sel);
		s.selectByVisibleText("INDIA");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Patil@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("bhavana123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("bhavana123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(150000);

		driver.quit();

	}


}
