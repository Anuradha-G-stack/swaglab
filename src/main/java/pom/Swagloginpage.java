package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swagloginpage {
	
	
	
	@FindBy (xpath="//input[@id='user-name']") private WebElement username;
	@FindBy (xpath="//input[@id='password']") private WebElement password;
	@FindBy (xpath="//input[@id='login-button']") private WebElement login;
	@FindBy(xpath="(//button[@class='btn btn_primary btn_small btn_inventory '])[1]")private WebElement Addtocart;
 public Swagloginpage(WebDriver driver)
 {
		PageFactory.initElements(driver,this);
 }
	
	public void username(String name)
	{
		username.sendKeys(name);
		
	}
	public void password(String pass)
	{
		password.sendKeys(pass);
		
	}
	public void login()
	{
		login.click();
		
		
	}
	public void Addtocart()
	{
		Addtocart.click();
	

}
}