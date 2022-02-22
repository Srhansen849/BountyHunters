package com.example.gluecode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.page.ConfirmBounty;
import com.example.page.ForgetPasswordPage;
import com.example.page.HomePage;
import com.example.page.HomePageHost;
import com.example.page.HomePageUser;
import com.example.page.LoginHostPage;
import com.example.page.LoginPage;
import com.example.page.NewAccount;
import com.example.page.ProfileHostPage;
import com.example.page.ProfilePage;
import com.example.page.RegisterBounty;
import com.example.page.UploadBounty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApproveAndDenyFinishedBountyTest {
	
	private LoginPage lp;
	private LoginHostPage loghost;
	private UploadBounty upB;
	private ConfirmBounty conB;
	private RegisterBounty regiB;
	private ProfilePage proP;
	private ProfileHostPage proHostP;
	private NewAccount newA;
	private HomePage hp;
	private LoginHostPage hph;
	private HomePageUser hpu;
	private ForgetPasswordPage forgetP;
	
	
	private String username;
	private String password;
	private String amount;
	private String firstname;
	private String lastname;
	private String codename;
	private String decription_of_capture;
	private String currency;
	private String email;
	private String representative;
	private String associates;
	private String name;
	private String description;
	private String height;
	private String weight;
	private String org;
	private String limit;
	private String crime;
	

@Given("the Business Owner is on the login page")
public void the_business_owner_is_on_the_login_page() {
	this.lp = new LoginPage(BountiesUtilityDriver.driver);
    assertEquals("http://localhost:4200/login", BountiesUtilityDriver.driver.getCurrentUrl());
}

@When("the Business Owner selects the Business Owner Login")
public void the_business_owner_selects_the_business_owner_login() {
	WebDriver driver = new ChromeDriver();
	WebElement radio = driver.findElement(By.xpath("//input[@id='host_login']"));
	radio.click();
	this.hph = new LoginHostPage(BountiesUtilityDriver.driver);
    assertEquals("http://localhost:4200/login", BountiesUtilityDriver.driver.getCurrentUrl());
}

@When("the Business Owner inputs {string} into the username field")
public void the_business_owner_inputs_into_the_username_field(String string) {
	this.username = string;
}

@When("the Business Owner inputs {string} into the password field")
public void the_business_owner_inputs_into_the_password_field(String string) {
	this.password = string;
}

@When("the Business Owner clicks login")
public void the_business_owner_clicks_login() {
	WebDriver driver = new ChromeDriver();
	WebElement login = driver.findElement(By.xpath("//input[@id='loginButton']"));
	login.click();
}

@Then("the Business Owner is directed to the home page")
public void the_business_owner_is_directed_to_the_home_page() {
	this.hph = new LoginHostPage(BountiesUtilityDriver.driver);
	assertEquals("http://localhost:4200/homepage-host", BountiesUtilityDriver.driver.getCurrentUrl());
}

@When("the Business Owner clicks the Confirm a Bounty link")
public void the_business_owner_clicks_the_confirm_a_bounty_link() {
    
}

@When("the Business Owner selects a completed bounty")
public void the_business_owner_selects_a_completed_bounty() {
    
}

@When("the Business Owner add an {string}")
public void the_business_owner_add_an(String string) {
    
}

@When("the Business Owner submits the information")
public void the_business_owner_submits_the_information() {
    
}

@Then("the bounty will be registered as complete")
public void the_bounty_will_be_registered_as_complete() {
    
}




}
