package webdemoshpscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebshop
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("patilb@ggmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("abc@123");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/a/img")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
		
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"product_attribute_72_5_18_65\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"product_attribute_72_6_19_55\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"product_attribute_72_8_30_93\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-72\"]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}
}
