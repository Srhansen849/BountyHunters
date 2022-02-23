package com.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage {
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//button[@id='forgotButton']")
	private WebElement sendButton;
	
	public ForgetPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
		this.sendButton.click();
	}
}

