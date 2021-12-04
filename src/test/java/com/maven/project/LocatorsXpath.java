package com.maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsXpath {
	
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
		
		WebElement buz = driver.findElement(By.xpath("//b[contains(text(),'Buzz')]"));
		buz.click();
		Thread.sleep(1000);
		WebElement post = driver.findElement(By.xpath("//textarea[@id='createPost_content']"));
		post.sendKeys("I am happy with this OrangeHRM");
		
	
		
		
	}

	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}



