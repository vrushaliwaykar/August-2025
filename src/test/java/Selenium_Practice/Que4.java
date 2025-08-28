/* Que 4. Handle Dropdown
Open https://www.selenium.dev/selenium/web/web-form.html

* Select “Option 2” from the dropdown
* Verify the selected option*/

package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que4 {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.selenium.dev/selenium/web/web-form.html");
	  WebElement sort=driver.findElement(By.name("my-select"));
	  Select sle=new Select(sort);
	  sle.selectByVisibleText("Two");
	  String selected=sle.getFirstSelectedOption().getText();
	  if(selected.equals("Two"))
	  {
		  System.out.println("Correct option is selected.."+selected);
	  }
	  else
	  {
		  System.out.println("Incorrect oprtion selected.."+selected);
	  }
	  
  }
}
