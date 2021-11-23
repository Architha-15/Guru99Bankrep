package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.LoginPage;
import com.qa.testbase.TestBase;
import com.qa.utils.TestUtils;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage=new LoginPage();
		}
	
	
	@Test(priority=1)
	public void validateLoginPageTitleTest() {
	String title1 = loginPage.validateLoginPageTitle();
	Assert.assertEquals(title1,"Guru99 Bank Home Page");
	}
	
	@Test(priority=2)
	public void validateLoginPageLogoTest() {
		boolean flag = loginPage.validateLoginPageLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
		Thread.sleep(4000);
	}
	

}
