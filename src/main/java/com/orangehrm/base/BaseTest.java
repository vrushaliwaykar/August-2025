package com.orangehrm.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.orangehrm.utilities.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected WebDriver driver;
	protected ExtentReports extent;
	protected ExtentTest test;
	protected String googleUrl = "https://www.google.com";
	protected String herokuapp = "https://the-internet.herokuapp.com/login";
	protected String amazon = "https://www.amazon.in/";
	protected String url="https://www.selenium.dev/selenium/web/web-form.html";
	protected String herokuapp1 = "https://the-internet.herokuapp.com/javascript_alerts";
	protected String herokuapp2 = "https://the-internet.herokuapp.com/checkboxes";
	protected String herokuapp3 = "https://the-internet.herokuapp.com/tables";
	protected String herokuapp4 = "https://the-internet.herokuapp.com/windows";
	protected String wiki = "https://www.wikipedia.org/";
	@BeforeSuite
	public void setupreport()
	{
		extent=ExtentManager.getinstance();
	}
	
	
	@BeforeMethod
	  public void setup() {
		   System.out.println("Before method");
		   WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	  }
	  @AfterMethod
	  public void teardown() {
		  System.out.println("After method");
		  driver.quit();
	  }
	
	@AfterSuite
public void flushreport()

{
	extent.flush();
}
}