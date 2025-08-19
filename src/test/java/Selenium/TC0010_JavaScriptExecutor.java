package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC0010_JavaScriptExecutor 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//Alert display
		//js.executeScript("alert('Hello');");
		
		//Scroll using JavaScript Excecutor
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,2500)");
	}

}
