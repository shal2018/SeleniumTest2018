package com.example.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L16_FindingElements {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https:\\w3schools.com");
		
		/*List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			//System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("Learn CSS")){
				list.get(i).click();
				break;
			}
		}*/
		
		List<WebElement> list = driver.findElements(By.className("w3-container top"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
		}
		
		//List<WebElement> list = driver.findElements(By.className("w3-button w3-dark-grey"));
		//for(int i=0; i<list.size();i++){
		//	if(list.get(i).getText().equals("LEARN HTML")){
		//		list.get(i).click();
		//		break;
		//	}
		//}

	}

}
