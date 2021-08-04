package TestNGListner1;

import org.testng.ISuite;
import org.testng.ISuiteListener;


public class TestListnerlogin implements ISuiteListener
{
  public void onStart(ISuite suite)
  {
	  System.out.println("OnStart");
  }
  public void onFinish(ISuite suite)
  {
	  System.out.println("OnFinish");
  }
}
