package com.MyFreeScoreNow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilPackage.BaseClass;

public class Login_MyFreeScore_Page extends BaseClass
{
	WebDriver driver;
	
	@FindBy(id = "username")
	WebElement enterLoginUsername;
	
	@FindBy(id = "password")
	WebElement enterLoginPassword;
	
	@FindBy(id = "signin")
	WebElement clickSubmit;
	
	
	
	
	public Login_MyFreeScore_Page(WebDriver driver)
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
		enterLoginUsername.sendKeys(uname);
	}
	
	public void enter_Login_password(String password)
	{
		enterLoginPassword.sendKeys(password);
	}
	
	public void click_Submit()
	{
		clickSubmit.click();
	}
	

}
