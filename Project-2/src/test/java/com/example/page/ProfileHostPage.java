package com.example.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileHostPage {
	
	@FindBy (xpath = "//input[@id='profile_table1']/tr")
	private List<WebElement> profileRow1;
	
	@FindBy(xpath="//input[@id='currency1']")
	private WebElement currency1;
	
	@FindBy(xpath="//input[@id='amount1']")
	private WebElement amount1;
	
	@FindBy(xpath="//input[@id='due_date1']")
	private WebElement due_date1;
	
	@FindBy(xpath="//input[@id='first_name1']")
	private WebElement first_name1;
	
	@FindBy(xpath="//input[@id='last_name1']")
	private WebElement last_name1;
	
	@FindBy(xpath="//input[@id='codename1']")
	private WebElement codename1;
	
	@FindBy(xpath="//a")
	private List<WebElement> profile1AnchorTags;
	
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
	
	@FindBy(xpath="//button[@id='submit_profile']")
	private WebElement submit;
	
	@FindBy (xpath = "//input[@id='profile_table2']/tr")
	private List<WebElement> profileRow2;
	
	@FindBy(xpath="//input[@id='currency2']")
	private WebElement currency2;
	
	@FindBy(xpath="//input[@id='amount2']")
	private WebElement amount2;
	
	@FindBy(xpath="//input[@id='due_date2']")
	private WebElement due_date2;
	
	@FindBy(xpath="//input[@id='first_name2']")
	private WebElement first_name2;
	
	@FindBy(xpath="//input[@id='last_name2']")
	private WebElement last_name2;
	
	@FindBy(xpath="//input[@id='codename2']")
	private WebElement codename2;
	
	@FindBy(xpath="//a")
	private List<WebElement> profile2AnchorTags;
	
	public ProfileHostPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public int sizeOfTable1() {
		return this.profileRow1.size();
	}
	
	public int sizeOfTable2() {
		return this.profileRow2.size();
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
	
	public void clickLink1(String firstname) {
		for(WebElement link: this.profile1AnchorTags) {
			if(link.getText().equals(firstname)) {
				link.click();
			}
		}
	}
	
	public void clickLink2(String firstname) {
		for(WebElement link: this.profile2AnchorTags) {
			if(link.getText().equals(firstname)) {
				link.click();
			}
		}
	}

	public List<WebElement> getProfile1AnchorTags() {
		return profile1AnchorTags;
	}
	
	public List<WebElement> getProfile2AnchorTags() {
		return profile2AnchorTags;
	}

}
