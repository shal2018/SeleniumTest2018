package com.example.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L24_iFrames {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//1st
		/*List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath("//*[@id='draggable']"));
		System.out.println(element.getText());
		
	
		driver.switchTo().defaultContent();
		element = driver.findElement(By.xpath("//*[@id='content']/h1"));
		System.out.println(element.getText());
		*/

		//2nd
		WebElement frame = driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(frame);
		WebElement element2 = driver.findElement(By.xpath("//*[@id='draggable']"));
		System.out.println(element2.getText());

	}

}
