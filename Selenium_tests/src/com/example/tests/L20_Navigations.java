package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L20_Navigations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https:\\google.com");
		driver.navigate().to("https:\\google.com");
		driver.findElement(By.xpath("//*[@id='gb_70']")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//driver.close();
		driver.quit();

	}

}
