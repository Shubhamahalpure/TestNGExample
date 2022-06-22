package com.Shub;

import org.testng.Assert;
import org.testng.annotations.*;

public class Ex1 {

//	  @BeforeMethod
//	  public void beforeMethod() {
//		  System.out.println("Before Method");
//	  }
//
//	  @AfterMethod
//	  public void afterMethod() {
//		  System.out.println("After Method");
//	  }
//
//	  @BeforeClass
//	  public void beforeClass() {
//		  System.out.println("Before Class");
//	  }
//
//	  @AfterClass
//	  public void afterClass() {
//		  System.out.println("After class");
//	  }
//
//	  @BeforeTest
//	  public void beforeTest() {
//		  System.out.println("Before Test");
//	  }
//
//	  @AfterTest
//	  public void afterTest() {
//		  System.out.println("After Test");
//	  }

//	  @BeforeSuite
//	  public void beforeSuite() {
//		  System.out.println("Before Suite");
//	  }
//
//	  @AfterSuite
//	  public void afterSuite() {
//		  System.out.println("After Suite");
//	  }

	@Test
	public void A() {
		System.out.println("A");
		String Exp_Title = " WRITING PAD";
		String Act_Title = " WRITI PAD";
		Assert.assertEquals(Exp_Title, Act_Title);
		System.out.println("Test D is Passed");
	}

	@Test
	public void B() {
		System.out.println("B");
		Assert.assertEquals("welcome", "welcome");
		System.out.println("Test B is Passed");
	}

	@Test
	public void C() {
		System.out.println("C");
		Assert.assertEquals("hello", "hello");
		System.out.println("Test C is Passed");
	}

	@Test
	public void D() {
		System.out.println("D");

	}

}
