package com.example.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L23_RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@name='group1']"));
		
		for(WebElement e: list){
			System.out.println(e.getAttribute("value"));
			System.out.println(e.isSelected());
			if(e.getAttribute("value").equals("Cheese")) {
				e.click();
			}
			
		}
		
		for(WebElement e: list){
			System.out.println(e.getAttribute("value"));
			System.out.println(e.isSelected());
		}
		
		list.get(2).click();
		Thread.sleep(2000);
		
		list.get(1).click();
		Thread.sleep(2000);
		

	}

}
