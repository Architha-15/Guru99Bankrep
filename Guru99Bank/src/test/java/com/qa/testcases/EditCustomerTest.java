package com.qa.testcases;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageobjects.EditCustomer;
import com.qa.pageobjects.EditCustomerEntryPage;
import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.LoginPage;
import com.qa.testbase.TestBase;

public class EditCustomerTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	EditCustomer editCustomer;
	EditCustomerEntryPage editCustomerEntry;

	
	public EditCustomerTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		editCustomer = homePage.clickOnEditCustomer();
	}
	
	
	@Test(priority=1)
	public void validateEditCustomerPageTitleTest() {
		String title5 = editCustomer.validateEditCustomerPageTitle();
		Assert.assertEquals(title5, "Guru99 Bank Edit Customer Page");
	}
	
	
	@Test(priority=2)
	public void provideCustomerIdTest() {
		editCustomerEntry = editCustomer.provideCustomerId(prop.getProperty("customerid1"));
	}
	
	
	
	
	
	
	
	
	
	   @AfterMethod
		public void tearDown() throws Exception {
		driver.quit();
		Thread.sleep(3000);
	}
}
