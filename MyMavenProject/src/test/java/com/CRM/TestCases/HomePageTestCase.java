package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;

public class HomePageTestCase extends BaseClass {
	
	
	
  @Test (priority=1)
  public void verifyUrl() {
	 
	 String actURL=hp.getAppURL();
	 Assert.assertTrue(actURL.contains("crm"),"Test Fail:Url Not Matched");
	 System.out.println("Test Pass: Url Matched");
  }
  
  @Test (priority=2)
  public void verifyTitle()
  {
	  String actTitle=hp.getPageTitle();
	  Assert.assertTrue(actTitle.contains("Customer"),"Test Fail: Title not matched");
	  System.out.println("Test Pass: Title matched");
  }
  
  @Test (priority=3)
  public void verifySignInLink()
  { 
	  String nextPageUrl=hp.getStatusOfLink();
	  Assert.assertTrue(nextPageUrl.contains("login"));
	  System.out.println("Application navigating to Login Page");
	  
  }
}
