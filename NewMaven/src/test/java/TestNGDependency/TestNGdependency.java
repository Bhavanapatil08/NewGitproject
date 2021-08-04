package TestNGDependency;

import org.testng.annotations.Test;

public class TestNGdependency 
{
	@Test
	public void M1()
	{
		System.out.println("M1 Method");
	}
	
	@Test(priority = -2)
	public void M2()
	{
		System.out.println("M2 Method");        //m2,m1,m3,m4,m5  //m3,m2,m1,m4,m5
	}
	
	@Test(priority = -4)
	public void M3()
	{
		System.out.println("M3 Method");
	}
	
	@Test(dependsOnMethods = {"M3"})
	public void M4()
	{
		System.out.println("M4 Method");
	}
	
	@Test(dependsOnMethods = {"M2"})
	public void M5()
	{
		System.out.println("M5 Method");
	}
}
	
//	@Test
//	public void M6()
//	{
//		System.out.println("M6 Method");
//	}
//	
//	@Test(dependsOnMethods = {"M8"})
//	public void M7()
//	{
//		System.out.println("M7 Method");
//	}
//	
//	@Test
//	public void M8()
//	{
//		System.out.println("M8 Method");
//	}
//	
//	@Test
//	public void M9()
//	{
//		System.out.println("M9 Method");
//	}
//	
//	@Test
//	public void M10()
//	{
//		System.out.println("M10 Method");
//	}
//	
//	@Test
//	public void M11()
//	{
//		System.out.println("M11 Method");
//	}
//	@Test
//	public void M12()
//	{
//		System.out.println("M12 Method");
//	}
//	@Test
//	public void M13()
//	{
//		System.out.println("M13 Method");
//	}
//	@Test
//	public void M14()
//	{
//		System.out.println("M14 Method");
//	}
//	@Test
//	public void M15()
//	{
//		System.out.println("M15 Method");
//	}
//}
