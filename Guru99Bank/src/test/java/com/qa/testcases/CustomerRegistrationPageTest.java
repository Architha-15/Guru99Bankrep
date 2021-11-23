package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageobjects.CustomerRegistrationPage;
import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.NewCustomer;
import com.qa.testbase.TestBase;
import com.qa.utils.DataProviderUtils;
import com.qa.utils.Xls_Reader;

public class CustomerRegistrationPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	NewCustomer newCustomer;
	CustomerRegistrationPage cusRegpage;
	DataProviderUtils dProviderUtils;
	
	Xls_Reader reader;
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		newCustomer=homePage.clickOnNewcustomer();
		
		
		cusRegpage	=newCustomer.registration(reader.getCellData("regdetails", "cusname", reader.getRowCount("regdetails")),reader.getCellData("regdetails", "gen", reader.getRowCount("regdetails")),reader.getCellData("regdetails", "date", reader.getRowCount("regdetails")),reader.getCellData("regdetails", "month", reader.getRowCount("regdetails")),reader.getCellData("regdetails", "year", reader.getRowCount("regdetails")),reader.getCellData("regdetails", "address", reader.getRowCount("regdetails")),reader.getCellData("regdetails", "city", reader.getRowCount("regdetails")),reader.getCellData("regdetails", "state", reader.getRowCount("regdetails")),reader.getCellData("regdetails", "pin", reader.getRowCount("regdetails")),reader.getCellData("regdetails", "mobile", reader.getRowCount("regdetails")),reader.getCellData("regdetails", "emailid", reader.getRowCount("regdetails")),reader.getCellData("regdetails", "passwords", reader.getRowCount("regdetails")));
				
	}
	
	@Test(priority=1)
	public void  validateNewCustomerPageTitleTest() throws Exception {
	String title4	=  cusRegpage.validateCustomerRegistrationPageTitle();
	Assert.assertEquals(title4,"Guru99 Bank Customer Registration Page");
	Thread.sleep(4000);
	}
	
	@Test(priority=2)
	public void clickOnHomeTest() {
	 homePage=cusRegpage.clickOnHome();
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
		Thread.sleep(3000);
	}
	

}
