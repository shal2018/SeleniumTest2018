package com.example.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L22_DynamixXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("http:\\yahoo.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='uh-search-box']")).sendKeys("selenium");
		Thread.sleep(5000);
		
		//List<WebElement> list = driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3')]/span/b[starts-with(text(),'selenium')]"));
		//List<WebElement> list = driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3')][starts-with(@data,'selenium')]"));
		List<WebElement> list = driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3')]/span"));
		//[contains(text(),'selenium')]
		//Thread.sleep(5000);
		
		//Не заработало как хотелось бы!!
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			/*if(list.get(i).getText().contains(">selenium")) {
				System.out.println(list.get(i).getText());
			}*/
		//comment
		}
					
		}

	}


