package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class L25_Drag {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		System.out.println(drag.getText());
		
		Actions action = new Actions(driver);
		action.moveToElement(drag).dragAndDropBy(drag, 50, 20).build().perform();
		

	}

}
