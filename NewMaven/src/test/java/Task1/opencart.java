package Task1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class opencart 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=common/home");
		driver.manage().window().maximize();

		WebElement register = driver.findElement(By.xpath("//*[@id='navbar-collapse-header']/div/a[2]"));
		register.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		boolean staus = driver.findElement(By.xpath("//*[@id='register']/div/div[1]/h3")).isDisplayed();
		
		System.out.println(staus);
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("QQQ");

		WebElement fname = driver.findElement(By.id("input-firstname"));
		fname.sendKeys("Bhavana");

		WebElement lname = driver.findElement(By.xpath("//*[@id='input-lastname']"));
		lname.sendKeys("patil");

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("bhavanap@gmail.com");

		WebElement country = driver.findElement(By.name("country_id"));
		Select s = new Select(country);
		s.selectByIndex(99);

		WebElement passw = driver.findElement(By.name("password"));
		passw.sendKeys("abc@123");

		driver.findElement(By.xpath("//div[1]/child::button")).click();
	}

}
