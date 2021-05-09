package com.web.ecomm.qa.tests;

import java.io.IOException;
import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.web.coreframework.configurations.TestBase;
import com.web.coreframework.utils.xlsx.XlsxReader;
import com.web.ecomm.pages.HomePage;
import com.web.ecomm.pages.LoginPage;
import com.web.ecomm.pages.MyAccountPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	MyAccountPage accPage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeClass
	public void initialize(){
		TestBase.setUp();
		homePage = new HomePage();
	}
	
	@Test
	public void TC01_ValidSignInTest() throws IOException {
		loginPage=homePage.login();
		XlsxReader xcel= new XlsxReader(System.getProperty("user.dir")+"\\src\\main\\java\\com\\web\\ecomm\\testdata\\testdata.xlsx");
		ArrayList<String> data=xcel.getRowData("userdetails", 1);
		accPage=loginPage.signIn(data.get(0), data.get(1));
		Assert.assertEquals(accPage.getAccountUserName(), "Novak Djokovic");
	}
	

	@AfterClass
	public void end() {
		TestBase.tearDown();
	}
}
