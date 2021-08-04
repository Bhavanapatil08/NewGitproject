package Task1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DropDown 
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
			driver.get("https://demoqa.com/alerts");
		}
		@BeforeClass
		public void maximize()
		{
			driver.manage().window().maximize();
		}
		@Test
		public void dropdown() throws InterruptedException
		{
        
         //Scroll Page
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,300)");
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]")).click();
        
//        driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
//        
//        driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Bhavana");
//        
//        driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("abc@gmail.com");
//        
//        driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Karve Nagar");
//        
//        driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("Pune");
//        
//        driver.findElement(By.xpath("//*[@id='submit']")).click();
        
        driver.findElement(By.xpath("//*[@id=\"item-1\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]")).click();
        
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
//
//Pune Maharashtra