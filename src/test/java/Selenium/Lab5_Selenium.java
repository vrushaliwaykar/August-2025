package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab5_Selenium 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Part 1 - Launch Application
		// Step 1.1 Launch the URL
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		
		// Step 1.2 - Verify Title
		String title=driver.getTitle();
		System.out.println("Title: "+title);
		
		if(title.equals("Your Store"))
		{
			System.out.println("Title verified: "+title);
		}
		else
		{
			System.out.println("Title Mismatch: "+title);
		}
		
		
		// Step 1.3 - Click on 'My Account' drop down
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		
		// Step 1.4 - Select 'Register' from drop down
		driver.findElement(By.linkText("Register")).click();
		
		// Step 1.5 - Register Account’ page will open up, verify the heading ‘Register Account’
		if(driver.getPageSource().contains("Register Account"))
		{
			System.out.println("Verified heading Register Account");
		}
		else
		{
			System.out.println("Verified heading Register Account is not displayed");
		}
		
		// Step 1.6 - Click on 'Continue' button at the bottom of the page
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		// Step 1.7 - Verify warning message 'Warning: You must agree to the Privacy Policy!'
		if(driver.getPageSource().contains("Warning: You must agree to the Privacy Policy!"))
		{
			System.out.println("Warning msg verified");
		}
		else 
		{
			System.out.println("Warning msg is not found");
		}
		
		
		// Part 2 - Personal Details
		
		//Step 1.1 - Enter data in 'First Name' text box
		String firstname="ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFG";
		WebElement fname=driver.findElement(By.id("input-firstname"));
		fname.sendKeys(firstname);
		
		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
		
		//Step 1.2 - Verify if 33 characters can be entered in 'First Name' text box by clicking  on 'Continue' button.
		if(driver.getPageSource().contains("First Name must be between 1 and 32 characters!"))
		{
			System.out.println("Verified that 33 chars not accepted");
		}
		else
		{
			System.out.println("Verified that 33 chars accepted");
		}
		
		fname.clear();
		driver.findElement(By.id("input-firstname")).sendKeys("Sweety");
		
		
		String lastname="ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFG";
		WebElement lname=driver.findElement(By.id("input-lastname"));
		fname.sendKeys(lastname);
		
		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
		
		
		if(driver.getPageSource().contains("Last Name must be between 1 and 32 characters!"))
		{
			System.out.println("Verified that 33 chars not accepted");
		}
		else
		{
			System.out.println("Verified that 33 chars accepted");
		}
		
		lname.clear();
		driver.findElement(By.id("input-lastname")).sendKeys("Parab");
		
		driver.findElement(By.id("input-email")).sendKeys("Sweety123@gmail.com");
		
		WebElement phoneField = driver.findElement(By.id("input-telephone"));
        phoneField.sendKeys("12"); // only 2 chars
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        if (driver.getPageSource().contains("Telephone must be between 3 and 32 characters!")) 
        {
            System.out.println("Telephone minimum length validation working");
        } 
        else 
        {
            System.out.println("Telephone accepted less than 3 chars!");
        }

        // Enter valid Telephone
        phoneField.clear();
        phoneField.sendKeys("1234567890");
        System.out.println("✅ Entered valid telephone number");
	}

}
