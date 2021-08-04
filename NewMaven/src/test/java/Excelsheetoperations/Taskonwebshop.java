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
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskonwebshop 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{

	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/register");
	File f =new File("D:\\New folder\\Book1.xlsx");
	
	FileInputStream fi=new FileInputStream(f);
	
	//get workbook
	XSSFWorkbook book=new XSSFWorkbook(fi);
	
	//getting specific sheet
	XSSFSheet sheet=book.getSheet("Registeronwebshop");
	
	XSSFRow row1=sheet.getRow(1);
	
	
	XSSFCell col1=row1.getCell(0);
	String FirstName=col1.toString();
	
	XSSFCell col2=row1.getCell(1);
	String LastName=col2.toString();
	
	XSSFCell col3=row1.getCell(2);
	String Email=col3.toString();
	
	XSSFCell col4=row1.getCell(3);
	String Password=col4.toString();
	
	XSSFCell col5=row1.getCell(4);
	String confirmPassword=col5.toString();
	
	driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
	
    driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(FirstName);
    
    driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(LastName);	
    
    driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(Email);
    
    driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(Password);
    
	driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys(confirmPassword);
	
	driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	
	Thread.sleep(5000);
	driver.quit();
	

	}

}
