package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageobjects.CustomisedStatementPage;
import com.qa.pageobjects.CustomoisedStatement;
import com.qa.pageobjects.GtplBankRegPage;
import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.NewAccount;
import com.qa.testbase.TestBase;

public class CustomisedStatementTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	
	CustomoisedStatement customisedStmt;
	CustomisedStatementPage customerStmtPage;
	
	
	public CustomisedStatementTest() {
		
	   super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		customisedStmt	=homePage.clickOnCustomisedStatement();
		
		}
	
	@Test
	public void fillCustomisedStatementFormTest() throws Exception {
		customerStmtPage=customisedStmt.fillCustomisedStatementForm(prop.getProperty("accountid"), prop.getProperty("date1"), prop.getProperty("month1"), prop.getProperty("year1"), prop.getProperty("date2"), prop.getProperty("month2"), prop.getProperty("year2"), prop.getProperty("mintransactionvalue"), prop.getProperty("numoftransaction"));
		
	}
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
		Thread.sleep(3000);
	}
}






