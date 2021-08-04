package Excelsheetoperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Taskonmercurytour 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		File f =new File("D:\\New folder\\Book1.xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		
		//get workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//getting specific sheet
		XSSFSheet sheet=book.getSheet("Registeronmercury");
		
		XSSFRow row1=sheet.getRow(1);
		
		
		XSSFCell col1=row1.getCell(0);
		String FirstName=col1.toString();
		
		XSSFCell col2=row1.getCell(1);
		String LastName=col2.toString();
		
		XSSFCell col3=row1.getCell(2);
		String Phone=col3.toString();
		
		XSSFCell col4=row1.getCell(3);
		String Username=col4.toString();
		
		XSSFCell col5=row1.getCell(4);
		String Address1=col5.toString();
		
		XSSFCell col6=row1.getCell(5);
		String City=col6.toString();
		
		XSSFCell col7=row1.getCell(6);
		String State=col7.toString();
		
		XSSFCell col8=row1.getCell(7);
		String postalCode=col8.toString();
		
		XSSFCell col9=row1.getCell(8);
		String country=col9.toString();
		
		XSSFCell col10=row1.getCell(9);
		String Email=col10.toString();
		
		XSSFCell col11=row1.getCell(10);
		String Password=col11.toString();
		
		XSSFCell col12=row1.getCell(11);
		String confirmPassword=col12.toString();
		
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys(FirstName);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")).sendKeys(LastName);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")).sendKeys(Phone);
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(Username);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys(Address1);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input")).sendKeys(City);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")).sendKeys(State);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input")).sendKeys(postalCode);
		
		WebElement sel=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
		Select s=new Select(sel);
		s.selectByVisibleText(country);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(Email);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).sendKeys(Password);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys(confirmPassword);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();

		Thread.sleep(5000);
		driver.quit();
	}

}
