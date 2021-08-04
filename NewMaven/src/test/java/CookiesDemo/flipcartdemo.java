package CookiesDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartdemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	Set<Cookie> s=driver.manage().getCookies();
	int countofcookies=s.size();
	System.out.println("Number of Cookies: "+countofcookies);
	
	for(Cookie b:s)
	{
		
		System.out.println("=====================COOKIES INFORMATION====================");
		System.out.println();
		System.out.println("Name of cookie :"+b.getName());
		System.out.println("Domain of cookie :"+b.getDomain());
		System.out.println("Path of cookie :"+b.getPath());
		System.out.println("Cookie is secure :"+b.isSecure());
		System.out.println("Is HTTP :"+b.isHttpOnly());
		System.out.println("Hascode of cookie is : "+b.hashCode());
		System.out.println("Value of cookie is :"+b.getValue());
		System.out.println("Expiry of cookie is :"+b.getExpiry());
		System.out.println("Toostring is :"+b.toString());
		//System.out.println("Validate is :" +b.validate());
		System.out.println();
		
	}
	
	//operation of delete cookies 
	//before delete cookies
	Set<Cookie> s1=driver.manage().getCookies();
	int count=s1.size();
	System.out.println("Before delete count of cookies : "+count);
	driver.manage().deleteCookieNamed("SN");
	driver.manage().deleteCookieNamed("gpv_pn_t");
	
	//after delete  cookies
	Set<Cookie> s2=driver.manage().getCookies();
	int countAD=s2.size();
	System.out.println("After delete count of cookies : "+countAD);
	
	//size after add cookie
	Cookie c=new Cookie("ab","New-cookie");
	driver.manage().addCookie(c);
	Set<Cookie> s3=driver.manage().getCookies();
	System.out.println("Size after add cookie :"+s3.size());
	
	}

}


