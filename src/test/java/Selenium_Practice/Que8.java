/* Que 8. Multiple Windows Handling
Open https://the-internet.herokuapp.com/windows

* Click "Click Here" to open a new window
* Switch to the new window and print its title
* Switch back to the parent window and print its title*/

package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que8 {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/windows");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  String mainwindow=driver.getWindowHandle();
	  driver.findElement(By.linkText("Click Here")).click();
	  for(String win:driver.getWindowHandles())
	  {
		  if(!win.equals(mainwindow))
		  {
			  driver.switchTo().window(win);
		  }
	  }
	  System.out.println("New Window Title: "+driver.getTitle());
	  
	  driver.switchTo().window(mainwindow);
	  System.out.println("Main Window Title: "+driver.getTitle());
	  
  }
}
