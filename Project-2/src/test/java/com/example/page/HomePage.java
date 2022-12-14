package com.example.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath = "//table[@id='bhunter']/tr")
	private List<WebElement> bhunterRow;
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstname;

	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='codename']")
	private WebElement codename;
	
	@FindBy(xpath="//input[@id='rank']")
	private WebElement rank;
	
	@FindBy(xpath="//a")
	private List<WebElement> bhunterAnchorTags;
	
	@FindBy (xpath = "//table[@id='bounties']/tr")
	private List<WebElement> bountiesRow2;
	
	@FindBy(xpath="//input[@id='currency]")
	private WebElement currency;
	
	@FindBy(xpath="//input[@id='amount']")
	private WebElement amount;
	
	@FindBy(xpath="//input[@id='due_date']")
	private WebElement due_date;
	
	@FindBy(xpath="//input[@id='first_name1']")
	private WebElement firstname1;
	
	@FindBy(xpath="//input[@id='last_name1']")
	private WebElement lastname1;
	
	@FindBy(xpath="//input[@id='codename1']")
	private WebElement codename1;
	
	@FindBy(xpath="//a")
	private List<WebElement> bountiesAnchorTags;
	

	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public int sizeOfTable() {
		return this.bhunterRow.size();
	}
	
	public int sizeOfTable2() {
		return this.bountiesRow2.size();
	}
	
	public void clickLink(String firstname) {
		for(WebElement link: this.bhunterAnchorTags) {
			if(link.getText().equals(firstname)) {
				link.click();
			}
		}
	}
	
	public void clickLink2(String firstname) {
		for(WebElement link: this.bountiesAnchorTags) {
			if(link.getText().equals(firstname)) {
				link.click();
			}
		}
	}
	
	public List<WebElement> getBountiesAnchorTags() {
		return bhunterAnchorTags;
	}
	
	public List<WebElement> getBountiesAnchorTags2() {
		return bountiesAnchorTags;
	}
	
}
