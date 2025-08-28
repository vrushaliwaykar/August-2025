/* Que 7. Web Table Data Extraction
Open https://the-internet.herokuapp.com/tables

* Print all names from the first table
* Find the email ID of the user "Jason"*/


package Selenium_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que7 {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/tables");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
	  System.out.println("Firstname"+" "+"Lastname");
	  for(WebElement row :rows)
	  {
		  String lastname=row.findElement(By.xpath("td[1]")).getText();
		  String firstname=row.findElement(By.xpath("td[2]")).getText();
		  System.out.println(firstname+" "+lastname);
		  if (firstname.equalsIgnoreCase("Jason")) 
		  {
			  String email = row.findElement(By.xpath("td[3]")).getText();
			  System.out.println("Email ID of Jason: " + email);
		  }
      }
  }
}
