package com.example.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileHostPage {
	
	@FindBy (xpath = "//tr")
	private List<WebElement> bountiesRow;
	
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
	
	@FindBy(xpath="//input[@id='inputAssociates']")
	private WebElement associates;
	
	@FindBy(xpath="//input[@id='inputRepresentative']")
	private WebElement representative;
	
	@FindBy(xpath="//button[@id='submit_profile']")
	private WebElement submit;
	
	public ProfileHostPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a")
	private List<WebElement> bountiesAnchorTags;
	
	public int sizeOfTable() {
		return this.bountiesRow.size();
	}
	
	public void submitProfile(String firstname, String lastname, String codeName, 
			String emailaddress, String password, String c_password,
			String associates, String representative) {
		this.firstName.clear();
		this.lastName.clear();
		this.codeName.clear();
		this.emailaddress.clear();
		this.password.clear();
		this.c_password.clear();
		this.associates.clear();
		this.representative.clear();
		
		this.firstName.sendKeys(firstname);
		this.lastName.sendKeys(lastname);
		this.codeName.sendKeys(codeName);
		this.emailaddress.sendKeys(emailaddress);
		this.password.sendKeys(password);
		this.c_password.sendKeys(c_password);
		this.associates.sendKeys(associates);
		this.representative.sendKeys(representative);
		
		this.submit.click();
		
	}
	
	public void clickLink(String firstname) {
		for(WebElement link: this.bountiesAnchorTags) {
			if(link.getText().equals(firstname)) {
				link.click();
			}
		}
	}

}