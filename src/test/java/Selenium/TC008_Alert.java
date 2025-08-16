package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC008_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		//simple alert
		driver.findElement(By.id("accept")).click();
		Alert salert=driver.switchTo().alert();
		System.out.println("The simple alert message is: "+salert.getText());
		salert.accept();
		
		Thread.sleep(3000);
		//confirm alert
		driver.findElement(By.id("confirm")).click();
		Alert calert=driver.switchTo().alert();
		System.out.println("The confirm alert message is: "+calert.getText());
		salert.dismiss();
		
		Thread.sleep(3000);
		//prompt alert
		driver.findElement(By.id("prompt")).click();
		Alert palert=driver.switchTo().alert();
		System.out.println("The prompt alert message is: "+palert.getText());
		palert.sendKeys("Hii");
		palert.accept();
		
	}

}
