package com.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	@FindBy(xpath="//input[@id='inputFirstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='inputLastName']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@id='inputCodeName']")
	private WebElement codeName;
	
	@FindBy(xpath="//input[@id='inputemailaddress']")
	private WebElement emailaddress;
	
	@FindBy(xpath="//input[@id='inputpassword']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='input_c_password']")
	private WebElement c_password;
	
//	@FindBy(xpath="//input[@id='img']")
//	private WebElement image;
	
	
	
	@FindBy(xpath="//button[@id='submit_profile']")
	private WebElement submit;
	
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void submitProfile(String firstname, String lastname, String codeName,
			String emailaddress, String password, String c_password) {
		this.firstName.clear();
		this.lastName.clear();
		this.codeName.clear();
		this.emailaddress.clear();
		this.password.clear();
		this.c_password.clear();
		
		this.firstName.sendKeys(firstname);
		this.lastName.sendKeys(lastname);
		this.codeName.sendKeys(codeName);
		this.emailaddress.sendKeys(emailaddress);
		this.password.sendKeys(password);
		this.c_password.sendKeys(c_password);
		
		this.submit.click();
		
	}

}


//
//@FindBy(xpath = "//input[@id='username']")
//private WebElement username;
//
//@FindBy(xpath = "//input[@id='password']")
//private WebElement password;
//
//@FindBy(xpath = "//button[@id='loginButton']")
//private WebElement loginButton;
//
//public LoginPage(WebDriver driver) {
//	PageFactory.initElements(driver, this);
//}
//
//public void loginToFoodPage(String username, String password) {
//	this.username.clear();
//	this.password.clear();
//	this.username.sendKeys(username);
//	this.password.sendKeys(password);
//	this.loginButton.click();
//}