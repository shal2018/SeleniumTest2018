package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS_Selector {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https:\\google.com");
		
		driver.findElement(By.xpath("//*[@id='gb_70']")).click();
		//driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys("myId");
		driver.findElement(By.cssSelector("input[id='identifierId'][name='identifier']")).sendKeys("myId");

	}

}
