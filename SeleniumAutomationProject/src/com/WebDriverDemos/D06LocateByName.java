package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06LocateByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement userName=driver.findElement(By.name("email"));
		userName.sendKeys("poonamprasad94@gmail.com");
		
		WebElement passWord=driver.findElement(By.name("pass"));
		passWord.sendKeys("Bobby001");
		
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		

	}

}
