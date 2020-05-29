package com.SmartCredit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewClientPage_Smart_page 
{
	WebDriver driver;
	
	@FindBy(id = "fname")
	WebElement enterFirstname;
	
	@FindBy(id = "lname")
	WebElement enterLastname;
	
	@FindBy(id = "chknoemail")
	WebElement checkBox;
	
	@FindBy(id = "sub_button")
	WebElement clickSubmit;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement warningMessage;
	
	
	
	
	public AddNewClientPage_Smart_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enter_Firstname(String fname)
	{
		enterFirstname.sendKeys(fname);
	}
	
	public void enter_Lastname(String lname)
	{
		enterLastname.sendKeys(lname);
	}
	
	public void check_Box()
	{
		checkBox.click();
	}
	
	public void click_Submit()
	{
		clickSubmit.click();
	}
	
	public void warning_Message()
	{
		warningMessage.click();
	}

}
