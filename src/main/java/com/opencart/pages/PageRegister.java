package com.opencart.pages;

import org.openqa.selenium.WebDriver;

public class PageRegister {
	
	private String userName = "//input[contains(@id,'input-username')]";
	private String firstName = "//input[contains(@id,'input-firstname')]";
	private String lastName = "//input[contains(@id,'input-lastname')]";
	private String emailAddress = "//input[@id='input-email']";
	private String country = "//select[@id='input-country']";
	private String password = "//input[@id='input-password']";
	private String registerButton = "//button[@class='btn btn-primary btn-lg hidden-xs']";
	

	private String sendUserName = "Tutku Ayavefe";
	private String userFirstName = "Tutku";
	private String userLastName = "Ayavefe";
	private String userEmailAddress = "tutku@mailinator.com";
	private String userPassword = "TestAutomation135.";

	

	public PageRegister(WebDriver driver) {
		// TODO Auto-generated constructor stub

	}
	
	public String getUserName() {
		return userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getCountry() {
		return country;
	}

	public String getPassword() {
		return password;
	}

	public String getRegisterButton() {
		return registerButton;
	}
	
	
	public String getSendUserName() {
		return sendUserName;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public String getUserEmailAddress() {
		return userEmailAddress;
	}
	
	public String getUserPassword() {
		return userPassword;
	}

	
	
}