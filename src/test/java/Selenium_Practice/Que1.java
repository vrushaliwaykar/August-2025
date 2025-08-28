/*Que 1. Launch Browser and Open Google
Write a Selenium script in Java to:

* Launch Chrome browser
* Open https://www.google.com
* Print the page title in the console*/

package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que1 {
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  System.out.println("Title of the page is: "+driver.getTitle());
	  String title=driver.getTitle();
	  if(title.equals("Google"))
	  {
		  System.out.println("Tilte is matched: "+title);
	  }
	  else
	  {
		  System.out.println("Tilte is not matched: "+title);
	  }
	  driver.quit();
  }
}
