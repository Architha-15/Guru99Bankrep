package com.qa.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class CustomerRegistrationPage extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement backtohomeBtn;
	
	public CustomerRegistrationPage() {
		PageFactory.initElements(driver, this);
	  }
	
	
	public String validateCustomerRegistrationPageTitle() {
		 return driver.getTitle();
	}
	
	
	public HomePage clickOnHome() {
		backtohomeBtn.click();
		return new HomePage();
		
	}

	
	

}
