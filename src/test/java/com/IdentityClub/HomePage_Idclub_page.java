package com.IdentityClub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Idclub_page 
{
	WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(),'Add a New Client')]")
	WebElement clickAddNewClient;
	
	
	
	
	
	public HomePage_Idclub_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_Addnew_client()
	{
		clickAddNewClient.click();
	}

}
