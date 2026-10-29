package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class HomePage extends BasePage {

	//WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement homeTab;
	public void homeTabClick()
	{
		waitForElement(homeTab,10);
		homeTab.click();
	}
	
	@FindBy(id="name")
	WebElement name;
	public void firstName(String fName )
	{
		name.sendKeys(fName);
	}
	
	@FindBy(id="lname")
	WebElement fatherName;
	public void fatherName(String lname)
	{
		fatherName.sendKeys("Shekhar");
	}
	
	@FindBy(id="postaladdress")
	WebElement postAddress;
	public void postalAddress(String pAddress)
	{
		postAddress.sendKeys(pAddress);
	}
	
	@FindBy(id="personaladdress")
	WebElement personalAddress;
	public void personalAddress(String perAddress)
	{
		personalAddress.sendKeys(perAddress);
	}
	
	@FindBy(xpath="//input[@value='female']")
	WebElement radioButton;
	public void radioButton()
	{
		radioButton.click();
	}
	
	@FindBy(id ="city")
	WebElement cityDropDown;
	public void city(String c)
	{
		Select city = new Select(cityDropDown);
		city.selectByVisibleText(c);
		//cityDropDown.(city);
	}
	
	@FindBy(id="course")
	WebElement courseDropDown;
	public void course(String co)
	{
		Select course = new Select(courseDropDown);
		course.selectByValue(co);
		//courseDropDown.sendKeys(course);
	}

	@FindBy(id="district")
	WebElement districtDropDown;
	public void district(int d)
	{
		Select dist = new Select(districtDropDown);
		dist.selectByIndex(d);
		//districtDropDown.sendKeys(dist);
	}

	@FindBy(id="state")
	WebElement stateDropDown;
	public void state(String s)
	{
		Select state = new Select(stateDropDown);
		state.selectByVisibleText(s);
		//stateDropDown.sendKeys(state);
	}

	@FindBy(id="pincode")
	WebElement pin;
	public void pincode(String pincode)
	{
		pin.sendKeys(pincode);
	}

	@FindBy(id="emailid")
	WebElement emailId;
	public void emailId(String eId)
	{
		emailId.sendKeys(eId);
	}
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitButton;
	public void submitButton()
	{
		submitButton.click();
		waitForElement(homeTab,10);
	}
}























