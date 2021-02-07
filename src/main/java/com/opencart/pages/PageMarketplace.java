package com.opencart.pages;

import org.openqa.selenium.WebDriver;

public class PageMarketplace {

	private String freeButton = "(//a[contains(.,'Free')])[1]";
	private String facebookFree = "(//div[@class='extension-description'])[1]";
	private String firstDownloadButton = "//a[@class='btn btn-success btn-lg btn-block']";
	private String secondDownloadButton = "//a[@class='btn btn-primary']";
	private String searchField = "//input[contains(@name,'search')]";
	private String relevantResult = "(//a[contains(.,'Language Editor')])[2]";
	private String freeProductText = "(//span[contains(.,'FREE')])[1]";
	private String sortField = "//select[@id='input-sort']";

	

	private String email = "//input[@id='input-email']";
	private String password = "//input[@id='input-password']";
	private String userEmail = "tutkuayavefe@mailinator.com";
	private String userPassword = "Mailinator12.";
	private String loginButton = "//button[@class='btn btn-primary btn-lg hidden-xs']";
	private String pinInput = "input-pin";
	private String continueButton = "/html/body/div/div[2]/div/div[1]/form/div[2]/button";

	public PageMarketplace(WebDriver driver) {
		// TODO Auto-generated constructor stub

	}

	public String getFreeButton() {
		return freeButton;
	}

	public String getFacebookFree() {
		return facebookFree;
	}

	public String getFirstDownloadButton() {
		return firstDownloadButton;
	}

	public String getSecondDownloadButton() {
		return secondDownloadButton;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public String getLoginButton() {
		return loginButton;
	}

	public String getPinInput() {
		return pinInput;
	}

	public String getContinueButton() {
		return continueButton;
	}

	public String getSearchField() {
		return searchField;
	}

	public String getRelevantResult() {
		return relevantResult;
	}
	
	public String getFreeProductText() {
		return freeProductText;
	}

	public String getSortField() {
		return sortField;
	}
}
