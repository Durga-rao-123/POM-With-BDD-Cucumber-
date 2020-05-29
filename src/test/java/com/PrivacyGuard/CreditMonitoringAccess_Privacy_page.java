package com.PrivacyGuard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreditMonitoringAccess_Privacy_page
{
	WebDriver driver;
	
	@FindBy(id = "auto_selprovider")
	WebElement selectDropdown;
	
	@FindBy(id = "auto_vcr_username")
	WebElement enterReportUsername;
	
	@FindBy(id = "auto_vcr_password")
	WebElement enterReportPasswrod;
	
	@FindBy(id = "auto_vcr_securityword")
	WebElement enterSecurityWord;
	
	@FindBy(id = "auto_btnsubmit_with_pending")
	WebElement clickOnImportReportAndRunSimpleAudit;
	
	
	
	
	public CreditMonitoringAccess_Privacy_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void select_Dropdown(String privacy)
	{
		Select dropdown = new Select(selectDropdown);
		dropdown.selectByValue(privacy);
	}
	
	public void enter_Report_Username(String reportunmae)
	{
		enterReportUsername.sendKeys(reportunmae);
	}
	
	public void enter_Report_password(String pword)
	{
		enterReportPasswrod.sendKeys(pword);
	}
	
	public void enter_Security_word(String ssn)
	{
		enterSecurityWord.sendKeys(ssn);
	}
	
	public void import_report_And_runSimple_Audit()
	{
		clickOnImportReportAndRunSimpleAudit.click();
	}

}
