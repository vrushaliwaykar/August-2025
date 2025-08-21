package Techademy_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Navigate {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Amazon Title: "+driver.getTitle());
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println("Flipkart title: "+driver.getTitle());
		driver.navigate().back();

	}

}
