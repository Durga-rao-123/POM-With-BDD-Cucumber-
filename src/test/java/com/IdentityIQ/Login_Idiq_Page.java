package com.IdentityIQ;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilPackage.BaseClass;



public class Login_Idiq_Page extends BaseClass
{
	
	//public static WebDriver driver;
	private static final HomePage HomePage = null;
	

	@FindBy(xpath = "//div[@class='top-logo-box']//a//img")
	WebElement CRCLogo;
	
	@FindBy(id = "username") 
	WebElement LoginUsername;
	
	@FindBy(id = "password")
	WebElement LoginPassword;
	
	@FindBy(id = "signin")
	WebElement SignIn;
	
	
	public Login_Idiq_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CRC_Logo() 
	{	
		CRCLogo.isDisplayed();
	}
	
	public String validateLoginPageTitle()
	{
 		return driver.getTitle(); 
	
	}
	
	public HomePage login_user_name(String uname)
	{
		LoginUsername.sendKeys(uname);
		
		return HomePage;
	}
	
	
	public void login_password(String pword)
	{
		LoginPassword.sendKeys(pword);
		
	}
	
	public void signIn()
	{
		SignIn.click();
			
	}
	

}
