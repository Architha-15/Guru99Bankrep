package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageobjects.CustomerRegistrationPage;
import com.qa.pageobjects.GtplBankRegPage;
import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.NewAccount;
import com.qa.pageobjects.NewCustomer;
import com.qa.testbase.TestBase;


	public class NewAccountTest extends TestBase{
		LoginPage loginPage;
		HomePage homePage;
		
		NewAccount newAccount;
		GtplBankRegPage gtplBankRegPage;
		
		public NewAccountTest() {
			
		   super();
		}
		
		@BeforeMethod
		public void setUp() {
			intialization();
			loginPage = new LoginPage();
			homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			newAccount=homePage.clickOnnewAccount();
			}
		
		@Test
		public void fillNewAccountFormTest() throws Exception {
			gtplBankRegPage	= newAccount.fillNewAccountForm(prop.getProperty("customerid1"), prop.getProperty("intialdeposit"));
			Thread.sleep(3000);
			
		}
		
		
		
		
		
		
		
		
		@AfterMethod
		public void tearDown() throws Exception {
			driver.quit();
			Thread.sleep(3000);
		}
	}



