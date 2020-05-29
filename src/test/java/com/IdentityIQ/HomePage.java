package com.IdentityIQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilPackage.BaseClass;

public class HomePage 
{

	WebDriver driver;
	
	
	@FindBy(xpath = "//span[contains(text(),'Add a New Client')]")
	WebElement clickOnAddnewClient;
	
	
	
	
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String VerifyHomePageTitle()
	{
		return driver.getTitle();
		
	}
	
	
	public void clickon_Addnew_client()
	{
		clickOnAddnewClient.click();
	}
	
	
}
