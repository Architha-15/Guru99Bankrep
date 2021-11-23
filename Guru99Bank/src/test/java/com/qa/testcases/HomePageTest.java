package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.NewCustomer;
import com.qa.testbase.TestBase;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	NewCustomer newcustomer;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		newcustomer=new NewCustomer();
	}
	
	@Test(priority=1)
	public void validateManagerHomePageTitleTest() {
	String title2 = homePage.validateManagerHomePageTitle();
	Assert.assertEquals(title2,"Guru99 Bank Manager HomePage");
		
	}
	
	
	@Test(priority=2)
	public void validateManagerHomePageImageTest() {
		boolean flag1 = homePage.validateManagerHomePageImage();
		Assert.assertTrue(flag1);
		
	}
	
	
	
	
	
	@Test(priority=3)
	public void clickOnNewcustomerTest() throws Exception {
		newcustomer = homePage.clickOnNewcustomer();
		Thread.sleep(3000);
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
		Thread.sleep(4000);
	}
	
	

}
