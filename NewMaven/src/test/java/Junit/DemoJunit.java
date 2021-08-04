package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoJunit 
{
	
	@BeforeClass
	public static void m1()
	{
		System.out.println("This is Before class method");
	}
	
	@AfterClass
	public static void m2()
	{
		System.out.println("This is After class method");
	}
	@Before
	public void m3()
	{
		System.out.println("This is Before method");
	}
	
	@After
	public void m4()
	{
		System.out.println("This is After method");
	}
	
	@Test
	public void m5()
	{
		System.out.println("This is Test5 method");
	}
	@Test
	public void m6()
	{
		System.out.println("This is Test6 method");
	}
	
	@Test
	public void m7()
	{
		System.out.println("This is Test7 method");
	}
	

}
