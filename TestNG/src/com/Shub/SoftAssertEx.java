package com.Shub;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	
	SoftAssert sft = new SoftAssert();
	
	@Test
	public void Test1() {
		System.out.println("Hello");
		sft.assertEquals("welcome", "welcome");
		sft.assertEquals("Hii", "hii");
		System.out.println("Test1 is passed");
		sft.assertAll();
		
		
		}

}
