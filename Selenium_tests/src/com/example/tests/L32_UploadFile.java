package com.example.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L32_UploadFile {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://tinypic.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.xpath(".//*[@id='the_file']")).sendKeys("D:\\Tools\\test.txt");
		driver.findElement(By.xpath("//*[@id='uploadfile']")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe");
		
		Thread.sleep(10000);
		//driver.quit();		
	}

}
