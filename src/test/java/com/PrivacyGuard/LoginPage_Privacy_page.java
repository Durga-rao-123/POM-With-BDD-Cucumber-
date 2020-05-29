package com.PrivacyGuard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Privacy_page 
{
	WebDriver driver;
	
	@FindBy(id = "username")
	WebElement enterLoginUsername;
	
	@FindBy(id = "password")
	WebElement enterLoginpassword;
	
	@FindBy(id = "signin")
	WebElement clickSubmit;
	
	
	
	public LoginPage_Privacy_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	
	}
	public void enter_loginUsername(String uname)
	{
		enterLoginUsername.sendKeys(uname);
	}
	
	public void enter_Loginpassword(String pword)
	{
		enterLoginpassword.sendKeys(pword);
	}
	
	public void click_Submit()
	{
		clickSubmit.click();
	}

}
