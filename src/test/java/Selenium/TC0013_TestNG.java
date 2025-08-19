package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC0013_TestNG {
  @Test
  public void test2() 
  {
	  System.out.println("This is Test2");
	  WebDriverManager.chromedriver().setup(); 
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  
  }
}
