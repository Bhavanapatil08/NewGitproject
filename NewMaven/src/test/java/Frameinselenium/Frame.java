package Frameinselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://javascript.info/mouse-drag-and-drop");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
	
		List<WebElement> ls=driver.findElements(By.tagName("iframe"));
		int count=ls.size();
		System.out.println(count);
		
		//Frame
		WebElement wb=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[11]/div[2]/div[1]/iframe"));
		driver.switchTo().frame(wb);
		Actions action =new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//*[@id=\"ball\"]"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"gate\"]"));
		
		
		action.dragAndDrop(source, target).build().perform();
		
		//back to our page
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.quit();
	
	}
}
