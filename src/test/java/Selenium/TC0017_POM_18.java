package Selenium;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TC0017_POM_18 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String username, String password) throws InterruptedException 
  {
	  
	  String title=driver.getTitle(); 
	  System.out.println("The Title is:"+title);
	  Thread.sleep(3000); 
	  
	  TC0018_login_pageobjects obj=new TC0018_login_pageobjects(driver);
	  obj.enterusername(username);
	  obj.enterpassword(password);
	  obj.clickonlogin();
	  //driver.findElement(By.name("username")).sendKeys(username); 
	  //driver.findElement(By.name("password")).sendKeys(password);
	  //driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before Method");
	  WebDriverManager.chromedriver().setup(); 
	  driver=new ChromeDriver(); 
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After Method");
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "vrusha", "vrusha@123" },
      new Object[] { "dipa", "dipa@123" },
    };
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("before Test");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("After test");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("After suite");
  }

}
