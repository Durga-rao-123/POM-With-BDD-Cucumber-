package com.IdentityClub;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.IdentityIQ.HomePage;
import com.utilPackage.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class IdClub_StepDef extends BaseClass
{
	@Given("^user open Browser$")
	public void user_open_Browser() throws Throwable 
	{
		BaseClass.initialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable 
	{
		Login_IdClub_Page loginpage = new Login_IdClub_Page(driver);
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals("Credit Repair Cloud | Credit Repair Software CRM | Try it FREE!", title);
	    
	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() throws Throwable
	{
		Login_IdClub_Page loginpage = new Login_IdClub_Page(driver);
		loginpage.enter_login_username(prop.getProperty("username"));
		loginpage.enter_login_password(prop.getProperty("password"));
	   
	}

	@Then("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable 
	{
		Login_IdClub_Page loginpage = new Login_IdClub_Page(driver);
		loginpage.clickon_submit();
	    
	}

	@Then("^user is on Home Page And validate title$")
	public void user_is_on_Home_Page_And_validate_title() throws Throwable 
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='checklist-box-text']")));
		String homepageHeader = driver.findElement(By.xpath("//div[@class='checklist-box-text']")).getText();
		Assert.assertEquals("Checklist For Starting A Credit Repair Business", homepageHeader);
	    
	}

	@When("^user click  on Add newClient Button$")
	public void user_click_on_Add_newClient_Button() throws Throwable 
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Add a New Client')]")));
		HomePage home = new HomePage(driver);
		home.clickon_Addnew_client();
	    
	}

	@Then("^user is on Add NewClient page$")
	public void user_is_on_Add_NewClient_page() throws Throwable 
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='content1']")));
		String addclientText = driver.findElement(By.xpath("//div[@class='content1']")).getText();

		Assert.assertEquals("Add Client", addclientText);
	    
	}

	@When("^user enter firstname and lastname$")
	public void user_enter_firstname_and_lastname() throws Throwable 
	{
		AddNewClient_idclub_page add = new AddNewClient_idclub_page(driver);
		add.enter_Firstname(prop.getProperty("Idclubfirstname"));
		add.enter_Lastname(prop.getProperty("Idclublastname"));
	    
	}

	@When("^user click on client has no email$")
	public void user_click_on_client_has_no_email() throws Throwable
	{
		AddNewClient_idclub_page add = new AddNewClient_idclub_page(driver);
	    add.check_Box();
	    
	}

	@When("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable
	{
		AddNewClient_idclub_page add = new AddNewClient_idclub_page(driver);
	    add.click_submit();
	   
	}

	@Then("^user should see warning message$")
	public void user_should_see_warning_message() throws Throwable 
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
	    
	}

	@When("^user click on ok button$")
	public void user_click_on_ok_button() throws Throwable 
	{
		AddNewClient_idclub_page add = new AddNewClient_idclub_page(driver);
		add.warning_Message();
	    
	}

	@Then("^user should see Client Dashboard page$")
	public void user_should_see_Client_Dashboard_page() throws Throwable 
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='innermenuactive']")));
		String clientDashboardText = driver.findElement(By.xpath("//li[@class='innermenuactive']")).getText();
		Assert.assertEquals("Client Dashboard", clientDashboardText);
	    
	}

	@When("^user click on (\\d+)-click import and audit$")
	public void user_click_on_click_import_and_audit(int arg1) throws Throwable
	{
		ClientDashboard_idclub_page client = new ClientDashboard_idclub_page(driver);
		client.clickImportAndAudit();
	    
	}

	@Then("^user should see Enter&confirm credit monitoring access details page$")
	public void user_should_see_Enter_confirm_credit_monitoring_access_details_page() throws Throwable 
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Enter & Confirm Credit Monitoring Access Details')]")));
		String creditMonitoringText = driver.findElement(By.xpath("//h3[contains(text(),'Enter & Confirm Credit Monitoring Access Details')]")).getText();

		Assert.assertEquals("Enter & Confirm Credit Monitoring Access Details", creditMonitoringText);
	   
	}

	@When("^user click on dropdown and select identityclub$")
	public void user_click_on_dropdown_and_select_identityclub() throws Throwable
	{

		CreditMonitoringAccessDetails_idclub_page credit = new CreditMonitoringAccessDetails_idclub_page(driver);
		credit.select_Dropdown(prop.getProperty("Idclubdropdown"));
	    
	}

	@When("^user enter username and password and security word$")
	public void user_enter_username_and_password_and_security_word() throws Throwable
	{
		CreditMonitoringAccessDetails_idclub_page credit = new CreditMonitoringAccessDetails_idclub_page(driver);
		credit.enter_Report_username(prop.getProperty("Idclubreportusername"));
		credit.enter_Report_password(prop.getProperty("Idclubreportpassword"));
		
	    
	}

	@When("^user click on import run and simple audit$")
	public void user_click_on_import_run_and_simple_audit() throws Throwable 
	{
		CreditMonitoringAccessDetails_idclub_page credit = new CreditMonitoringAccessDetails_idclub_page(driver);
	    credit.import_report_And_runSimple_Audit();
	    
	}

}
