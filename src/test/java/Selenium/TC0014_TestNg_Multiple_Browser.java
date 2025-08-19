package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC0014_TestNg_Multiple_Browser {
@Parameters("browser")	
  @Test
  public void Test1(String browser) 
  {
		if(browser.equalsIgnoreCase("chrome"))
		{
			  System.out.println("This is test1");
			  WebDriverManager.chromedriver().setup(); 
			  WebDriver driver=new ChromeDriver();
			  driver.get("https://www.amazon.in/");
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			  System.out.println("This is test2");
			  WebDriverManager.firefoxdriver().setup(); 
			  WebDriver driver=new FirefoxDriver();
			  driver.get("https://www.amazon.in/");
		}
		else
		{
			 System.out.println("This is test1");
			  WebDriverManager.edgedriver().setup(); 
			  WebDriver driver=new EdgeDriver();
			  driver.get("https://www.amazon.in/");
		}
				
  }
}
