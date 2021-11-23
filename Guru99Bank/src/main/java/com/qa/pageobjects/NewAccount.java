package com.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testbase.TestBase;

public class NewAccount extends TestBase {
	@FindBy(xpath="//tbody/tr[2]/td[2]/input[1]")
	@CacheLookup
	WebElement customerIdBtn1;
	
	
	@FindBy(xpath="//tbody/tr[3]/td[2]/select[1]")
	@CacheLookup
	WebElement accountTypeBtn;
	
	

	@FindBy(xpath="//tbody/tr[4]/td[2]/input[1]")
	@CacheLookup
	WebElement intialDepositBtn;
	
	@FindBy(xpath="//tbody/tr[5]/td[2]/input[1]")
	@CacheLookup
	WebElement submitBtn4;
	
	
	public NewAccount() {
		PageFactory.initElements(driver, this);
	}
	
	public GtplBankRegPage fillNewAccountForm(String cusid, String amt) {
		customerIdBtn1.sendKeys(cusid);
		Select select = new Select(accountTypeBtn);
		select.selectByIndex(1);
		intialDepositBtn.sendKeys(amt);
		submitBtn4.click();
		return new GtplBankRegPage();
		
		
	}
	
	
	

}
