package com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class LoginPageTestCase extends BaseClass
{	
	@BeforeClass
	public void PageSetUp()
	{
		hp.getStatusOfLink();
	}
	
  @Test
  public void verifyLogin() 
  {
	  String url=lp.doLogin("test@gmail.com", "Test123");
	  Assert.assertTrue(url.contains("customers"),"Test Fail: Login Fail");
	  System.out.println("Test Pass: Login Succcessful");
  }
}
