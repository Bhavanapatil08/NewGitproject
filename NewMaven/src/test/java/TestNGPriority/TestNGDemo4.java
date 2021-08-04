package TestNGPriority;

import org.testng.annotations.Test;

public class TestNGDemo4 
{
 
@Test(priority = 1,enabled = false)
public void sum()
{
	System.out.println("AAAAA");
}

@Test(priority = 2)
public void sub()
{
	System.out.println("BBBBB");
}

@Test(priority = 4)
public void mul()
{
	System.out.println("CCCCC");
}

@Test(priority = 3)
public void div()
{
	System.out.println("DDDDD");
}




}
