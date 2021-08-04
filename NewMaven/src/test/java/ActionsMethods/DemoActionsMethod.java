package ActionsMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DemoActionsMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println("Title of webpage is : "+title);
		
		List<WebElement> ls=driver.findElements(By.tagName("a"));
		int count=ls.size();
		System.out.println("Total no of hyperlinks "+count);
		
		//Click
		WebElement retur=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		Actions action =new Actions(driver);
		action.doubleClick(retur).build().perform();
		driver.navigate().back();
		
//		//rightclick(Amazon pay)
//		WebElement amazonpay =driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]"));
//		Actions action1 =new Actions(driver);
//		Action rightclick=action1.contextClick(amazonpay).build();
//		rightclick.perform();
//		
		//MoveTo Element(signin)
		WebElement signin =driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		Actions action2 =new Actions(driver);
		action2.moveToElement(signin).build().perform();
		
		//search elemnt on site
		WebElement search =driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		Actions action3 =new Actions(driver);
		action3.sendKeys(search,"mobile").build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}
