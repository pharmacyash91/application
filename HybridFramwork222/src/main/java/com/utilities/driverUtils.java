package com.utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

public class driverUtils extends BaseClass {
	
	public static String getScreenshot(String name) {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/Screenshot/"+name+".jpg";
		File dest = new File(path);
		try {
		FileUtils.copyFile(scr, dest);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return path;
		}

}
