package com.orangehrm.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	static String projectpath=System.getProperty("user.dir")  ;
	public static String Capture(WebDriver driver, String TestName) throws IOException
	{
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String safeTestName = TestName.replaceAll("[^a-zA-Z0-9_]", "_");
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String dest = projectpath + "/src/test/resources/Screenshots/" + safeTestName + "_" + timestamp + ".png";
		File destfile=new File(dest);
		FileUtils.copyFile(scr, destfile);
return dest;
	}
	}
