package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import pojo.Browser;

public class ScreenShot {
	
	public static void takescreenshot(WebDriver driver,String name) throws IOException {
		
	driver=Browser.LaunchBrowser("https://www.saucedemo.com/");
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("F:\\screenshot\\"+name+".png");
		FileHandler.copy(source, destination);
		
	}

}
