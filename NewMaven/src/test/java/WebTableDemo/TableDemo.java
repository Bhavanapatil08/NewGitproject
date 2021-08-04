package WebTableDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Digvijay/Downloads/table.html");
		driver.manage().window().maximize();
		
		
		// Total no of rows
		
		List<WebElement> lsrows=driver.findElements(By.tagName("tr"));
		
		int Count=lsrows.size();
		
		System.out.println("Total No of rows:-"+Count );
		
		
		//To Display All Table Data
		
		for(WebElement rows :lsrows)
		{
			List<WebElement> ls1=rows.findElements(By.tagName("td"));
			
			for (WebElement col : ls1) 
			{
			System.out.println(col.getText());	
			}
		}
		//one column data
		
		WebElement colvalue=driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td[1]"));
		String value=colvalue.getText();
	    System.out.println(value);
	}
	}