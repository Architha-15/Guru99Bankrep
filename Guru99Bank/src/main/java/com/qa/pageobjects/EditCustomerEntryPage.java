package com.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class EditCustomerEntryPage extends TestBase{
	@FindBy(xpath="//textarea[contains(text(),'Darwin')]")
	@CacheLookup
	WebElement editAddressBtn;
	
	@FindBy(xpath="//tbody/tr[13]/td[2]/input[1]")
	@CacheLookup
	WebElement submitBtn1;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	@CacheLookup
	WebElement homeBtn;
	
	
	
	
	public  EditCustomerEntryPage() {
		PageFactory.initElements(driver, this);
	}
	
	

	public String validateEditCustomerEntryPageCustomerPageTitle() {
		return driver.getTitle();
	}
	
	
	public CustomerRegistrationPage editAddress(String addr) {
		editAddressBtn.sendKeys(addr);
		submitBtn1.click();
		 return new CustomerRegistrationPage() ;
		
		
		
	}
	
	public HomePage clickOnHome() {
	 homeBtn.click();
	 return new HomePage();
	}
	

}
