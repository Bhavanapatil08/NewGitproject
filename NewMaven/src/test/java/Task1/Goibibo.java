package Task1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Goibibo 
{
	WebDriver driver;
	@BeforeSuite
	public void browser()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
		driver=new ChromeDriver();
	
	}
		@BeforeMethod
		public void url()
		{
			driver.get("https://www.goibibo.com/hotels/");
		}
		@BeforeClass
		public void maximize()
		{
			driver.manage().window().maximize();
		}
		@Test
		public void goibibo1() throws InterruptedException
		{
			
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section/div[1]/div/div[1]/div[1]/input")).click();
			
			driver.findElement(By.xpath("//*[@id=\"downshift-1-input\"]")).click();
			
			//driver.findElement(By.xpath("//*[@id=\"downshift-1-menu\"]/div/ul/li[6]/div")).click();
			
			driver.findElement(By.xpath("//*[@id=\"downshift-1-input\"]")).sendKeys("Pune");
		
			
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[1]/h4")).click();
			
//			//month and year
			while(!driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/section/div/div[1]/div[1]/span[2]")).getText().equals("July 2021"))
			{
				//next year
				driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/section/div/div[2]/div[1]/span[2]")).click();
				
			}
			//all webelements from table
			List<WebElement> l=driver.findElements(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/section/div/div[1]/div[2]/div/ul/li/span"));
			
			for(WebElement s:l) 
			{
				if(s.getText().equals("28"))
					
				{
					s.click();
				}
			}
        
		}
		
        @AfterMethod
    	public void capturescreenshot() throws IOException
    	{
      File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		
      FileUtils.copyFile(file, new File("D:\\Dataprovider\\abc1.jpj"));
    		
    		System.out.println("Screenshot taken successfully....");
    		
    	}
    	@AfterClass
    	public void deletcookie()
    	{
    		System.out.println("delet cooike");
    	}
    	  @AfterTest
    			public void conclose()
    			{
    				System.out.println("close...");
    			}

    		@AfterSuite
    			public void closedriver()
    			{
    				System.out.println("Success..");
    				driver.quit();
    			}
}
