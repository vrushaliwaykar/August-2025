/* Que 2. Automate Login Page
Automate the following scenario:

* Open https://the-internet.herokuapp.com/login
* Enter username: tomsmith
* Enter password: SuperSecretPassword!
* Click Login
* Verify successful login message*/

package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que2 {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
}
