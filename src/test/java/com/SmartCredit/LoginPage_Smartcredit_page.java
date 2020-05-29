package com.SmartCredit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Smartcredit_page 
{
	WebDriver driver;
	
	@FindBy(id = "username")
	WebElement enter_Login_Username;
	
	@FindBy(id = "password")
	WebElement enter_login_password;
	
	@FindBy(id = "signin")
	WebElement click_Submit;
	
	
	
	public LoginPage_Smartcredit_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLoginPageTitle()
	{
 		return driver.getTitle();
	
	}
	
	public void enter_Login_username(String uname)
	{
		enter_Login_Username.sendKeys(uname);
	}
	
	public void enter_Login_password(String pword)
	{
		enter_login_password.sendKeys(pword);
	}
	
	public void click_submit()
	{
		click_Submit.click();
	}

}
