package MultipleWindowHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlingdemo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");//path of google page
        driver.manage().window().maximize();
        List<WebElement>elements=driver.findElements(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li/a"));
    	System.out.println(elements.size());
    	
    	for(WebElement ele:elements)
    	{
    		String linkkey=Keys.chord(Keys.CONTROL,Keys.ENTER);
    		ele.sendKeys(linkkey);
    	}
    	Set<String>windowid=driver.getWindowHandles();
    	ArrayList<String> winlist=new ArrayList(windowid);

    	for(String list:winlist)
    	{
    		//System.out.println(list);
    		String title=driver.switchTo().window(list).getTitle();
    		System.out.println(title);
    		if(title.equalsIgnoreCase("REST API Tutorial"))
    		{
    			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ul/ul/li[1]/a")).click();
    		}
    	}
        /* String  t1 = winlist.get(0);
         String  t2 = winlist.get(1);
         String  t3 = winlist.get(2);
         String  t4 = winlist.get(3);
         String  t5 = winlist.get(4);
         
        String title1= driver.switchTo().window(t2).getTitle();
        System.out.println(title1);*/
    }
    
	}


