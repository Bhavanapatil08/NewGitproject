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
import org.openqa.selenium.chrome.ChromeOptions;

public class windowhandlingnaukari {

		public static void main(String[] args) throws InterruptedException 
		{
			
			
			ChromeOptions option =new ChromeOptions();
			option.addArguments("--disable--Notifications");
			System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver(option);
			
			driver.manage().window().maximize();
			
			driver.get("https://www.naukri.com/");//path of google page
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	        
	        //Total no of hyperlink in web page
	        
	        List<WebElement>al=driver.findElements(By.tagName("a"));
	        int count =al.size();
	        System.out.println("Total no of hyperlink:: "+count);
	        
	        //footer hyperlink
	        
	        WebElement footerhyp=driver.findElement(By.xpath("//*[@id=\"root\"]/div[5]/div[1]"));
	        
	        List<WebElement>fls=footerhyp.findElements(By.tagName("a"));
	        int count1=fls.size();
	        System.out.println("footer hyperlink:: "+count1);
	        //perticular hyperlink
	        
	        WebElement particularhyp=driver.findElement(By.xpath("//*[@id=\"root\"]/div[5]/div[1]/div/div[1]/ul"));
	        
	        List<WebElement>pls=particularhyp.findElements(By.tagName("a"));
	        int countpl=pls.size();
	        System.out.println("particular List of hyperlink::"+countpl);
	        
	        for(int i=1;i<countpl;i++)
	        {
	       	 String linkkeys=Keys.chord(Keys.CONTROL,Keys.ENTER);
	       	 
	     	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       	 particularhyp.findElements(By.tagName("a")).get(i).sendKeys(linkkeys);
	       	 
	       	 Thread.sleep(2000);
	       	 
	        }
	        
	       // to handle window
	        
	        Set<String>s=driver.getWindowHandles();
	        System.out.println(s);
	        
	        ArrayList<String>all=new ArrayList<String>(s);
	        System.out.println(all);
	        
	        String key=all.get(1);
	        System.out.println(key);
	        
	       Iterator<String>itr=all.iterator();
	       while(itr.hasNext())
	       {
	       	String title =driver.switchTo().window(itr.next()).getTitle();
	       
	       	//String title=driver.getTitle();
	       	System.out.println(title);
	       	
	       	//Thread.sleep(2000);
	       }
	        
	       //driver.close(); 
	        
		}

	}


