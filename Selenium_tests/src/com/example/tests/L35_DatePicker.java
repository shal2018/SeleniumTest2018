package com.example.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L35_DatePicker {

	static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.tripadvisor.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='global-nav-flights']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='taplc_trip_search_home_flights_0']/div[2]/div/span/div[1]/div/div[1]/div/div[1]/input[2]")));
		driver.findElement(By.xpath("//*[@id='taplc_trip_search_home_flights_0']/div[2]/div/span/div[1]/div/div[1]/div/div[1]/input[2]")).sendKeys("Minsk"+Keys.TAB);
		//driver.findElement(By.xpath("//*[@id='taplc_trip_search_home_flights_0']/div[2]/div/span/div[1]/div/div[1]/div/div[1]/input[2]")).sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='taplc_trip_search_home_flights_0']/div[2]/div/span/div[1]/div/div[1]/div/div[2]/input[2]")));
		driver.findElement(By.xpath("//*[@id='taplc_trip_search_home_flights_0']/div[2]/div/span/div[1]/div/div[1]/div/div[2]/input[2]")).sendKeys("Moscow"+Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='taplc_trip_search_home_flights_0']/div[2]/div/span/div[1]/div/div[1]/div/div[2]/input[2]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath(".//*[@id='rt_ui_picker']/span[1]")).click();
		
		String date = "17-June 2018";
		String splitter[] = date.split("-");
		String checkInmonth_year = splitter[1];
		String checkInday = splitter[0];
	
		selectDate(checkInmonth_year,checkInday);

		date = "22-July 2018";
		splitter = date.split("-");
		String checkOutmonth_year = splitter[1];
		String checkOutday = splitter[0];
		
		selectDate(checkOutmonth_year,checkOutday);
		
	
		Thread.sleep(10000);
		driver.quit();

	}

	public static void selectDate(String month_year, String day){
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='dsdc-months']/span[@class='dsdc-month']/span[@class='dsdc-month-title']"));
		for (int i=0; i<elements.size(); i++){
			System.out.println("Μερÿφ = "+elements.get(i).getText());
			List<WebElement> days = driver.findElements(By.xpath("//div[@class='dsdc-months']/span[@class='dsdc-month']["+(i+1)+"]/span[@data-date]"));
			for(WebElement d:days){
				System.out.println(d.getText());
				if(d.getText().equals(day)){
					d.click();
					return;
				}
			}
		}
				
	}	
}
