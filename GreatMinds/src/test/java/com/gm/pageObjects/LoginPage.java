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
		
	

	@FindBy(id="username") WebElement txtUserName;

	
	@FindBy(id="password") WebElement txtPassword;

	
	
	@FindBy(id="loginButton")
	@CacheLookup
	WebElement btnLogin;
//	@findBy(xpath=//*[@id="concurrentAlerts"]/a[1])
//	
//	if 
//	

	
	public void setUserName(String username)
	{ 
		txtUserName.sendKeys(username);
		//WebDriver driver;
		// WebElement Uname= driver.findElement(By.id("Enter_ID"));
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
