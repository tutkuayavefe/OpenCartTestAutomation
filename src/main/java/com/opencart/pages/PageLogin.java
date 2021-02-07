package com.opencart.pages;

import org.openqa.selenium.WebDriver;

public class PageLogin {

	private String email = "//input[@id='input-email']";
	private String password = "//input[@id='input-password']";
	private String loginButton = "//button[@class='btn btn-primary btn-lg hidden-xs']";
	private String pinInput = "input-pin";
	private String continueButton = "/html/body/div/div[2]/div/div[1]/form/div[2]/button";
	private String welcomeText = "//p[contains(.,'Welcome to OpenCart!')]";
	private String alertMessage = "//div[@class='alert alert-danger']";
	private String forgetPasswordButton = "//a[@href='https://www.opencart.com/index.php?route=account/forgotten']";
	private String forgetSubmit = "//button[contains(.,'Submit')]";
	private String alertSuccess = "//div[@class='alert alert-success']";

	private String userEmail = "tutkuayavefe@mailinator.com";
	private String userPassword = "Mailinator12.";
	private String userPin = "1357";

	public PageLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub

	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getLoginButton() {
		return loginButton;
	}

	public String getWelcomeText() {
		return welcomeText;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public String getPinInput() {
		return pinInput;
	}

	public String getContinueButton() {
		return continueButton;
	}

	public String getUserPin() {
		return userPin;
	}

	public String getAlertMessage() {
		return alertMessage;
	}

	public String getForgetPasswordButton() {
		return forgetPasswordButton;
	}

	public String getForgetSubmit() {
		return forgetSubmit;
	}

	public String getAlertSuccess() {
		return alertSuccess;
	}
}
