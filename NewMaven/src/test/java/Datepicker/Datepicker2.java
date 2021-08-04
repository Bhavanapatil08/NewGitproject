package Datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oyorooms.com/");
		
		driver.findElement(By.xpath("/html/body")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/div/span[2]")).click();
		
		while(!driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/span/div/div/div[2]/div/span[1]/select")).getText().equals("September 2021"))
		{

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/span/div/div/div[4]/div")).click();
	
		}
        List<WebElement> l=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/span/div/div/div[3]/table/tbody/tr/td/span"));
		
		for(WebElement s:l) 
		{
			System.out.println(s.getText());
			
			if(s.getText().equals("16"))
				
			{
				s.click();
			}
		}
	
	
	
	
	
	}

}

//public static void main(String[] args) throws InterruptedException 
//{
//	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.makemytrip.com/hotels/");
//	
//	driver.findElement(By.xpath("/html/body")).click();
//	
//	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/label/p[1]")).click();
//	
//	while(!driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div")).getText().equals("September 2021"))
//	{
//
//	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
//
//	}
//    List<WebElement> l=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div/div/div"));
//	
//	for(WebElement s:l) 
//	{
//		System.out.println(s.getText());
//		
//		if(s.getText().equals("20"))
//			
//		{
//			s.click();
//		}
//	}
//
//
//
//
//
//}
