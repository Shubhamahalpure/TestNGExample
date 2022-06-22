package com.Shub.testNGListeners;

import org.testng.Assert;

import org.testng.annotations.Test;

public class LoginTest {
	@Test
	void setUp() {
		Assert.assertTrue(true);
	}

	@Test()
	void loginByEmail() {
		Assert.assertTrue(true);
	}

	@Test
	void loginByFacebook() {
		Assert.assertTrue(false);
	}

}
