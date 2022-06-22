package com.Shub.testNGListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener implements  ITestListener {
	
	public void onTestStart(ITestResult tr)
	{
		System.out.println("Test method is started");
	}
	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("Test method passed");
	}
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("Test method failed");
	}
	public void onTestSkipped()
	{
		System.out.println("Test method skipped");
	}
	
	

}
