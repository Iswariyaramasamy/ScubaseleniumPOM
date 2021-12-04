/**
 * 
 */
package com.maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author iswariyar
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	By username= By.id("txtUsername");
	By password = By.name("txtPassword");
	By Loginbutton = By.xpath("//input[@id='btnLogin']");
	By Forgotpassword = By.xpath("//a[contains(text(),'Forgot your password?')]");
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void LoginPage(String userid, String pass) {
		
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(Loginbutton).click();
	}
	

}
