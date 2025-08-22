package Selenium;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Lab15_POM 
{
	//WebDriver driver;
	//By title=By.className("dropdown-toggle");
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
	WebElement MyAccount;
	
	@FindBy(linkText="Register")
	WebElement Register;
	
	@FindBy(id="input-firstname")
	WebElement firstname;
	
	@FindBy(id="input-lastname")
	WebElement lastname;
	
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-telephone")
	WebElement telephone;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(id="input-confirm")
	WebElement cpassword;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
	WebElement policycheck;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	WebElement continuebutton;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement successMsg;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/a")
	WebElement acccontinue;
	
	
	public void clickonmyacc()
	{
		MyAccount.click();
	}
	
	public void clickonreg()
	{
		Register.click();
	}
	
	public void enterfirstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void enterlastname(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void enteremail(String email1)
	{
		email.sendKeys(email1);
	}
	
	public void entertelephone(String phone)
	{
		telephone.sendKeys(phone);
	}
	
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void entercpassword(String cpass)
	{
		cpassword.sendKeys(cpass);
	}
	
	public void clickonpolicycheck()
	{
		policycheck.click();
	}
	
	public void clickoncontinuebutton()
	{
		continuebutton.click();
	}
	
	public String gettingsuccessmsg()
	{
		return successMsg.getText();
	}
	
	
	
	

}
