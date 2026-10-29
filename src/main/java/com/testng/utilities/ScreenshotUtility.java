package com.testng.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {

	public void takesScreenshot(WebDriver driver, String method)
	{
		//we have inbuild interface which take screenshot
		TakesScreenshot screenshot =((TakesScreenshot)driver);
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
		
		String filepath = "screenshots\\screenshot"+"_"+timeStamp+"_"+method+".jpg";
		File destFile = new File(filepath);
		
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
