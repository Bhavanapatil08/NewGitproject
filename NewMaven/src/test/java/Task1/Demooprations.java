package Task1;

	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.support.ui.Select;
    import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;

	public class Demooprations 
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
				driver.get("https://testsheepnz.github.io/BasicCalculator.html");
			}
			@BeforeClass
			public void maximize()
			{
				driver.manage().window().maximize();
			}
			@Test(priority = 1)
			public void Add() throws InterruptedException
			{
	        
				driver.get("https://testsheepnz.github.io/BasicCalculator.html");
				
				driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).sendKeys("10");
				driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).sendKeys("20");
				
				WebElement sele=driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
				Select s1=new Select(sele);
				s1.selectByIndex(0);
				
				driver.findElement(By.xpath("//*[@id=\"calculateButton\"]")).click();
				
				WebElement text1=driver.findElement(By.xpath("//*[@id=\"numberAnswerField\"]"));
				String Result=text1.getAttribute("value");
				System.out.println(" Addtion is :- " + Result);	
				
//				driver.findElement(By.xpath("//*[@id=\"integerSelect\"]")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"clearButton\"]")).click();
	        
			}
			@Test(priority = 2)
			public void Subtract() throws InterruptedException
			{
	        
				Thread.sleep(3000);
				driver.get("https://testsheepnz.github.io/BasicCalculator.html");
				driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).sendKeys("10");
				driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).sendKeys("20");
				
				WebElement sele=driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
				Select s2=new Select(sele);
				s2.selectByIndex(1);
				
				driver.findElement(By.xpath("//*[@id=\"calculateButton\"]")).click();
				
				WebElement text2=	driver.findElement(By.xpath("//*[@id=\"numberAnswerField\"]"));
				String Result1=text2.getAttribute("value");
				System.out.println(" Sub is :- " + Result1);	
				
				
//				driver.findElement(By.xpath("//*[@id=\"integerSelect\"]")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"clearButton\"]")).click();
//	        
			}
			@Test(priority = 3)
			public void Multiply() throws InterruptedException
			{
	        
				Thread.sleep(3000);
				driver.get("https://testsheepnz.github.io/BasicCalculator.html");
				driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).sendKeys("10");
				driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).sendKeys("20");
				
				WebElement sele=driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
				Select s3=new Select(sele);
				s3.selectByIndex(2);
				
				driver.findElement(By.xpath("//*[@id=\"calculateButton\"]")).click();
				
				WebElement text3=	driver.findElement(By.xpath("//*[@id=\"numberAnswerField\"]"));
				String Result2=text3.getAttribute("value");
				System.out.println(" Mul is :- " + Result2);	
				
//				driver.findElement(By.xpath("//*[@id=\"integerSelect\"]")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"clearButton\"]")).click();
	        
			}
			@Test(priority = 4)
			public void Divide() throws InterruptedException
			{
	        
				Thread.sleep(3000);
				driver.get("https://testsheepnz.github.io/BasicCalculator.html");
				driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).sendKeys("10");
				driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).sendKeys("20");
				
				WebElement sele=driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
				Select s4=new Select(sele);
				s4.selectByIndex(3);
				
				driver.findElement(By.xpath("//*[@id=\"calculateButton\"]")).click();
				
				WebElement text4=	driver.findElement(By.xpath("//*[@id=\"numberAnswerField\"]"));
				String Result3=text4.getAttribute("value");
				System.out.println(" Div is :- " + Result3);	
				
//				driver.findElement(By.xpath("//*[@id=\"integerSelect\"]")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"clearButton\"]")).click();
	        
			}
			@Test(priority = 5)
			public void Concatenate() throws InterruptedException
			{
	        
				Thread.sleep(3000);
				driver.get("https://testsheepnz.github.io/BasicCalculator.html");
				driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).sendKeys("10");
				driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).sendKeys("20");
				
				WebElement sele=driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
				Select s5=new Select(sele);
				s5.selectByIndex(4);
				
				driver.findElement(By.xpath("//*[@id=\"calculateButton\"]")).click();
				
				WebElement text5=	driver.findElement(By.xpath("//*[@id=\"numberAnswerField\"]"));
				String Result4=text5.getAttribute("value");
				System.out.println(" Con is :- " + Result4);	
				
//				driver.findElement(By.xpath("//*[@id=\"integerSelect\"]")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"clearButton\"]")).click();
	        
			}
			
//	        @AfterMethod
//	    	public void capturescreenshot() throws IOException
//	    	{
//	      File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    		
//	      FileUtils.copyFile(file, new File("D:\\Dataprovider\\abc1.jpj"));
//	    		
//	    		System.out.println("Screenshot taken successfully....");
//	    		
//	    	}
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


