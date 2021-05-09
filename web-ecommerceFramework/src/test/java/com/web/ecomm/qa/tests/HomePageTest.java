package com.web.ecomm.qa.tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.web.coreframework.configurations.TestBase;
import com.web.ecomm.pages.HomePage;
import com.web.ecomm.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest(){
		super();
	}
	
	Logger log=Logger.getLogger(HomePageTest.class);
	
	@BeforeClass
	public void initialize(){
		TestBase.setUp();
		homePage = new HomePage();
	}
	
	
	
	@Test
	public void TC01_HomepageTitleTest() {
		Assert.assertEquals(homePage.validateHomePageTitle(), "My Store");
		log.info("********************************************" );
	}
	
	@Test
	public void TC02_HomepageSignInTest() {
		log.info("********************************************" );
		loginPage=homePage.login();
	}
	
	@AfterClass
	public void end() {
		TestBase.tearDown();
	}
	

}

	

