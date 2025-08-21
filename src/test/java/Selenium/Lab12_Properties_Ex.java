package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab12_Properties_Ex 
{
	public static void main(String[] args) throws InterruptedException, IOException {

        // Load properties
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Satyam\\eclipse-workspace\\Lab14\\src\\test\\resources\\configuration\\config.properties");
        prop.load(fis);

        String url = prop.getProperty("url");
        String browser = prop.getProperty("browser");

        // Browser setup
        WebDriver driver = null;
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open URL
        driver.get(url);
        System.out.println("Page Title: " + driver.getTitle());	
        
        
      Assert.assertEquals(driver.getTitle(),"Your Store");
  	  driver.findElement(By.linkText("Desktops")).click();
  	  driver.findElement(By.linkText("Mac (1)")).click();
  	  String heading = driver.findElement(By.cssSelector("#content h2")).getText();
  	  Assert.assertEquals(heading, "Mac");
  	  System.out.println("Mac heading verified");
  	  WebElement sort=driver.findElement(By.id("input-sort"));
  	  Select sle=new Select(sort);
  	  sle.selectByIndex(1);
  	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")).click();
  	  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Mobile");
  	  driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
  	  driver.findElement(By.id("input-search")).clear();
  	  driver.findElement(By.xpath("//*[@id=\"description\"]")).click();
  	  driver.findElement(By.id("button-search")).click();
  	  //Monitor
  	  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Monitor");
  	  driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
  	  driver.findElement(By.id("input-search")).clear();
  	  driver.findElement(By.xpath("//*[@id=\"description\"]")).click();
  	  driver.findElement(By.id("button-search")).click();
  	  
  	  driver.quit();

	}
}
