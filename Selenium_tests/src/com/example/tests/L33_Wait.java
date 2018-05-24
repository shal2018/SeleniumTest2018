package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L33_Wait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.softclub.by/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("qwe12");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("qwe12psw");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(Keys.ENTER);
		
		//Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='maillistview-1104']/div[6]/div[3]/div[2]")));
		driver.findElement(By.xpath("//*[@id='maillistview-1104']/div[6]/div[3]/div[2]")).click();
		

	}

}
