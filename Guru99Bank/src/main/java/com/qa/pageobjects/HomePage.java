package com.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/center[1]/img[2]")
    WebElement managerhomepageLogo;
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
    WebElement newcustomerBtn;
	
	
	@FindBy(xpath="//a[contains(text(),'Edit Customer')]")
	@CacheLookup
	WebElement editcustomerBtn;
	
	

	@FindBy(xpath="//a[contains(text(),'New Account')]")
	@CacheLookup
	WebElement newAccountBtn;
	
	@FindBy(xpath="//a[contains(text(),'Deposit')]")
	@CacheLookup
	WebElement depositBtn;
	
	
	@FindBy(xpath="//a[contains(text(),'Customised Statement')]")
	@CacheLookup
	WebElement customisedstatementBtn;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateManagerHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateManagerHomePageImage() {
		return managerhomepageLogo.isDisplayed();
		
	}
	
	
	
	public NewCustomer clickOnNewcustomer() {
		 newcustomerBtn.click();
		 return new NewCustomer();
	
	}
	
	
    public EditCustomer clickOnEditCustomer() {
    	editcustomerBtn.click();
    	return new EditCustomer();
    	
		
	}
    
    public NewAccount clickOnnewAccount() {
    	newAccountBtn.click();
    	return new NewAccount();
    	
		
	}
    
    public DepositPage clickOnDeposit() {
    	depositBtn.click();
    	return new DepositPage();
    	
		
	}
    
    public CustomoisedStatement clickOnCustomisedStatement() {
    	customisedstatementBtn.click();
    	return new CustomoisedStatement();
    	
		
	}
	
	
	
	

}
