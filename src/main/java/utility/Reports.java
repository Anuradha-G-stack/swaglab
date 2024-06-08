package utility;
 import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class Reports {
	
	public static ExtentReports   configurationReports() {
		
		
		ExtentReports reports= new ExtentReports();
		 
		ExtentSparkReporter htmlReporter=new ExtentSparkReporter("ExtentSparkReportes.html");
		reports.attachReporter(htmlReporter);
		reports.setSystemInfo("suitname", "Regression");
		reports.setSystemInfo("created by", "Anuradha");
		return reports;

	}

}
