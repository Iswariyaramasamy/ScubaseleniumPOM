package com.maven.project;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch{
	
	public static void main(String[] args) throws InterruptedException{

		//System.setProperty("webdriver.chrome.driver","C:/Users/sanjayp/eclipse-workspace-PicnicSelenium/SeleniumProject/drivers/chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.google.com/");    
		driver.manage().window().maximize();
		Thread.sleep(5000);   	
		WebElement searchBox = driver.findElement(By.name("q")); 
		searchBox.sendKeys("selenium");     
		searchBox.submit();    
		Thread.sleep(5000);  
		driver.quit();  
}
}

