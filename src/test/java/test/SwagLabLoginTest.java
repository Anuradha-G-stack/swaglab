 package test;

import java.io.IOException;

import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.Swagloginpage;

import utility.Parametrization;
import utility.ScreenShot;
@Listeners (test.Listeners1.class)
public class SwagLabLoginTest extends BaseTest {
	
	/*
	 * @BeforeMethod public void OpenSwaglab() {
	 * 
	 * driver=Browser.LaunchBrowser("https://www.saucedemo.com/"); }
	 */
		
	@Test(priority=1)

		public void loginwithvaliduser() throws EncryptedDocumentException, IOException
		{
		Swagloginpage obj=new Swagloginpage(driver);
	  
		String name= Parametrization.getdata(0,0); 
		String pass= Parametrization.getdata(1,0); 

		obj.username(name);
        obj.password(pass);
        obj.login();
        //obj.Addtocart();
       // ScreenShot.takescreenshot(driver,"sc1");
       Assert.assertTrue(false);
		
		}
	
	@Test(priority=2)
  public void lockedoutuser() throws EncryptedDocumentException, IOException
  {
		Swagloginpage obj=new Swagloginpage(driver);

		String name= Parametrization.getdata(0,1); 
		String pass= Parametrization.getdata(1,0); 

		obj.username(name);
        obj.password(pass);
        obj.login();
        obj.Addtocart();

   
	  
  }
	@Test(priority=3)
  public void problemuser() throws EncryptedDocumentException, IOException
  {
		Swagloginpage obj=new Swagloginpage(driver);

		String name= Parametrization.getdata(1,1); 
		String pass= Parametrization.getdata(1,0); 

		obj.username(name);
        obj.password(pass);
        obj.login();
        obj.Addtocart();

   
  }	  
	@Test(priority=4)
  public void performanceglitchuser() throws EncryptedDocumentException, IOException
  {
		Swagloginpage obj=new Swagloginpage(driver);

		String name= Parametrization.getdata(2,1); 
		String pass= Parametrization.getdata(1,0); 

		obj.username(name);
        obj.password(pass);
        obj.login();
        obj.Addtocart();

   
  }	  
	@Test(priority=5)
  public void erroruser () throws EncryptedDocumentException, IOException
  {
		Swagloginpage obj=new Swagloginpage(driver);

		String name= Parametrization.getdata(3,1); 
		String pass= Parametrization.getdata(1,0); 

		obj.username(name);
        obj.password(pass);
        obj.login();
        obj.Addtocart();

  }	  
	@Test(priority=6 , enabled = false)
  public void visualuser() throws EncryptedDocumentException, IOException
  {
		Swagloginpage obj=new Swagloginpage(driver);

		String name= Parametrization.getdata(4,1); 
		String pass= Parametrization.getdata(1,0); 

		obj.username(name);
        obj.password(pass);
        obj.login();
        obj.Addtocart();

   
  }	

}