package com.gm.testCases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gm.pageObjects.*;
import com.gm.pageObjects.GenericFilters;

public class TC_CreateGrade extends BaseClass{
	@Test
	public void loginTest() throws IOException 
	{
	logger.info("URL is opened");
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	logger.info("User name is provided");
	lp.setPassword(password);
	logger.info("Passsword is provided");
	lp.clickSubmit();
	
	

		
		BrowseGrade bg=new BrowseGrade(driver);
		bg.clickManageGrade();
		logger.info("Left Dashboard menu has clicked");
		
		bg.clickGrade();
		logger.info("Grade Sub-Menu has clicked");
		
		bg.GradeSetup();
		logger.info("Grade Setup Sub-Menu has clicked");
		
		logger.info("providing Grade details....");
		
		GenericFilters GradeObject=new GenericFilters(driver);
		Select sc = new Select(driver.findElement(By.xpath("//*[@id=\"subjectCategoryIdID\"]")));
			// Select the option value for SC as EM2-Eureka Math2
		sc.selectByValue("3");
		// Select the option value for State as NA-National
		Select state = new Select(driver.findElement(By.id("stateIdID")));
		state.selectByIndex(1);
		// select the option value for Language as EN-English
		Select grade = new Select(driver.findElement(By.xpath("//*[@id=\"languageIdID\"]")));
		grade.selectByValue("1");
		Select lang = new Select(driver.findElement(By.xpath("//*[@id=\"gradeID\"]")));
}
}
