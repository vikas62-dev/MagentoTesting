package com.abc.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By email=By.id("email");
	By password=By.id("pass");
	By login=By.id("send2");
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	public void typeEmail(String em) {
		driver.findElement(email).sendKeys(em);
	}
	
	public void typePassword(String pw) {
		driver.findElement(password).sendKeys(pw);
	}
	public void clickOnLogin() {
		driver.findElement(login).click();
	}
	
	

}
