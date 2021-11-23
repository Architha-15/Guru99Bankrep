package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageobjects.GtplBankRegPage;
import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.NewAccount;
import com.qa.testbase.TestBase;

public class GtplBankRegPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	NewAccount newAccount;
	GtplBankRegPage gtplBankRegPage;
	
	public GtplBankRegPageTest() {
		
	   super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		newAccount=homePage.clickOnnewAccount();
		gtplBankRegPage=newAccount.fillNewAccountForm(prop.getProperty("customerid1"),prop.getProperty("intialdeposit"));
		}
	
	@Test(priority=1)
	public void validateSuccessfulAccountTextTest() throws Exception {
		String text1 = gtplBankRegPage.validateSuccessfulAccountText();
		Assert.assertEquals(text1, "Account Generated Successfully!!!");
		Thread.sleep(3000);
		
	}
	
	
	@Test(priority=2)
	public void clickOnHomeTest() {
		homePage = gtplBankRegPage.clickOnHome();
	
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
		Thread.sleep(3000);
	}
}




