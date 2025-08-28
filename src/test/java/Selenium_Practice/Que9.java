/* Que 9: Write a Selenium program that:

* Opens https://www.wikipedia.org/
* Takes a screenshot of the homepage
* Saves it as homepage.png in your project folder*/

package Selenium_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que9 {
  @Test
  public void f() throws IOException, InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.wikipedia.org/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  String projectpath=System.getProperty("user.dir")  ;
	  ExtentReports extent=new ExtentReports();
		String reportpath=projectpath+"\\Augreport.html";
		ExtentSparkReporter spark=new ExtentSparkReporter(reportpath);
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Screenshot of the home page");
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest=projectpath+"\\homepage.png";
		File destfile=new File(dest);
		FileUtils.copyFile(scr, destfile);
		test.addScreenCaptureFromPath(dest);
		extent.flush();
		Thread.sleep(3000);	
		
  
  }
}
