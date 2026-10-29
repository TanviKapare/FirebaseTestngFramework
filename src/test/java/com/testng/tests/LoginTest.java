package com.testng.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.LoginPage;
import com.testng.utilities.ScreenshotUtility;

public class LoginTest extends BaseTest {

	//Test level perform actual test
	//Test is sequence of steps and sequence of actions
	
	WebDriver driver;
	LoginPage loginpage;
	String methodName;
	ScreenshotUtility screenshot = new ScreenshotUtility();
	
	@BeforeMethod
	public void launch()
	{
		driver = launchApplication();
		loginpage = new LoginPage(driver);
	}
	
	@Test
	public void loginWithValidCredential()
	{
		loginpage.enterUserName("admin123@gmail.com");
		loginpage.enterPassword("admin123");
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		screenshot.takesScreenshot(driver, methodName);
		loginpage.clickLogin();
	}
	
/*	@Test
	public void loginWithInvalidCredential()
	{
		loginpage.enterUserName("admin12345@gmail.com");
		loginpage.enterUserName("admin123");
		loginpage.clickLogin();
		
	}
	
	@Test
	public void loginWithNoPassword()
	{
		loginpage.enterUserName("admin12345@gmail.com");
		loginpage.clickLogin();
		
	}*/
	
	@AfterMethod
	public void tearDown()
	{
		
		closeApplication();
	}
}
