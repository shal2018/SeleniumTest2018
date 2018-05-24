package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class L27_Slider {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
		WebElement sliderLine = driver.findElement(By.xpath("//*[@id='slider']"));
		slider.click();
		
		Actions action = new Actions(driver);
		action.moveToElement(slider).dragAndDropBy(slider, sliderLine.getSize().width /2, 0).build().perform();
				

	}

}
