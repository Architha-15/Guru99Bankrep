package com.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class TransactionDepositPage extends TestBase{
	@FindBy(xpath="//p[contains(text(),'Transaction details of Deposit for Account 100884')]")
	@CacheLookup
	WebElement successfulTransactionTextEle;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	@CacheLookup
	WebElement continueBtn;
	
	
	public TransactionDepositPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateSuccessfulTransactionText() {
		return successfulTransactionTextEle.getText();
		
	}
	
	public HomePage clickOnContinue() {
		continueBtn.click();
		return new HomePage();
	}
	
	

}
