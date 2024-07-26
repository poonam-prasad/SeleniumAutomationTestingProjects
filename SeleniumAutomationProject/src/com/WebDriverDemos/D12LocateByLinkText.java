package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12LocateByLinkText {

	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			
			WebElement gmail=driver.findElement(By.linkText("Gmail"));
			System.out.println(gmail.getText());
			String url=gmail.getAttribute("href");
			System.out.println(url);
			gmail.click();
			
		}	

	}


