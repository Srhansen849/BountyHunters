package com.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount {
	
	@FindBy(xpath="//input[@id='fname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='lname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='cname']")
	private WebElement codename;
	
	@FindBy(xpath="//input[@id='currency']")
	private WebElement currency;
	
	@FindBy(xpath="//input[@id='uname']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='cpassword']")
	private WebElement c_password;
	
	@FindBy(xpath="//input[@id='inputAssociates']")
	private WebElement associates;
	
	@FindBy(xpath="//input[@id='inputRepresentative']")
	private WebElement representative;
	
	@FindBy(xpath="//button[@id='submit_profile']")
	private WebElement create_account;
	
	public NewAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void createProfile(String firstname, String lastname, String codename,
						String currency, String username, String email,
						String password, String c_password, String associates,
						String representative) {
		this.firstname.clear();
		this.lastname.clear();
		this.codename.clear();
		this.currency.clear();
		this.username.clear();
		this.email.clear();
		this.password.clear();
		this.c_password.clear();
		this.associates.clear();
		this.representative.clear();
		
		this.firstname.sendKeys(firstname);
		this.lastname.sendKeys(lastname);
		this.codename.sendKeys(codename);
		this.currency.sendKeys(currency);
		this.username.sendKeys(username);
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		this.c_password.sendKeys(c_password);
		this.associates.sendKeys(associates);
		this.representative.sendKeys(representative);
		
		this.create_account.click();
		
	}
	

}
