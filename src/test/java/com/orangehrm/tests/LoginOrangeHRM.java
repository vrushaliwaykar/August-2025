package com.orangehrm.tests;

import java.io.File;
//import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.Login_PageFactory;
import com.orangehrm.utilities.ExcelUtiles;
import com.orangehrm.utilities.Screenshot;



public class LoginOrangeHRM extends BaseTest{
	//WebDriver driver;
	static String projectpath=System.getProperty("user.dir")  ;
  @Test(dataProvider="logindata", enabled=false)
  public void verifylogin(String username, String password) throws IOException {
	  test=extent.createTest("Login with the user:"+username);
	  Login_PageFactory obj=PageFactory.initElements(driver, Login_PageFactory.class);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  obj.enterusername(username);
	  obj.enterpassword(password);
	  obj.clickonlogin();
	  try {
	        Thread.sleep(3000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	  
	  	String actualTitle = driver.getTitle();
	    String expectedTitle = "OrangeHRM";

	    boolean isTitleCorrect = actualTitle.equalsIgnoreCase(expectedTitle);

	    if (isTitleCorrect) {
	        test.pass("Title matched: " + actualTitle);
	        test.pass("Login successful for user: " + username);
	    } else {
	        String screenPath = Screenshot.Capture(driver, "LoginFail_" + username);
	        test.fail("Title did not match. Actual: " + actualTitle)
	            .addScreenCaptureFromPath(screenPath);
	        test.fail("Login might have failed for user: " + username);
	  
	
  }
  }
  
  @Test(enabled = false)
  public void Qu1_openGoogleAndPrintTitle() {
      driver.get(googleUrl);
      String googleTitle = driver.getTitle();
      System.out.println("Google Page Title is: " + googleTitle);
      test = extent.createTest("Open Google");
      test.pass("Opened Google and title is: " + googleTitle);
  }
  
  @Test(enabled = false)
  public void Que2_verifysuccessfulLogin() 
  {
	  driver.get(herokuapp);
	  driver.findElement(By.id("username")).sendKeys("tomsmith");
	  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	  driver.findElement(By.xpath("html/body/div[2]/div/div/form/button/i")).click();
	  if(driver.getPageSource().contains("You logged into a secure area!"))
	  {
		  System.out.println("Successfully Login msg verified...!");
	  }
	  else
	  {
		  System.out.println("Login unsuccessful...!");
	  }
  }
  
  @Test(enabled = false)
  public void Que3_printlaptop() 
  {
	  driver.get(amazon);
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  List<WebElement> laptoptitle=driver.findElements(By.cssSelector("h2.a-size-medium.a-spacing-none.a-color-base.a-text-normal"));
	  System.out.println("First 5 product names: ");
	  for(int i=0;i<Math.min(5, laptoptitle.size());i++)
	  {
		  System.out.println(laptoptitle.get(i).getText());
	  }
  }
  
  @Test(enabled = false)
  public void Que4_dropdown()
  {
	  driver.get(url);
	  WebElement sort=driver.findElement(By.name("my-select"));
	  Select sle=new Select(sort);
	  sle.selectByVisibleText("Two");
	  String selected=sle.getFirstSelectedOption().getText();
	  if(selected.equals("Two"))
	  {
		  System.out.println("Correct option is selected.."+selected);
	  }
	  else
	  {
		  System.out.println("Incorrect oprtion selected.."+selected);
	  }
  }
	 
  @Test(enabled = false)
  public void Que5_alert()
  {
	  driver.get(herokuapp1);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Alert salert=driver.switchTo().alert();
	  System.out.println("Alert msg is: "+salert.getText());
	  String msg =salert.getText();
	  salert.accept();
	  if(msg.equals("You successfully clicked an alert"))
	  {
		  System.out.println("Successfully clicked on alert msg");
	  }
	  else
	  {
		  System.out.println("Failed to click on alert msg");
	  }
  }
	  
  @Test(enabled = false)
  public void Que6_checkbox()
  {
	  driver.get(herokuapp2);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));
	  WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
	  WebElement checkbox2=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
	  if(!checkbox1.isSelected())
	  {
		  checkbox1.click();
	  }
	  if(!checkbox2.isSelected())
	  {
		  checkbox2.click();
	  }
	  if(checkbox1.isSelected()&&checkbox2.isSelected())
	  {
		  System.out.println("Both checkboxes are selected");
	  }
	  else
	  {
		  System.out.println("Both checkboxes are not selected");
	  }
  }
  
  @Test(enabled = false)
  public void Que7_printnamefromtable()
  {
	  driver.get(herokuapp3);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
	  System.out.println("Firstname"+" "+"Lastname");
	  for(WebElement row :rows)
	  {
		  String lastname=row.findElement(By.xpath("td[1]")).getText();
		  String firstname=row.findElement(By.xpath("td[2]")).getText();
		  System.out.println(firstname+" "+lastname);
		  if (firstname.equalsIgnoreCase("Jason")) 
		  {
			  String email = row.findElement(By.xpath("td[3]")).getText();
			  System.out.println("Email ID of Jason: " + email);
		  }
      }
  }
  
  @Test(enabled = false)
  public void Que8_switchwindow()
  {
	  driver.get(herokuapp4);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  String mainwindow=driver.getWindowHandle();
	  driver.findElement(By.linkText("Click Here")).click();
	  for(String win:driver.getWindowHandles())
	  {
		  if(!win.equals(mainwindow))
		  {
			  driver.switchTo().window(win);
		  }
	  }
	  System.out.println("New Window Title: "+driver.getTitle());
	  
	  driver.switchTo().window(mainwindow);
	  System.out.println("Main Window Title: "+driver.getTitle());
  }
  @Test(enabled = true)
  public void Que9_screenshot() throws IOException, InterruptedException
  {
	  driver.get(wiki);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  String projectpath=System.getProperty("user.dir")  ;
	  ExtentReports extent=new ExtentReports();
		String reportpath=projectpath+"\\Augreporthome.html";
		ExtentSparkReporter spark=new ExtentSparkReporter(reportpath);
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Screenshot of the home page");
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest=projectpath+"\\homepage1.png";
		File destfile=new File(dest);
		FileUtils.copyFile(scr, destfile);
		test.addScreenCaptureFromPath(dest);
		extent.flush();
		Thread.sleep(3000);	
  }
  
 
  
  @DataProvider
  public Object[][] logindata() throws IOException {
	  
		  String excelpath=projectpath+"\\src\\test\\resources\\Testdata\\testdata.xlsx";
	 
		return ExcelUtiles.getdata(excelpath,"Sheet1");
			
}
}