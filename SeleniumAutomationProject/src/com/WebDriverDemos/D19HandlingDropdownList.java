package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D19HandlingDropdownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement drpList=driver.findElement(By.id("country"));
		Select countries=new Select(drpList);
		 System.out.println(countries.getFirstSelectedOption().getText());
		 List <WebElement>	countryList=countries.getOptions();
		 for(WebElement countryAll:countryList)
		 {
			 System.out.println(countryAll.getText());
		 }
		 
		 
		
	}

}
