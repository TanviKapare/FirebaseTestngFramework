package com.testng.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.testng.utilities.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	//Common action like launch the browse we write in the BaseTest
	
	protected WebDriver driver;
	PropertiesFile properties = new PropertiesFile();
	//protected String methodName;
	
	public WebDriver launchApplication()
	{
		if(driver == null)
		{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String applicationUrl= properties.getProperties("url");
		driver.get(applicationUrl);
		}
		return driver;
	}
	
	public void closeApplication()
	{
		driver.close();
		driver=null;
	}
	
	
}
