package com.qa.testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pageobjects.CustomerRegistrationPage;
import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.NewCustomer;
import com.qa.testbase.TestBase;
import com.qa.utils.DataProviderUtils;

public class NewCustomerTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	NewCustomer newCustomer;
	CustomerRegistrationPage cusreg;
	
	public NewCustomerTest() {
	   super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		newCustomer=homePage.clickOnNewcustomer();
		}
	
	@Test(priority=1)
	public void  validateNewCustomerPageTitleTest() throws Exception {
	String title3	=  newCustomer.validateNewCustomerPageTitle();
	Assert.assertEquals(title3,"Guru99 Bank New Customer Entry Page");
	Thread.sleep(4000);
	}
	
	
	@Test(priority=2, dataProvider="getTestData")
	public void registrationTest(String cname, String gender,String  date,String month, String year,String  address,String  city,String  state,String  pin,String  mobile,String  emailid, String passwords) throws Exception {
		cusreg	= newCustomer.registration(cname, gender, date, month, year, address, city, state, pin, mobile, emailid, passwords);
		Thread.sleep(5000);
		
	}
	
	
	
	
	
	  @DataProvider
	  public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testdata = DataProviderUtils.getDataFromExcel();
		return testdata.iterator();
		  
	  }
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
		Thread.sleep(3000);
	}
	
	

}
