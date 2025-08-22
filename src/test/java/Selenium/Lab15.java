package Selenium;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab15 {
	WebDriver driver;
	String projectpath=System.getProperty("user.dir")  ;
  @Test(dataProvider = "dp")
  public void f(String fname, String lname, String email1, String phone, String pass, String cpass) throws InterruptedException, IOException {
	  Thread.sleep(5000);
	  String title=driver.getTitle();
		System.out.println("The Title is:"+title);
		
				ExtentReports extent=new ExtentReports();
				String reportpath=projectpath+"\\Lab15report.html";
				ExtentSparkReporter spark=new ExtentSparkReporter(reportpath);
				extent.attachReporter(spark);
				ExtentTest test=extent.createTest("Verify the title of the page");
				if(title.equals("Your Store"))
				{
					test.pass("title is matched");
				}
				else
				{
					test.fail("title is not matched");
					File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					String dest=projectpath+"\\Lab15.png";
					File destfile=new File(dest);
					FileUtils.copyFile(scr, destfile);
					test.addScreenCaptureFromPath(dest);
				}
				
				extent.flush();
				Thread.sleep(3000);	
				
				
				Lab15_POM obj=PageFactory.initElements(driver, Lab15_POM.class);
				obj.clickonmyacc();
				obj.clickonreg();
				obj.enterfirstname(fname);
				obj.enterlastname(lname);
				obj.enteremail(email1);
				obj.entertelephone(phone);
				obj.enterpassword(pass);
				obj.entercpassword(cpass);
				obj.clickonpolicycheck();
				obj.clickoncontinuebutton();
				
				String msg=obj.gettingsuccessmsg();
				if(msg.equals("Your Account Has Been Created!"))
				{
					test.pass("Account created successfully");
				}
				else
				{
					test.fail("Account creation failed "+msg);
				}
				extent.flush();
				
				Thread.sleep(3000);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() throws IOException, CsvException {
	  /*String[][] UserDetails=new String[3][6];
	  
	  File file1=new File(projectpath+"\\UserDetails1.csv");
	  FileInputStream fs=new FileInputStream(file1);
	  XSSFWorkbook workbook=new XSSFWorkbook(fs);
	  XSSFSheet worksheet=workbook.getSheetAt(0);
	  int rowcount=worksheet.getPhysicalNumberOfRows();
	  System.out.println("rows:"+rowcount);
	  DataFormatter formatter = new DataFormatter();
	  for(int i=0;i<rowcount;i++)
	  {
		  UserDetails[i][0] = formatter.formatCellValue(worksheet.getRow(i).getCell(0)); // First Name
	        UserDetails[i][1] = formatter.formatCellValue(worksheet.getRow(i).getCell(1)); // Last Name
	        UserDetails[i][2] = formatter.formatCellValue(worksheet.getRow(i).getCell(2)); // Email
	        UserDetails[i][3] = formatter.formatCellValue(worksheet.getRow(i).getCell(3)); // Phone
	        UserDetails[i][4] = formatter.formatCellValue(worksheet.getRow(i).getCell(4)); // Password
	        UserDetails[i][5] = formatter.formatCellValue(worksheet.getRow(i).getCell(5)); //cpassword
	  }
	  workbook.close();
	  return UserDetails;*/
	  
	  String csvFile = projectpath+"\\lab15.csv";  // Path to your CSV file
      CSVReader csvReader = new CSVReader(new FileReader(csvFile));
      List<String[]> data = csvReader.readAll(); // Read all rows
 
      String[][] data1=new String[3][6];
      // Iterate over CSV data (skipping header)
      for (int i = 0; i < data.size(); i++) {  // Start from 1 to skip header
          data1[i][0] = data.get(i)[0];  // Get first name from the CSV
          data1[i][1] = data.get(i)[1];  // Get lastname from the CSV
          data1[i][2] = data.get(i)[2];
          data1[i][3] = data.get(i)[3];
          data1[i][4] = data.get(i)[4];
          data1[i][5] = data.get(i)[5];
      }
      csvReader.close();
      return data1;
	  
	  
	  
	  
	  
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
    };
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
