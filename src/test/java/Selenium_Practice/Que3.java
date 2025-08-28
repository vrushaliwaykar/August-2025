/* Que 3. Search in E-commerce Website
Write a Selenium script to:

* Open https://www.amazon.in/
* Search for "laptop"
* Print the first 5 product names from the results*/

package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que3 {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  List<WebElement> laptoptitle=driver.findElements(By.cssSelector("h2.a-size-medium.a-spacing-none.a-color-base.a-text-normal"));
	  System.out.println("First 5 product names: ");
	  for(int i=0;i<Math.min(5, laptoptitle.size());i++)
	  {
		  System.out.println(laptoptitle.get(i).getText());
	  }
  }
}
