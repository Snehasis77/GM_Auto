package com.gm.testCases;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.gm.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
		
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{			
		
		
		if(br.equals("chrome"))
		{
			ChromeOptions chromeOptions= new ChromeOptions(); 
			
			chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"); 
			// System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());

			ChromeDriver driver = new ChromeDriver(chromeOptions);
				//driver=new ChromeDriver();
				//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.get(baseURL);
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			driver = new InternetExplorerDriver();
		}
		
	
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
