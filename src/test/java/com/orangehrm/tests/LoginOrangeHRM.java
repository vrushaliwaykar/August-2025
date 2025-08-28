package com.orangehrm.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.orangehrm.base.BaseTest;
import com.orangehrm.utilities.ExcelUtiles;
import com.orangehrm.utilities.Screenshot;

import Selenium.TC0019_PageFactory_Login;

public class LoginOrangeHRM extends BaseTest{
	WebDriver driver;
	static String projectpath=System.getProperty("user.dir")  ;
  @Test(dataProvider="logindata")
  public void verifylogin(String username, String password) throws IOException {
	  test=extent.createTest("Login with the user:"+username);
	  TC0019_PageFactory_Login obj=PageFactory.initElements(driver, TC0019_PageFactory_Login.class);
	  obj.enterusername(username);
	  obj.enterpassword(password);
	  obj.clickonlogin();
	  
	  String actualtitle=driver.getTitle();
			  if(actualtitle.equalsIgnoreCase("OrangeHR"))
			  {
				  test.pass("Login Successfull and title is matched:"+actualtitle);
			  }
			  else
			  {
				  String screenpath=Screenshot.Capture(driver, "Login_Failed:"+username);
				  test.fail("Login unSuccessfull and title is not matched:"+actualtitle)
				  .addScreenCaptureFromPath(screenpath);
				  
			  }
  }
  
  
  @DataProvider
  public Object[][] logindata() throws IOException {
	  
		  String excelpath=projectpath+"\\src\\test\\resources\\testdata\\data.xlsx";
	 
		return ExcelUtiles.getdata(excelpath,"Sheet1");
	
  
}
}