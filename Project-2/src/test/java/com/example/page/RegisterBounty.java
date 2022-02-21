package com.example.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterBounty {
	
	@FindBy (xpath = "//tr")
	private List<WebElement> bountiesRow;
	
	@FindBy(xpath="//input[@id='inputFirstName']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='inputLastName']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='criminal_description']")
	private WebElement description;
	
	@FindBy(xpath="//input[@id='inputCodeName']")
	private WebElement codename;
	
	@FindBy(xpath="//input[@id='inputHeight']")
	private WebElement height;
	
	@FindBy(xpath="//input[@id='inputWeight']")
	private WebElement weight;
	
	@FindBy(xpath="//input[@id='inputSpecies']")
	private WebElement species;
	
	@FindBy(xpath="//input[@id='inputorganization']")
	private WebElement organization;
	
	@FindBy(xpath="//input[@id='inputAssociates']")
	private WebElement associates;
	
	@FindBy(xpath="//input[@id='inputtimelimit']")
	private WebElement timelimit;
	
	@FindBy(xpath="//input[@id='inputbounty']")
	private WebElement amount;
	
	@FindBy(xpath="//a")
	private List<WebElement> bountiesAnchorTags;
	
	public RegisterBounty(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public int sizeOfTable() {
		return this.bountiesRow.size();
	}
	
	public void registeredData(String firstname, String lastname, String description,
			String codename, String height, String weight, String species, String organization,
			String associates, String timelimit, String amount) {
		this.firstname.clear();
		this.lastname.clear();
		this.description.clear();
		this.codename.clear();
		this.height.clear();
		this.weight.clear();
		this.species.clear();
		this.organization.clear();
		this.associates.clear();
		this.timelimit.clear();
		this.amount.clear();
		
		this.firstname.sendKeys(firstname);
		this.lastname.sendKeys(lastname);
		this.description.sendKeys(description);
		this.codename.sendKeys(codename);
		this.height.sendKeys(height);
		this.weight.sendKeys(weight);
		this.species.sendKeys(species);
		this.organization.sendKeys(organization);
		this.associates.sendKeys(associates);
		this.timelimit.sendKeys(timelimit);
		this.amount.sendKeys(amount);
		
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
