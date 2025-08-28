package com.orangehrm.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	private static ExtentReports extent;
	static String projectpath=System.getProperty("user.dir")  ;
	public static ExtentReports getinstance()
	
	{
if(extent==null)
{
		String reportpath=projectpath+"\\src\\test\\resources\\Reports\\ReportsAugreport.html";
		ExtentSparkReporter spark=new ExtentSparkReporter(reportpath);
		 extent = new ExtentReports(); 
		extent.attachReporter(spark);
}
		return extent;
	
	}

}