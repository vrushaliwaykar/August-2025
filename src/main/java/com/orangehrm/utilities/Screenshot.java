package com.orangehrm.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	static String projectpath=System.getProperty("user.dir")  ;
	public static String Capture(WebDriver driver, String TestName) throws IOException
	{
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String dest=projectpath+"\\src\\test\\resources\\Screenshots\\screenshot1.png";
		File detfile=new File(dest);
		FileUtils.copyFile(scr, detfile);
return dest;
	}
	}
	