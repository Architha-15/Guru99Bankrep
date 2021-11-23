package com.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class CustomoisedStatement extends TestBase {
	@FindBy(xpath="//tbody/tr[6]/td[2]/input[1]")
	@CacheLookup
	WebElement accountNoBtn;
	
	@FindBy(xpath="//tbody/tr[7]/td[2]/input[1]")
	@CacheLookup
	WebElement fromDateBtn;
	
	@FindBy(xpath="//tbody/tr[8]/td[2]/input[1]")
	@CacheLookup
	WebElement toDateBtn;
	
	@FindBy(xpath="//tbody/tr[9]/td[2]/input[1]")
	@CacheLookup
	WebElement minTransValueBtn;
	
	@FindBy(xpath="//tbody/tr[10]/td[2]/input[1]")
	@CacheLookup
	WebElement numOfTransactionBtn;
	
	@FindBy(xpath="//tbody/tr[13]/td[2]/input[1]")
	@CacheLookup
	WebElement submitBtn;
	
	
	
	
	public  CustomoisedStatement() {
		PageFactory.initElements(driver, this);
	}
	
	public CustomisedStatementPage fillCustomisedStatementForm(String accno, String d1,String m1, String y1, String d2, String m2, String y2, String mintrans, String numtrans ) {
		accountNoBtn.sendKeys(accno);
		fromDateBtn.sendKeys(d1);
		fromDateBtn.sendKeys(m1);
		fromDateBtn.sendKeys(y1);
		toDateBtn.sendKeys(d2);
		toDateBtn.sendKeys(m2);
		toDateBtn.sendKeys(y2);
		minTransValueBtn.sendKeys(mintrans);
		numOfTransactionBtn.sendKeys(numtrans);
		submitBtn.click();
		return new CustomisedStatementPage();
		
		
	}
	
	

	
	}
	


