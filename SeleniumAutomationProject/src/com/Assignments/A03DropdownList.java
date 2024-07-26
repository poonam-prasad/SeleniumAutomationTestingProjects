package com.Assignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A03DropdownList {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement dropdown=driver.findElement(By.id("country"));
		Select countryList=new Select(dropdown);
		
		System.out.println("Default country selected is "+countryList.getFirstSelectedOption().getText());
		List<WebElement> countries=countryList.getOptions();
		
		System.out.println("Total countries are "+countries.size());
		
		//Selecting United States from dropdown list based on Visible Text
				countryList.selectByVisibleText("United States");
				System.out.println("Selected country is "+countryList.getFirstSelectedOption().getText());
		
		//Selecting Australia from dropdown list based on Index
				countryList.selectByIndex(10);
				System.out.println("Selected country is "+countryList.getFirstSelectedOption().getText());
		
		//Selecting Canada from dropdown list based on Value
				countryList.selectByValue("37");
				System.out.println("Selected country is "+countryList.getFirstSelectedOption().getText());
				
		//Printing all Countries in Console
		for(WebElement allCountries:countries)
		{
			System.out.println(allCountries.getText());
		}
	
	}

}
