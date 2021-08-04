package Junit;

import org.junit.Test;

import org.junit.Assert;

public class TestDemo 
{


    @Test
	public void addtest()
	{
		Calc c=new Calc();
		int ss=c.add(10,20);
		Assert.assertEquals("30", ss);
	}
//    @Test
//	public void subtest()
//	{
//		Calc c=new Calc();
//		int ss=c.add(10, 20);
//		Assert.assertEquals("10", ss);
//	}
	
}