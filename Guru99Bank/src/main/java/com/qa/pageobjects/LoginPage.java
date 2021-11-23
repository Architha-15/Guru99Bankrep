package com.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement usernamrBtn;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement passwordBtn;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement loginBtn;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	@CacheLookup
	WebElement guru99logo;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLoginPageLogo() {
		 return guru99logo.isDisplayed();
	}
	
	public HomePage login(String un,String pwd) {
		usernamrBtn.sendKeys(un);
		passwordBtn.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
	
	
	
	

}
