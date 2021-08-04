package JavaScriptDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ksrtc.in/oprs-web/");
        driver.manage().window().maximize();
        
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("alert('')");
        
        //Scroll Page
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,300)");
        
        //Leaving from
        WebElement cityname=driver.findElement(By.id("fromPlaceName"));
        cityname.sendKeys("BENG");
        
        JavascriptExecutor js1=(JavascriptExecutor)driver;
        String jcityname="return document.getElementById(\"fromPlaceName\").value;";
        String citynm=(String)js1.executeScript(jcityname);
        System.out.println("cityname :-" +citynm);
        
        while(!citynm.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
        {
        	Thread.sleep(2000);
        	cityname.sendKeys(Keys.DOWN);
            jcityname="return document.getElementById(\"fromPlaceName\").value;";
            citynm=(String)js1.executeScript(jcityname);
            
            System.out.println("Loop :-" +citynm);
        }
        driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
        
        
        
        
        //Going to
        
        WebElement cityname1= driver.findElement(By.id("toPlaceName"));
        cityname1.sendKeys("COIM");
        
        JavascriptExecutor js2=(JavascriptExecutor)driver;
        String jcityname1="return document.getElementById(\"toPlaceName\").value;";
        String cityname11=(String)js2.executeScript(jcityname1);
        System.out.println("cityname :-" +cityname11);
        
        while(!cityname11.equalsIgnoreCase("COIMBATORE"))
        {
        	Thread.sleep(2000);
        	cityname1.sendKeys(Keys.DOWN);
            jcityname1="return document.getElementById(\"toPlaceName\").value;";
            cityname11=(String)js2.executeScript(jcityname1);
            
            System.out.println("Loop :-" +cityname11);
        }
        driver.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);
        
       
        
        //datepicker
        
        driver.findElement(By.xpath("//*[@id=\"txtJourneyDate\"]")).click();
		
		//month and year
		while(!driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText().equals("July 2021"))
		{
			//next year
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			
		}
		//all webelements from table
		List<WebElement> l=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		
		for(WebElement s:l) 
		{
			if(s.getText().equals("28"))
				
			{
				s.click();
				break;
			}
		}
       
		driver.findElement(By.xpath("//*[@id=\"txtReturnJourneyDate\"]")).click();
		
		//month and year
		while(!driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText().equals("August 2021"))
		{
			//next year
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			
		}
		//all webelements from table
		List<WebElement> l1=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		
		for(WebElement s:l1) 
		{
			if(s.getText().equals("1"))
				
			{
				s.click();
				break;
			}
		}
		driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div[2]/div[2]/div/div[3]/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div[2]/div[3]/button")).click();
		System.out.println("Booking Sucessfully");
}
}
