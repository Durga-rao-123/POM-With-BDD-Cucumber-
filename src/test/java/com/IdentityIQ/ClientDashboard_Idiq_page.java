package com.IdentityIQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientDashboard_Idiq_page
{
	
	WebDriver driver;
	
	
	
	@FindBy(xpath = "//div[@class='client']//div[1]//div[1]//div[2]")
	WebElement clickImportAndAudit;
	
	
	
	
	
	public ClientDashboard_Idiq_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public void clickImportAndAudit() 
	{
		clickImportAndAudit.click();
	}

}
