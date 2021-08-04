package Taskofdataprovider;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class registernlogin
{
WebDriver driver;
	
	@BeforeSuite
	public void m2()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}//System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	
@Test(dataProvider = "registerdata")
  public void register(String val1,String val2,String val3,String val4,String val5,String val6,String val7,
		  String val8,String val9,String val10,String val11,String val12,String val13,String val14,String val15) throws InterruptedException 
  {
	driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
	driver.manage().window().maximize();
	 
	    driver.findElement(By.xpath("//input[@name='username']")).clear();
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(val1);
	    
	    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[2]/td[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[2]/td[2]/input")).sendKeys(val2);
		
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input")).sendKeys(val3);
		
		
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[1]/td[2]/input")).sendKeys(val4);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[2]/td[2]/input")).sendKeys(val5);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[3]/td[2]/input")).sendKeys(val6);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[4]/td[2]/input")).sendKeys(val7);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[5]/td[2]/input")).sendKeys(val8);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[5]/td[2]/input")).sendKeys(val9);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[7]/td[2]/input")).sendKeys(val10);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[8]/td[2]/input")).sendKeys(val11);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[9]/td[2]/input")).sendKeys(val12);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[10]/td[2]/input")).sendKeys(val13);
		
		WebElement sel=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[1]/td[2]/select"));
		Select s=new Select(sel);
		s.selectByVisibleText(val14);
		
		WebElement sele=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select"));
		Select s1=new Select(sele);
		s1.selectByVisibleText(val15);
		
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[3]/td[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[4]/td[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();

	Thread.sleep(5000);
	  
  }
  
  @DataProvider(name="registerdata")
  public Object[][] datapriverdemo()
  {
	  
	 return new Object[][]
			 {
		 
		 {"bhavanap","bhavi123","bhavi123","Bhavana","Patil","bPatil@gmail.com","9876543289","Kadodara","pune","pune",
			 "Gujrat","413434","INDIA","japanese","DOGS"
		},
		 {"bhavana","bhavi12","bhavi12","Bhavanaa","Paatil","bPatill@gmail.com","9846543289","Kadodara","pune","pune",
			 "Gujrat","413434","INDIA","japanese","DOGS"
		 }
		     };
  }
  @Test(dataProvider = "logindata")
  public void login(String username,String pass) throws InterruptedException 
  {
	driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	driver.findElement(By.xpath("//input[@name='signon']")).click();

	Thread.sleep(5000);
	  
  }
  
  @DataProvider(name="logindata")
  public Object[][] datapriverdemo1()
  {
	  
	 return new Object[][]
			 {
		 
		 {"bhavanap","bhavi123"},
		 {"bhavana","bhavi12"}
		 
			 };
  }

  @AfterMethod
	public void capturescreenshot() throws IOException
	{
    File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
    FileUtils.copyFile(file, new File("D:\\Dataprovider\\abc1.jpj"));
		
		System.out.println("Screenshot taken successfully....");
		
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
