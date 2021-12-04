package com.maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	
	WebDriver driver;
	@BeforeSuite
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void LocatorsTest() throws InterruptedException {
		// TODO Auto-generated method stub
	
		
		WebElement Usrname = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement Login = driver.findElement(By.name("Submit"));
		
		Usrname.sendKeys("Admin");
		password.sendKeys("admin123");
		Login.click();
		
		Thread.sleep(1000);
		
		
		/*WebElement signout = driver.findElement(By.xpath("//a[@id='welcome']"));
		signout.click();
		WebElement logout= driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();*/
		
		
	}

	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
