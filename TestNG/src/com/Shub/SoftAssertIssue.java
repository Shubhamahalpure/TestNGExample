package com.Shub;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertIssue {

	SoftAssert sft1 = new SoftAssert();
	SoftAssert sft2 = new SoftAssert();
	
	@Test
	public void Test1()
	{
		System.out.println("Test1");
		sft1.assertEquals("Hello", "hello");
		System.out.println("Test1 is Failed");
		sft1.assertAll();
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2");
		sft2.assertEquals("Hello", "Hello");
		System.out.println("Test2 is passed");
		sft2.assertAll();
	}
}
