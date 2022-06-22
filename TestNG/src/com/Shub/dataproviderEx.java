package com.Shub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderEx {
	  WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver","D://Desktop/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test(dataProvider="users") // dataProvider a parameter of @Test annotaion
	void logintest(String uname, String pwd)
	{
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("submit")).click();
		
		Assert.assertEquals(driver.getTitle(), "Login: Mercury Tours");
	}
	
	@DataProvider(name="users") // @DataProvider is annotation
	String [][] loginData()
	{
		String data[][]={ {"mercury","mercury"},{"mer","mer"},{"mercury151","mercury1"}};
		return data;
	}
	
	@AfterClass
	void closeBrowser()
	{
		driver.close();
	}
	
}