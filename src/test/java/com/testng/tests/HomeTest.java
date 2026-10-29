package com.testng.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.HomePage;
import com.testng.pages.LoginPage;
import com.testng.utilities.ScreenshotUtility;

public class HomeTest extends BaseTest{

	
	//Home page test
	
	WebDriver driver;
	LoginPage login;
	HomePage homeClick;
	ScreenshotUtility screenshot;
	String methodName;
	
	@BeforeMethod
	public void launch()
	{
		driver = launchApplication();
		login = new LoginPage(driver);
		homeClick= new HomePage(driver);
		screenshot = new ScreenshotUtility();
	}
	
	@Test
	public void homeTestCase()
	{
		login.enterUserName("admin123@gmail.com");
		login.enterPassword("admin123");
		login.clickLogin();
		homeClick.homeTabClick();
		homeClick.firstName("Siya");
		homeClick.fatherName("Shekhar");
		homeClick.postalAddress("ABC road,Pune");
		homeClick.personalAddress("Laxmi Road,Pune");
		homeClick.radioButton();
		homeClick.city("MUMBAI");
		homeClick.course("mba");
		homeClick.district(2);
		homeClick.state("GOA");
		homeClick.pincode("123456");
		homeClick.emailId("admin123@gmail.com");
		methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
		screenshot.takesScreenshot(driver, methodName);
		homeClick.submitButton();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//screenshot.takesScreenshot(driver);
		closeApplication();
	}
	
}
