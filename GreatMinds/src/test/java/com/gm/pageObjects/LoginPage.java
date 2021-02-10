package com.gm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="userIdLogin")
	private WebElement txtUserName;
	
	@FindBy(name="passwordLogin")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/form/div[3]/div[2]/button")
	@CacheLookup
	WebElement btnLogin;
	

	
	public void setUserName(String username)
	{
		txtUserName.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	
	
	
}
