package com.utilPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class BaseClass
{
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() { 
	try{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\pmaniratnam\\eclipse-workspace\\PageObject_BDDframe_Work\\PropertyFile\\config.properties");
		prop.load(fis);
	}catch(IOException e) {
		e.getMessage();
	}
}
	
	public static void initialization() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
		
	}
}
