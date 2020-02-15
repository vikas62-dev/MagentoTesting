package com.abc.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	WebDriver driver;
	
	By logout=By.linkText("Log Out");

	public Homepage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	public void clickOnLogOut() {
		driver.findElement(logout).click();
	}
	
			

}
