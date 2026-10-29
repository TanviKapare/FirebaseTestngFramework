package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testng.base.BasePage;

public class LoginPage extends BasePage {

	/*
	 * Framework: Page Object Model 
	 * Design Pattern : PageFactory 
	 */
	
	//Page level find Web Element and perform Actions and reuse these elements we find on this page use to perform tests
	
	//WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="email_Field")
	WebElement emailId;
	public void enterUserName(String email)
	{
		emailId.sendKeys(email);
	}
	
	
	@FindBy(id="password_field")
	WebElement password;
	public void enterPassword(String strPassword)
	{
		password.sendKeys(strPassword);
	}
	
	@FindBy(xpath="//button[text()='Login to Account']")
	WebElement loginButton;
	public void clickLogin()
	{
		loginButton.click();
	}
}
