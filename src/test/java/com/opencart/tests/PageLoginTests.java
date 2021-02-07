package com.opencart.tests;

import org.testng.annotations.Test;

import com.opencart.base.BaseTest;
import com.opencart.pages.PageLogin;
import com.opencart.pages.PageRegister;

public class PageLoginTests extends BaseTest {
	PageLogin pageLogin;

	@Test(priority = 1)
	public void LoginToOpenCart() {
		// This test is to verify that
		pageLogin = new PageLogin(driver);
		driver.get("https://www.opencart.com/index.php?route=account/login");

		
		

	}
}
