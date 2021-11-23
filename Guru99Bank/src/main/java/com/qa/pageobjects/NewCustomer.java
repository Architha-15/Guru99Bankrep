package com.qa.pageobjects;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class NewCustomer extends TestBase {
	
	
	@FindBy(xpath="//tbody/tr[4]/td[2]/input[1]")
	WebElement customernameBtn;
	
	@FindBy(xpath="//tbody/tr[5]/td[2]/input[1]")
	WebElement maleradioBtn;
	
	@FindBy(xpath="//tbody/tr[5]/td[2]/input[2]")
	WebElement femaleradioBtn;
	
	
	
	@FindBy(id="dob")
	WebElement dataofbirthBtn;
	
	@FindBy(xpath="//tbody/tr[7]/td[2]/textarea[1]")
	WebElement addressBtn;
	
	@FindBy(name="city")
	WebElement cityBtn;
	
	@FindBy(name="state")
	WebElement stateBtn;
	
	@FindBy(name="pinno")
	WebElement pinBtn;
	

	@FindBy(name="telephoneno")
	WebElement telephoneBtn;
	

	@FindBy(name="emailid")
	WebElement emailBtn;
	

	@FindBy(name="password")
	WebElement passwordBtn;
	
	@FindBy(name="sub")
	WebElement submitBtn;
	
	public NewCustomer() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateNewCustomerPageTitle() {
	return	driver.getTitle();
	}
	
	
	
	public CustomerRegistrationPage registration(String cn, String gen, String dd, String mm, String yy,String addr, String cit, String sta, String pin, String mobno, String email, String pwd) {
		customernameBtn.sendKeys(cn);
		
		if(gen.equalsIgnoreCase("male")) {
			maleradioBtn.click();
		}else if (gen.equalsIgnoreCase("female")) {
			femaleradioBtn.click();
			
		}
		
		
		dataofbirthBtn.sendKeys(dd);
		dataofbirthBtn.sendKeys(mm);
		dataofbirthBtn.sendKeys(yy);
		addressBtn.sendKeys(addr);
		cityBtn.sendKeys(cit);
		stateBtn.sendKeys(sta);
		pinBtn.sendKeys(pin);
		telephoneBtn.sendKeys(mobno);
		emailBtn.sendKeys(email);
		passwordBtn.sendKeys(pwd);
		submitBtn.click();
		return new CustomerRegistrationPage();
	}


	
		
		
		
	
	
	
	
	
	
	
	
	
	

}
