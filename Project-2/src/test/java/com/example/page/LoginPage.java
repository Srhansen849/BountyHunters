package com.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='loginButton']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void bountyHunterLogin(String username, String password) {
		this.username.clear();
		this.password.clear();
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		this.loginButton.click();
	}
	
	
	
	
	
	
	

}
