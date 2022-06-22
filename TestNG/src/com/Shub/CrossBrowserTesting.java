package com.Shub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sun.org.glassfish.gmbal.ParameterNames;

public class CrossBrowserTesting {
	WebDriver driver;
	
	@Parameters("browser")
    @BeforeTest
     public void setUp(String br_name) 
	{
		if(br_name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D://Desktop//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(br_name.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D://Desktop//geckodriver.exe");
			driver=new FirefoxDriver();
		}
    	
    }
	
	@Test
	public void loginTest() {
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Successfully Completed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
