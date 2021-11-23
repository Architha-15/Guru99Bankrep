package com.qa.testcases;

import org.testng.Assert;
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

public class TransactionDepositTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	DepositPage depositPage;
	TransactionDepositPage transactionDepPage;
	
	
	
	public TransactionDepositTest() {
		
	   super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		depositPage=homePage.clickOnDeposit();
		transactionDepPage=depositPage.fillAmountDepositForm(prop.getProperty("accountid"), prop.getProperty("amount"),prop.getProperty("description"));
		}
	
	@Test(priority=1)
	public void validateSuccessfulTransactionTextTest() throws Exception {
		String text2 = transactionDepPage.validateSuccessfulTransactionText();
		Assert.assertEquals(text2, "Transaction details of Deposit for Account 100884");
		Thread.sleep(3000);
		
	}
	
	
	@Test(priority=2)
	public void clickOnHomeTest() throws Exception {
		homePage = transactionDepPage.clickOnContinue();
		Thread.sleep(3000);
		
	
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
		Thread.sleep(3000);
	}
}





