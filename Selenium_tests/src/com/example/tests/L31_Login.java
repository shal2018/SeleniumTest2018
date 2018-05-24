package com.example.tests;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L31_Login {

	static String encodedPassword= "MTIzNDU2";
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://rediff.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("sss");
		//driver.findElement(By.xpath("//*[@id='password']")).sendKeys("sss");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(getDecodedPassword());
				
		Thread.sleep(10000);
		driver.quit();
	}

	public static String getDecodedPassword(){
		return new String(Base64.getDecoder().decode(encodedPassword.getBytes()));
	}
	
}
