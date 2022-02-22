package com.example.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadBounty {
	
	@FindBy (xpath = "//tr")
	private List<WebElement> bountiesRow;
	
	@FindBy(xpath="//input[@id='inputFirstName']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='inputLastName']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='inputCodeName']")
	private WebElement codename;
	
	@FindBy(xpath="//input[@id='description_of_crime']")
	private WebElement description;
	
	@FindBy(xpath="//button[@id='submit_profile']")
	private WebElement uploadBounty;
	
	@FindBy(xpath="//a")
	private List<WebElement> bountiesAnchorTags;
	
	public UploadBounty(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public int sizeOfTable() {
		return this.bountiesRow.size();
	}
	
	public void submitUpload(String firstname, String lastname,
			String codename, String description) {
		this.firstname.clear();
		this.lastname.clear();
		this.codename.clear();
		this.description.clear();
		
		this.firstname.sendKeys(firstname);
		this.lastname.sendKeys(lastname);
		this.codename.sendKeys(codename);
		this.description.sendKeys(description);
		
		this.uploadBounty.click();
	}
	
	public void clickLink(String firstname) {
		for(WebElement link: this.bountiesAnchorTags) {
			if(link.getText().equals(firstname)) {
				link.click();
			}
		}
	}
	
	public List<WebElement> getBountiesAnchorTags() {
		return bountiesAnchorTags;
	}
	

}
