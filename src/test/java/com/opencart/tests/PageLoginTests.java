package com.opencart.tests;

import java.awt.print.Pageable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.base.BaseTest;
import com.opencart.pages.PageLogin;
import com.opencart.pages.PageRegister;

public class PageLoginTests extends BaseTest {
	PageLogin pageLogin;
	
	 
	@Test(priority = 1)
	public void FillAndLoginToOpenCart() {
		// This test is to verify that
		pageLogin = new PageLogin(driver);
		driver.get("https://www.opencart.com/index.php?route=account/login");

		WebElement email = driver.findElement(By.xpath(pageLogin.getEmail()));
		if (email.isDisplayed()) {
			email.click();
			email.sendKeys(pageLogin.getUserEmail());
		}

		WebElement password = driver.findElement(By.xpath(pageLogin.getPassword()));
		if (password.isDisplayed()) {
			password.click();
			password.sendKeys(pageLogin.getUserPassword());
		}

		WebElement loginButton = driver.findElement(By.xpath(pageLogin.getLoginButton()));
		if (loginButton.isDisplayed()) {
			loginButton.click();
		}
		
		
		WebElement pin = driver.findElement(By.id(pageLogin.getPinInput()));
		if(pin.isDisplayed()) {
			pin.click();
			pin.sendKeys(pageLogin.getUserPin());
		}
		
		
		WebElement continueButton = driver.findElement(By.xpath(pageLogin.getContinueButton()));
		if(continueButton.isDisplayed()) {
			continueButton.click();
		}
		

		WebElement welcomeText = driver.findElement(By.xpath(pageLogin.getWelcomeText()));
		Assert.assertEquals("Welcome to OpenCart!", welcomeText.getText(), "They are not equal: "+ welcomeText.getText());
	}
	
	@Test(priority = 2)
	public void invalidLoginCridentials(){
		pageLogin = new PageLogin(driver);
		driver.get("https://www.opencart.com/index.php?route=account/login");
		 
		
		WebElement loginButton = driver.findElement(By.xpath(pageLogin.getLoginButton()));
		if (loginButton.isDisplayed()) {
			loginButton.click();
		}
		
		WebElement alertMessage = driver.findElement(By.xpath(pageLogin.getAlertMessage()));
		
		if(alertMessage.isDisplayed()) {
			System.out.println("Test passed!");
		}
	}
	
	
	@Test(priority = 3)
	public void forgetPassword() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);

		pageLogin = new PageLogin(driver);
		driver.get("https://www.opencart.com/index.php?route=account/login");
	
		WebElement forgetPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pageLogin.getForgetPasswordButton())));
		if (forgetPassword.isDisplayed()) {
			forgetPassword.click();
		}
		
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pageLogin.getEmail())));
	
			email.click();
			email.sendKeys(pageLogin.getUserEmail());
		
		
		WebElement forgetSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pageLogin.getForgetSubmit())));
		if (forgetSubmit.isDisplayed()) {
			forgetSubmit.click();
		}
		
		WebElement alertMessageVisibility=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pageLogin.getAlertSuccess())));
		
	
	}
	
	
}
