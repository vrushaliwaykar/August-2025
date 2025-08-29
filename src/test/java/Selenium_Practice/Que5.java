/* Que 5. Handle Alert Popup
Automate the following:

* Open https://the-internet.herokuapp.com/javascript_alerts
* Click "Click for JS Alert"
* Accept the alert
* Verify that the result text shows "You successfully clicked an alert"*/

package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que5 {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Alert salert=driver.switchTo().alert();
	  System.out.println("Alert msg is: "+salert.getText());
	  salert.accept();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));

	  
	  String resultText = driver.findElement(By.id("result")).getText();
	  if(resultText.equals("You successfully clicked an alert"))
	  {
		  System.out.println("Successfully clicked on alert msg");
	  }
	  else
	  {
		  System.out.println("Failed to click on alert msg");
	  }
	  driver.quit();
  }
}
