package com.gm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowseGrade {

	WebDriver ldriver;
	
	public BrowseGrade(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		

@FindBy(xpath="/html/body/aside/nav/div/ul/li[4]/a")
@CacheLookup
WebElement ManageGrade;

@FindBy(xpath="/html/body/aside/nav/div/ul/li[4]/ul/li[1]/a") WebElement Grade;

@FindBy(xpath="/html/body/aside/nav/div/ul/li[4]/ul/li[1]/ul/li[2]/a")
@CacheLookup
WebElement BrowseGrade;

@FindBy(xpath="/html/body/aside/nav/div/ul/li[4]/ul/li[1]/ul/li[1]/a")
WebElement GradeSetup;

public void clickManageGrade()
{
	ManageGrade.click();
}	

public void clickGrade()
{
	Grade.click();
}	

public void BrowseGrade()
{
	BrowseGrade.click();
}	
public void GradeSetup()
{
	GradeSetup.click();
}	




}