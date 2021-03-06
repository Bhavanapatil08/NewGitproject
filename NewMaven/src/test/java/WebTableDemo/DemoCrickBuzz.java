package WebTableDemo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCrickBuzz 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		driver.manage().window().maximize();
		
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

		// balls
		
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
		
		
		// Second Innings
//
//		WebElement Sin1 = driver.findElement(By.xpath("//*[@id='innings_2']/div[1]"));
//
//		String Splayername = driver.findElement(By.xpath("//*[@id='innings_2']/div[1]/div[3]/div[1]/a")).getText();
//
//		System.out.println("pakistan operner batsman:" + Splayername);
//
//		// Total In
//
//		List<WebElement> Stotalin = driver.findElements(By.xpath("//*[@id='innings_2']/div[1]/div/div[3]"));
//
//		System.out.println("Total count" + Stotalin.size());
//		// Second In
//		List<WebElement> Sindata = in1.findElements(By.xpath("//*[@id='innings_2']/div[1]/div/div[3]"));
//
//		int Scount1 = indata.size();
//
//		System.out.println("In 2:" + Sindata.size());
//
//		// Run
//
//		int Ssum = 0;
//		int x1=0;
//		for (int i = 0; i < Scount1 - 3; i++) {
//
//			String Svalue = Sin1
//					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i)
//					.getText();
//			
//			String Svalue2 = in1
//					.findElements(By.xpath("//*[@id='innings_2']/div[1]/div/div[1]/a")).get(x1)
//					.getText();
//			x1++;
//
//			int Srunvalue = Integer.parseInt(Svalue);
//
//			System.out.println(Svalue2+" : " + Srunvalue);
//
//			Ssum = Ssum + Srunvalue;
//		}
//		System.out.println("Total no of Run : " + Ssum);
//		String Sextras = driver.findElement(By.xpath("//*[@id='innings_2']/div[1]/div[13]/div[2]")).getText();
//		System.out.println("Extra runs in Second Innings:" + Sextras);
//		int Sextrarun = Integer.parseInt(Sextras);
//
//		int Stscore = Sextrarun + Ssum;
//		System.out.println("Total score Second Innings:" + Stscore);
//
//		// balls
//		int sum2 = 0;
//		for (int i = 0; i < count1 - 3; i++) {
//
//			String value = Sin1
//					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(4) ")).get(i)
//					.getText();
//
//			int runvalue = Integer.parseInt(value);
//
//			System.out.println("balls :" + runvalue);
//
//			sum2 = sum2 + runvalue;
//		}
//		System.out.println("Total no of Balls : " + sum2);
//		System.out.println("----------------------End Second Inning-------------");
//		driver.quit();
	}
}