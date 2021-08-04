package Task1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Crickbuzz 
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
			driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		}
		@BeforeClass
		public void maximize()
		{
			driver.manage().window().maximize();
		}
		
		@Test(priority = 1)
		public void m1() throws InterruptedException
		{
		
		//frame locator
		WebElement in1 = driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]"));
		

		//player name
		String playername = driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[3]/div[1]/a")).getText();

		System.out.println(playername);

		// Total In

		List<WebElement> totalin = driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));

		System.out.println("Total count" + totalin.size());

		// first In

		List<WebElement> indata = in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));

		int count1 = indata.size();

		System.out.println("In 1:" + indata.size());

		// Run

		int sum = 0;
		int x=0;
		for (int i = 0; i < count1 - 2; i++) {

			String value = in1
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3) ")).get(i)
					.getText();
			
			String value2 = in1
					.findElements(By.xpath("//*[@id='innings_1']/div[1]/div/div[1]/a")).get(x)
					.getText();
			x++;
			
			int runvalue = Integer.parseInt(value);

			System.out.println(value2+" :" + runvalue);

			sum = sum + runvalue;
		}
		System.out.println("Total no of Run : " + sum);
		
		String extras = driver.findElement(By.xpath("//*[@id='innings_1']/div[1]/div[14]/div[2]")).getText();
		System.out.println("Extra runs in innings:" + extras);
		int extrarun = Integer.parseInt(extras);

		int tscore = extrarun + sum;
		System.out.println("Total score:" + tscore);
		System.out.println("------------------------------------------------");
		}

		
		@Test(priority = 2)
		public void m2()
		{

		// balls
			WebElement in1 = driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]"));
			
			
			List<WebElement> indata = in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));

			int count1 = indata.size();

			System.out.println("In 1:" + indata.size());
			
			
		int sum1 = 0;
		for (int i = 0; i < count1 - 2; i++) {

			String value = in1
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(4) ")).get(i)
					.getText();

			int runvalue = Integer.parseInt(value);

			System.out.println("balls :" + runvalue);

			sum1 = sum1 + runvalue;
		}
		System.out.println("Total no of Balls : " + sum1);
		}
		
		@Test(priority = 3)
		public void m3()
		{
            WebElement in1 = driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]"));
			
			
			List<WebElement> indata = in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));

			int count1 = indata.size();

			System.out.println("In 1:" + indata.size());
			
		
		
		//4s
		
		int sum2 = 0;
		for (int i = 0; i < count1 - 2; i++) {

			String value = in1
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(5) ")).get(i)
					.getText();

			int runvalue = Integer.parseInt(value);

			System.out.println("4s :" + runvalue);

			sum2 = sum2 + runvalue;
		}
		System.out.println("Total no 4s : " + sum2);
		
		System.out.println("----------------------End first Inning-------------");
		}
		
		@Test(priority = 4)
		public void m4()
		{
            WebElement in1 = driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]"));
			
			
			List<WebElement> indata = in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));

			int count1 = indata.size();

			System.out.println("In 1:" + indata.size());
			
		
		//6s
		
		int sum3 = 0;
		for (int i = 0; i < count1 - 2; i++) 
		{

			String value = in1
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(6) ")).get(i)
					.getText();

			int runvalue = Integer.parseInt(value);

			System.out.println("6s :" + runvalue);

			sum3 = sum3 + runvalue;
		}
		System.out.println("Total no 6s : " + sum3);
		
		System.out.println("----------------------End first Inning-------------");
		
		
	}
}