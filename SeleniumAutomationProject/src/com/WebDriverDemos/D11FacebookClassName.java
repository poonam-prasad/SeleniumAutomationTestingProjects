package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11FacebookClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement userId=driver.findElement(By.className("_6luy"));
		userId.sendKeys("poonamprasad94@gmail.com");
		
		WebElement password=driver.findElement(By.className("55r1 _"));
		password.sendKeys("test123");
	}

}
