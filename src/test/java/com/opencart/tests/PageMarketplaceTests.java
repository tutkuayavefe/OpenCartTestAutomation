package com.opencart.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.base.BaseTest;
import com.opencart.pages.PageLogin;
import com.opencart.pages.PageMarketplace;

public class PageMarketplaceTests extends BaseTest {
	PageMarketplace pageMarketPlace;
	
	public void LoginProcess() {
		driver.get("https://www.opencart.com/index.php?route=account/login");
		WebElement email = driver.findElement(By.xpath(pageMarketPlace.getEmail()));
		if (email.isDisplayed()) {
			email.click();
			email.sendKeys(pageMarketPlace.getUserEmail());
		}

		WebElement password = driver.findElement(By.xpath(pageMarketPlace.getPassword()));
		if (password.isDisplayed()) {
			password.click();
			password.sendKeys(pageMarketPlace.getUserPassword());
		}

		WebElement loginButton = driver.findElement(By.xpath(pageMarketPlace.getLoginButton()));
		if (loginButton.isDisplayed()) {
			loginButton.click();
		}
		
		WebElement pin = driver.findElement(By.id(pageMarketPlace.getPinInput()));
		if(pin.isDisplayed()) {
			pin.click();
			pin.sendKeys("1357");
		}
		
		
		WebElement continueButton = driver.findElement(By.xpath(pageMarketPlace.getContinueButton()));
		if(continueButton.isDisplayed()) {
			continueButton.click();
			
		driver.get("https://www.opencart.com/index.php?route=marketplace/extension");

		}
	}
	
	@Test(priority = 1)
	public void DownloadFirstFreeProduct() {
		// This test is to verify that
		pageMarketPlace = new PageMarketplace(driver);

		LoginProcess();
		
		WebElement freeButton = driver.findElement(By.xpath(pageMarketPlace.getFreeButton()));
		freeButton.click();
		

		WebElement freeProduct = driver.findElement(By.xpath(pageMarketPlace.getFacebookFree()));
		freeProduct.click();
		
		
		WebElement firstDownloadButton = driver.findElement(By.xpath(pageMarketPlace.getFirstDownloadButton()));
		firstDownloadButton.click();
		

		WebElement secondDownloadButton = driver.findElement(By.xpath(pageMarketPlace.getSecondDownloadButton()));
		secondDownloadButton.click();
	}
	
	
	@Test(priority = 2)
	public void TestSearch() throws InterruptedException {
		// This test is to verify that
		pageMarketPlace = new PageMarketplace(driver);

		LoginProcess();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement searchField = driver.findElement(By.xpath(pageMarketPlace.getSearchField()));
		searchField.click();
		searchField.sendKeys("Language");
		searchField.sendKeys(Keys.ENTER);
		

		
		WebElement relevantElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pageMarketPlace.getRelevantResult())));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(200,200)");
		relevantElement.getText().contains("language");
	
	}
	
	
	@Test(priority = 3)
		public void SortByPriceFreeFirst() {
		pageMarketPlace = new PageMarketplace(driver);
		LoginProcess();

		WebElement sort = driver.findElement(By.xpath(pageMarketPlace.getSortField()));
		sort.click();
		
		for(int i = 0; i<4;i++) {
			sort.sendKeys(Keys.DOWN);
		}
		
		
		}
	
}
