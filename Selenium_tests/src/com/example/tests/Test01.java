package com.example.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Test01 extends Test00 {


	  @Test
	  public void myTest1() {
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("webdriver");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		wait.until(titleIs("webdriver - Поиск в Google"));
	  }

	  @Test
	  public void myTest2() {
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("webdriver");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		wait.until(titleIs("webdriver - Поиск в Google"));
	  }

	  @Test
	  public void myTest3() {
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("webdriver");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		wait.until(titleIs("webdriver - Поиск в Google"));
	  }
 
	  public void main() {
		 myTest1();
		 myTest2();
		 myTest3();
	  }
	  
}
