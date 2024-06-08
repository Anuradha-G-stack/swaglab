package pojo;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

public static WebDriver LaunchBrowser(String url) {
	
     System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe"); 
      WebDriver driver=new ChromeDriver(); 
      driver.get(url);
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
      // this wait is applicable for all the webelement and max time is 5 sec
      return driver;
}
  public static void main(String[] args) {
	WebDriver driver=Browser.LaunchBrowser(" ");
}
	
	
}
