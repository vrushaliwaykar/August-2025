package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC0016_TestNG_Assertion {
  @Test
  public void f() {
	  System.out.println("This is test1");
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	/*	if(driver.getTitle().equals("Amazon"))
				{
			System.out.println("title is matched");
			Assert.assertTrue(true);
				}
		else
		{
			System.out.println("title is not matched");
			Assert.assertFalse(true);
			
				} */
  
  }
}
