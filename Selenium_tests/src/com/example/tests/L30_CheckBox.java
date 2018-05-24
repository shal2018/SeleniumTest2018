package com.example.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L30_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> sport = driver.findElements(By.xpath("//div[@class='display'][1]/input[@name='sports']"));
		
		for(WebElement e: sport){
			System.out.print(e.getAttribute("value")+"  - ");
			System.out.println(e.isSelected());
		}
		
		for(WebElement e: sport){
			if (e.getAttribute("value").equals("soccer")){
				e.click();
			}
			System.out.print(e.getAttribute("value")+"  - ");
			System.out.println(e.isSelected());
		}

		/*for(WebElement e: sport){
			if (e.getAttribute("value").equals("football")){
				e.click();
			}
		}*/

		for(WebElement e: sport){
			if (e.getAttribute("value").equals("soccer") ||
				e.getAttribute("value").equals("football")){
				e.click();
			}
		}
		
		
		Thread.sleep(10000);
		driver.quit();

	}

}
