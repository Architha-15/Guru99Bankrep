package com.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.testbase.TestBase;

public class GtplBankRegPage extends TestBase{

	@FindBy(xpath="//p[contains(text(),'Account Generated Successfully!!!')]")
	@CacheLookup
	WebElement successfulDisplayTextEle;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	@CacheLookup
	WebElement homeBtn;
	
	
	public  GtplBankRegPage () {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String validateSuccessfulAccountText() {
		return successfulDisplayTextEle.getText();
		
	}
	
	public HomePage clickOnHome() {
		 homeBtn.click();
		return new HomePage();
	}

}
