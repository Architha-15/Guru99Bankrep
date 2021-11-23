package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageobjects.DepositPage;
import com.qa.pageobjects.GtplBankRegPage;
import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.NewAccount;
import com.qa.pageobjects.TransactionDepositPage;
import com.qa.testbase.TestBase;

public class DepositPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	DepositPage depositPage;
	TransactionDepositPage transactionDepositPage;
	
	
	
	public DepositPageTest() {
		
	   super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		depositPage=homePage.clickOnDeposit();
		}
	
	@Test
	public void  fillAmountDepositFormTest() throws Exception {
		transactionDepositPage = depositPage.fillAmountDepositForm(prop.getProperty("accountid"), prop.getProperty("amount"), prop.getProperty("description"));
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
		Thread.sleep(3000);
	}
}




