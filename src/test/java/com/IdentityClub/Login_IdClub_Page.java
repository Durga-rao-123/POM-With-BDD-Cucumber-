package com.IdentityClub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_IdClub_Page 
{

	WebDriver driver;
	
	@FindBy(id = "username")
	WebElement enterLoginUsername;
	
	@FindBy(id = "password")
	WebElement enterLoginpassword;
	
	@FindBy(id = "signin")
	WebElement clickOnSubmit;
	
	
	
	
	public Login_IdClub_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	
	}
	
	public void enter_login_username(String uname)
	{
		enterLoginUsername.sendKeys(uname);
	}
	
	public void enter_login_password(String pword)
	{
		enterLoginpassword.sendKeys(pword);
	}
	
	public void clickon_submit()
	{
		clickOnSubmit.click();
	}
	
	
	
}
