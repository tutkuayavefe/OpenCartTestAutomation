package com.opencart.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.opencart.base.BaseTest;
import com.opencart.pages.PageRegister;

public class PageRegisterTests extends BaseTest {
	PageRegister pageRegister;

	@Test(priority = 1)
	public void FillingFormOpenCartPage() {
		// This test is to verify that
		pageRegister = new PageRegister(driver);

		driver.get("https://www.opencart.com/index.php?route=account/register");

		WebElement userName = driver.findElement(By.xpath(pageRegister.getUserName()));
		if (userName.isDisplayed()) {
			userName.click();
			userName.sendKeys(pageRegister.getSendUserName());
		}

		WebElement firstName = driver.findElement(By.xpath(pageRegister.getFirstName()));
		firstName.click();
		firstName.sendKeys(pageRegister.getUserFirstName());

		WebElement lastName = driver.findElement(By.xpath(pageRegister.getLastName()));
		if (lastName.isDisplayed()) {
			lastName.click();
			lastName.sendKeys(pageRegister.getUserLastName());
		}

		WebElement emailAddress = driver.findElement(By.xpath(pageRegister.getEmailAddress()));
		if (emailAddress.isDisplayed()) {
			emailAddress.click();
			emailAddress.sendKeys(pageRegister.getUserEmailAddress());
		}

		WebElement country = driver.findElement(By.xpath(pageRegister.getCountry()));
		country.click();
		WebElement countrySelected = driver.findElement(By.xpath("//select[@id='input-country']"));
		countrySelected.click();

		WebElement password = driver.findElement(By.xpath(pageRegister.getPassword()));
		if (password.isDisplayed()) {
			password.click();
			password.sendKeys(pageRegister.getUserPassword());

			WebElement info = driver.findElement(By.xpath("//div[@class='bg-info']"));
			boolean visibiltyInfo = info.isDisplayed();
			if (visibiltyInfo) {
				System.out.println("Done!!");
			}

		}

	}
}
