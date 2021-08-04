package AssertionDemo;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertionDemo1 {

  @Test
  public void test1()
  {
  Assertion as=new Assertion();

  System.out.println("1");
  as.assertEquals(12,12);

  System.out.println("2");
  as.assertEquals(14, 14);

  System.out.println("3");
  as.assertEquals(4,4);

  System.out.println("4");
  System.out.println("hard assert");
  }
  @Test
  public void test2()
  {

  	SoftAssert sf=new SoftAssert();
  	
  	System.out.println("1");
  	sf.assertEquals(12, 12);
  	
  	System.out.println("2");
  	sf.assertEquals(1, 2);
  	
  	System.out.println("3");
  	sf.assertEquals(10 ,0);
  	
  	System.out.println("4");
  		sf.assertEquals(30,30);
  		
  	System.out.println("5");
System.out.println("soft assert");
  sf.assertAll();
   	
  }
  }
