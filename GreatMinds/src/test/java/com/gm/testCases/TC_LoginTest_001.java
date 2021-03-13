package com.gm.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.gm.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException 
	{
			
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
	
		
		lp.setPassword(password);
	
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals(""))
		{
			Assert.assertTrue(true);
		
		}
		else
		{
			//captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			
		}
		
	}
	
}


