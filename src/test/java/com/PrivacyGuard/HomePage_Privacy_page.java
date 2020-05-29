package com.PrivacyGuard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Privacy_page
{
	WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(),'Add a New Client')]")
	WebElement clickOnAddnewClient;
	
	
	
	
	public HomePage_Privacy_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void clickon_Addnew_Client()
	{
		clickOnAddnewClient.click();
	}

}
