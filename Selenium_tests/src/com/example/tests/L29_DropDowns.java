package com.example.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class L29_DropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rediff.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='signin_info']/a[2]")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		
		List<WebElement> option = dropdown.findElements(By.tagName("option"));
		System.out.println(option.size());
		
		String element;
		for(int i=0;i<option.size();i++){
			element = option.get(i).getAttribute("value");
			if (element.equals("25")) {
				option.get(i).click();
			}
		}
		
		Thread.sleep(5000);
		driver.quit();

	}

}
