package com.maven.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.maven.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTestOne {
  @Test	
  public void Verifyvalidlogin() {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  
	  LoginPage login = new LoginPage(driver);
	  login.LoginPage("Admin","admin123");
	  
	  driver.quit();
	  
  }
}
