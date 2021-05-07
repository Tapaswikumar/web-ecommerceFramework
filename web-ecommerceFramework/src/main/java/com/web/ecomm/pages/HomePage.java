package com.web.ecomm.pages;

import com.web.coreframework.configurations.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends TestBase {
	
	@FindBy(className = "login")
	WebElement loginBtn;
	
	//Initializing the Page Objects:
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
		
	//	Actions	
		
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public LoginPage login(){
			loginBtn.click();
			return new LoginPage();
		}

}
