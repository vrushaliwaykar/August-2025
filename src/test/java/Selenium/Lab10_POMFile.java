package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Lab10_POMFile 
{
	WebDriver driver;
	public Lab10_POMFile(WebDriver driver2)
	{
		this.driver=driver2;
	}
	By desktop=By.linkText("Desktops");
	By mac=By.linkText("Mac (1)");
	By heading=By.cssSelector("h2");
	By sortdropdown=By.id("input-sort");
	By addToCart=By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]");
	By mobile=By.xpath("//*[@id=\"search\"]/input");
	By search=By.xpath("//*[@id=\"search\"]/span/button");
	By clearsearch=By.id("input-search");
	By description=By.xpath("//*[@id=\"description\"]");
	By buttonsearch=By.id("button-search");
	
	public String gettitlefrompage()
	{
		return driver.getTitle();
	}
	public void clickondesktop()
	{
		driver.findElement(desktop).click();
	}
	public void clickonmac()
	{
		driver.findElement(mac).click();
	}
	public String getheading()
	{
		return driver.findElement(heading).getText();
	}
	public void selectfromdropdown()
	{
		  WebElement sort=driver.findElement(sortdropdown);
		  Select sle=new Select(sort);
		  sle.selectByIndex(1);
	}
	public void clickonaddcart()
	{
		driver.findElement(addToCart).click();
	}
	public void searchmobile()
	{
		driver.findElement(mobile).sendKeys("Mobile");
	}
	public void clickonsearch()
	{
		driver.findElement(search).click();
	}
	public void clearalltext()
	{
		driver.findElement(clearsearch).clear();
	}
	public void clickondesccheck()
	{
		driver.findElement(description).click();
	}
	public void clickonbuttonsearch()
	{
		driver.findElement(buttonsearch).click();
	}

}
