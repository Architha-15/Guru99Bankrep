package com.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class DepositPage extends TestBase{
	@FindBy(xpath="//tbody/tr[6]/td[2]/input[1]")
	@CacheLookup
	WebElement accountNumBtn;
	
	@FindBy(xpath="//tbody/tr[7]/td[2]/input[1]")
	@CacheLookup
	WebElement amountBtn;
	
	@FindBy(xpath="//tbody/tr[8]/td[2]/input[1]")
	@CacheLookup
	WebElement descriptionBtn;
	
	
	@FindBy(xpath="//tbody/tr[12]/td[2]/input[1]")
	@CacheLookup
	WebElement submitBtn;
	
	
	
	
	public DepositPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public TransactionDepositPage fillAmountDepositForm(String accno, String amt, String descrip) {
		accountNumBtn.sendKeys(accno);
		amountBtn.sendKeys(amt);
		descriptionBtn.sendKeys(descrip);
		 submitBtn.click();
		 return new TransactionDepositPage();
		
		
		
		
		
	}

}
