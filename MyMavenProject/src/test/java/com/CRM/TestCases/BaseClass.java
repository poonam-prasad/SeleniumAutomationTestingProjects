package com.CRM.TestCases;

import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;
import com.CRM.Pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver;
	public HomePage hp;
	public LoginPage lp;
  
  @BeforeTest
  public void setUp() {
	  driver=new ChromeDriver();
	  driver.get("https://automationplayground.com/crm/");
	  driver.manage().window().maximize();
	  
	  hp=new HomePage(driver);
	  lp=new LoginPage(driver);
  }

}
