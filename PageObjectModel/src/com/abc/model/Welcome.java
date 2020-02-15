package com.abc.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {
	WebDriver driver;
	By myacct=By.linkText("My Account");
	
	public Welcome(WebDriver driver) {
		this.driver=driver;
	}
	public void clickOnMyAccount() {
		driver.findElement(myacct).click();
	}

}
