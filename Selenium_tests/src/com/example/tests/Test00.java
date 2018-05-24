package com.example.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test00 {
	  public static WebDriver driver;
	  public static WebDriverWait wait;

	  @Before
	  public void start() {
		if( driver != null) {
			return;
		}
	    driver = new FirefoxDriver();
	    wait = new WebDriverWait(driver,10);
	    
	    Runtime.getRuntime().addShutdownHook(
	    		new Thread(() -> {driver.quit(); driver = null; }));
	  }

	  @After
	  public void stop() {
	    //driver.quit();
	    //driver = null; 
	  }

}
