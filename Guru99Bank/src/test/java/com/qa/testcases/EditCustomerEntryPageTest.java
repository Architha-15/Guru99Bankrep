package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageobjects.CustomerRegistrationPage;
import com.qa.pageobjects.EditCustomer;
import com.qa.pageobjects.EditCustomerEntryPage;
import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.LoginPage;
import com.qa.testbase.TestBase;

public class EditCustomerEntryPageTest extends TestBase {
   LoginPage loginPage;
   HomePage homePage;
   EditCustomer editCustomer;
   EditCustomerEntryPage editCustomerEntry;
   CustomerRegistrationPage customerRegistrationPage;
   
   
   public EditCustomerEntryPageTest() {
	   super();
   }
   
   
   
   @BeforeMethod
   public void setUp() {
	   intialization();
	   loginPage=new LoginPage();
	   homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	   editCustomer=homePage.clickOnEditCustomer();
	   editCustomerEntry = editCustomer.provideCustomerId(prop.getProperty("customerid1"));
	   
   }
   
   
   @Test(priority=1)
	public void  validateEditCustomerEntryPageCustomerPageTitleTest()  {
		String title6 = editCustomerEntry.validateEditCustomerEntryPageCustomerPageTitle();
		Assert.assertEquals(title6, "Guru99 Bank Edit Customer Entry Page");
	}
	
   
	
	@Test(priority=2)
	public void editAddressTest() throws Exception {
		customerRegistrationPage= editCustomerEntry.editAddress(prop.getProperty("address"));
		Thread.sleep(3000);
	}
	
	
	@Test(priority=3)
	public void clickOnHomeTest() throws Exception {
		homePage= editCustomerEntry.clickOnHome();
		Thread.sleep(5000);
	}
	
	
	
	
	
	
	
	
	
	   @AfterMethod
		public void tearDown() throws Exception {
		driver.quit();
		Thread.sleep(3000);
	}
}

   

