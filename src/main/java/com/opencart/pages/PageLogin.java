package com.opencart.pages;

import org.openqa.selenium.WebDriver;

public class PageLogin {

	private String email = "//input[@id='input-email']";
	private String password = "//input[@id='input-password']";
	private String loginButton = "//button[@class='btn btn-primary btn-lg hidden-xs']";
	private String welcomeText = "//p[contains(.,'Welcome to OpenCart!')]";

	private String userEmail = "tutkuayavefe@mailinator.com";
	private String userPassword = "Mailinator12.";

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

}
