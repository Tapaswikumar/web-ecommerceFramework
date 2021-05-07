package com.web.ecomm.pages;

import com.web.coreframework.configurations.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase{
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement SigninBtn;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
		
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public MyAccountPage signIn (String mail, String passwrd) {
		email.sendKeys(mail);
		password.sendKeys(passwrd);
		SigninBtn.click();
		return new MyAccountPage();		
	}
	
	
}
