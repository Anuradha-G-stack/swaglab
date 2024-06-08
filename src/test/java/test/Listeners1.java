package test;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import pojo.Browser;
import utility.ScreenShot;

public class Listeners1 extends BaseTest implements ITestListener {
	
	public void onStart(ITestContext result)
	{
		 driver=Browser.LaunchBrowser("https://www.saucedemo.com/");

	}
	
	public void onFinish(ITestContext result)
	{
		reports.flush();
	}
public void onTestStart(ITestResult result)
	{
		System.out.println("Test start" + result.getName());
		}


  public void onTestSuccess(ITestResult result)
 { 
	  test.log(Status.PASS,result.getName() );
	 System.out.println("Test successdfully excute" + result.getName());
 }
  public void onTestFailure(ITestResult result)
  {
	  test.log(Status.FAIL,result.getName() );

	  System.out.println("Test fail"+result.getName());
	  try {
		  // ScreenShot.takescreenshot(driver,"sc2");
		ScreenShot.takescreenshot(driver, result.getName());
	  }
	  catch(IOException e)
	  {
		  e.printStackTrace();
	  }
	  
  }
  public void onTestSkipped(ITestResult result)
 {
	  test.log(Status.SKIP,result.getName() );

	 
	 System.out.println("Test skipped"+ result.getName());
 }
   public void onTestFinished(ITestResult result)
 {
	 System.out.println("Test Finished"+ result.getName());
 }
 
}
