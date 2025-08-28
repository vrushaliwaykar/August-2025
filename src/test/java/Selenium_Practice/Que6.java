/* Que 6. Handle Checkbox
Write a Selenium script to:

* Open https://the-internet.herokuapp.com/checkboxes
* Select both checkboxes (if not already selected)
* Verify that both checkboxes are checked*/


package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que6 {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/checkboxes");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));
	  WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
	  WebElement checkbox2=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
	  if(!checkbox1.isSelected())
	  {
		  checkbox1.click();
	  }
	  if(!checkbox2.isSelected())
	  {
		  checkbox2.click();
	  }
	  if(checkbox1.isSelected()&&checkbox2.isSelected())
	  {
		  System.out.println("Both checkboxes are selected");
	  }
	  else
	  {
		  System.out.println("Both checkboxes are not selected");
	  }
  }
}
