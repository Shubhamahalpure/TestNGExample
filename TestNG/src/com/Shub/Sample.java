package com.Shub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/Desktop/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://admin-demo.nopcommerce.com/");
		// Open the URL

		driver.findElement(By.xpath("//*[@id=\'Email\']")).clear();
        driver.findElement(By.xpath("//*[@id=\'Email\']")).sendKeys("admin@yourstore.com");

		driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("admin");

		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		driver.manage().window().maximize();
		

		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")).click();;
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]")).click();
		driver.findElement(By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']")).click();
	
		
	}

}
