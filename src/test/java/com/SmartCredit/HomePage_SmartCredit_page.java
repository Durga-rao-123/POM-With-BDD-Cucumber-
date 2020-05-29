package com.SmartCredit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_SmartCredit_page
{
	WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(),'Add a New Client')]")
	WebElement clickOnAddNewClient;
	
	

	public HomePage_SmartCredit_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickon_AddnewClient()
	{
		clickOnAddNewClient.click();
	}

}
