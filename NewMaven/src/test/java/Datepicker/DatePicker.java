package Datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions/");
		
		driver.findElement(By.xpath("//*[@id=\"travel_from\"]")).sendKeys("pune");
		driver.findElement(By.xpath("//*[@id=\"travel_to\"]")).sendKeys("Chhatrapati Shivaji International Airport (BOM) Mumbai");
		
		driver.findElement(By.xpath("//*[@id=\"travel_date\"]")).click();
		
		while(!driver.findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[1]/th[2]")).getText().equals("July 2021"))
		{
			driver.findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[1]/th[3]")).click();
		}
		List<WebElement> l=driver.findElements(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr/td"));
		
		for(WebElement s:l) 
		{
			if(s.getText().equals("1"))
				
			{
				s.click();
				break;
			}
		}
		
		//driver.findElement(By.xpath("//*[@id=\"datebetween\"]")).sendKeys("surat");

	}

}
