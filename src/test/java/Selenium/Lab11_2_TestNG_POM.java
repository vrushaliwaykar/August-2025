package Selenium;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab11_2_TestNG_POM {
  WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  Lab11_POMFile obj=new Lab11_POMFile(driver);
	  Assert.assertEquals(obj.gettitlefrompage(), "Your Store");
	  System.out.println("Title verified");
	  obj.clickondesktop();
	  obj.clickonmac();
	  Assert.assertEquals(obj.getheading(), "Mac");
	  System.out.println("Mac heading verified");
	  obj.selectfromdropdown();
	  obj.clickonaddcart();
	  obj.searchmobile();
	  obj.clickonsearch();
	  obj.clickondesccheck();
	  obj.clickonbuttonsearch();
	  /*System.out.println("Test Method");
	  String title=driver.getTitle();
	  System.out.println("Title name is: "+title);
	  Assert.assertEquals(driver.getTitle(),"Your Store");
	  driver.findElement(By.linkText("Desktops")).click();
	  driver.findElement(By.linkText("Mac (1)")).click();
	  //driver.findElement(By.cssSelector("#content > h2"));
	  Assert.assertEquals("Mac", driver.findElement(By.cssSelector("h2")).getText());
	  System.out.println("Mac heading verified");
	  WebElement sort=driver.findElement(By.id("input-sort"));
	  Select sle=new Select(sort);
	  sle.selectByIndex(1);
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Mobile");
	  driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
	  driver.findElement(By.id("input-search")).clear();
	  driver.findElement(By.xpath("//*[@id=\"description\"]")).click();
	  driver.findElement(By.id("button-search")).click();
	  //Monitor
	  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Monitor");
	  driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
	  driver.findElement(By.id("input-search")).clear();
	  driver.findElement(By.xpath("//*[@id=\"description\"]")).click();
	  driver.findElement(By.id("button-search")).click();*/
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.out.println("Before method");
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?");
	  Thread.sleep(2000);
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      //new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}
