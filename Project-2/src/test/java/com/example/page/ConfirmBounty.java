package com.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmBounty {
	
	@FindBy(xpath="//input[@id='description_of_capture']")
	private WebElement description;
	
	
	@FindBy(xpath="//input[@id='inputamount1']")
	private WebElement amount1;
	
	@FindBy(xpath="//input[@id='inputFirstName']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='inputLastName']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='inputCodeName']")
	private WebElement codename;
	
	@FindBy(xpath="//input[@id='inputamount2']")
	private WebElement amount2;
	
	@FindBy(xpath="//button[@id='submit_amount']")
	private WebElement confirmbounty;
	
	public ConfirmBounty(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void submitConfirmBounty(String description, String amount1, String firstname,
			String lastname, String codename, String amount2) {
		this.description.clear();
		this.amount1.clear();
		this.firstname.clear();
		this.lastname.clear();
		this.codename.clear();
		this.amount2.clear();
		this.codename.clear();
		
		this.description.sendKeys(description);
		this.amount1.sendKeys(amount1);
		this.firstname.sendKeys(firstname);
		this.lastname.sendKeys(lastname);
		this.codename.sendKeys(codename);
		this.amount2.sendKeys(amount2);
		this.codename.sendKeys(codename);
		
		this.confirmbounty.click();
	}

}
