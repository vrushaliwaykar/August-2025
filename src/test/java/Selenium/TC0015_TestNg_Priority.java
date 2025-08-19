package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC0015_TestNg_Priority {
  @Test(priority=2)
  public void Test1() {
	  System.out.println("This is test1");
	  WebDriverManager.chromedriver().setup(); 
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
  }
@Test(priority=1)
public void Test2() {
	  System.out.println("This is test2");
	  WebDriverManager.chromedriver().setup(); 
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.myntra.in/");
  }
@Test(priority=3)
public void Test3() {
	  System.out.println("This is test3");
	  WebDriverManager.chromedriver().setup(); 
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.in/");
  }
}
