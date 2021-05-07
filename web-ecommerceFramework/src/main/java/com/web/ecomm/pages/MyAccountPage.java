package com.web.ecomm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.coreframework.configurations.TestBase;

public class MyAccountPage extends TestBase {
	
	@FindBy(xpath = "//a[@class='account']//span")
	WebElement accountUserName;
	
	// Initializing the Page Objects:
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getAccountUserName() {
		return accountUserName.getText();
	}

}
