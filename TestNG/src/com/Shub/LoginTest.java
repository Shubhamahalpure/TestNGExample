package com.Shub;

import org.testng.annotations.Test;

/**
 * @author Akshay
 *
 */
public class LoginTest {
	
	@Test(priority=1)
	void openURL()
	{
		System.out.println("This is Open URL");
	}
	
	@Test(priority=2)
	void login()
	{
		System.out.println("Login");
	}
	
	@Test(priority=3)
    void logout()
    {
    	System.out.println("Logout");
    }
}
