package com.MyFreeScoreNow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_MyFree_page 
{
	WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(),'Add a New Client')]")
	WebElement clickOnAddnewClient;
	
	
	
	public Home_MyFree_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String VerifyHomePageTitle()
	{
		return driver.getTitle();
		
	}
	
	public void clickon_AddNew_Client()
	{
		clickOnAddnewClient.click();
	}

}
