package com.gm.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gm.pageObjects.BrowseGrade;
import com.gm.pageObjects.LoginPage;
import com.gm.pageObjects.GenericFilters;

public class TC_BrowseGrade_001 extends BaseClass {
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
		
		bg.BrowseGrade();
		logger.info("Grade Sub-Menu has clicked");
		
	
		
		if(driver.getTitle().equals("GreatMinds:: Production Workflow Tracking System - Module Set Creation"))
		{
			Assert.assertTrue(true);
			logger.info("Browse Grade Navigation Test Passed");
		}
		else
		{
//			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Browse Grade Navigation Test failed");
		}
		
		//lp.clickLogout();	
			
		}
	
		
}
