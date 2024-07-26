package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CRM.Utility.Utility;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver ) //Base class driver
	{
		this.driver=driver;
	}
	
	private By link=By.linkText("Sign In"); //link is reference variable/object name
	
	public String getAppURL()
	{
		return driver.getCurrentUrl();
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getStatusOfLink()
	{ Utility.getScreenShot(driver);
		driver.findElement(link).click();
		Utility.getScreenShot(driver);
		return driver.getCurrentUrl();
	}
	
}