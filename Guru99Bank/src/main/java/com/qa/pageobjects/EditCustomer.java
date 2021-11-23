package com.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class EditCustomer extends TestBase {

	
	
	@FindBy(xpath="//tbody/tr[6]/td[2]/input[1]")
	@CacheLookup
	WebElement customeridBtn;
	
	@FindBy(xpath="//tbody/tr[11]/td[2]/input[1]")
	@CacheLookup
	WebElement submitBtn;
	
	
	public  EditCustomer() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String validateEditCustomerPageTitle() {
		return driver.getTitle();
	}
	
	
	public EditCustomerEntryPage provideCustomerId(String cid) {
		customeridBtn.sendKeys(cid);
		 submitBtn.click();
		 return new EditCustomerEntryPage() ;
		
		
		
	}
	
	
	
	
	
}
