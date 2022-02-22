package com.example.gluecode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

public class CompletedBountyTest {
	private LoginPage lp;
	private LoginHostPage loghost;
	private UploadBounty upB;
	private ConfirmBounty conB;
	private RegisterBounty regiB;
	private ProfilePage proP;
	private ProfileHostPage proHostP;
	private NewAccount newA;
	private HomePage hp;
	private HomePageHost hph;
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
	

@Given("the Bounty Hunter is on the login page")
public void the_bounty_hunter_is_on_the_login_page() {
	this.lp = new LoginPage(BountiesUtilityDriver.driver);
    assertEquals("http://localhost:4200/login", BountiesUtilityDriver.driver.getCurrentUrl());
}

@When("the Bounty Hunter selects the Bounty Hunter Login")
public void the_bounty_hunter_selects_the_bounty_hunter_login() {
	WebDriver driver = new ChromeDriver();
	WebElement radio = driver.findElement(By.xpath("//input[@id='user_login']"));
	radio.click();
	this.lp = new LoginPage(BountiesUtilityDriver.driver);
    assertEquals("http://localhost:4200/login", BountiesUtilityDriver.driver.getCurrentUrl());
}

@When("the Bounty Hunter inputs {string} into the username field")
public void the_bounty_hunter_inputs_into_the_username_field(String string) {
	this.username = string;
}

@When("the Bounty Hunter inputs {string} into the password field")
public void the_bounty_hunter_inputs_into_the_password_field(String string) {
	this.password = string;
}

@When("the Bounty Hunter clicks login")
public void the_bounty_hunter_clicks_login() {
	WebDriver driver = new ChromeDriver();
	WebElement login = driver.findElement(By.xpath("//input[@id='loginButton']"));
	login.click();
}

@Then("the Bounty Hunter is directed to the home page")
public void the_bounty_hunter_is_directed_to_the_home_page() {
	this.lp = new LoginPage(BountiesUtilityDriver.driver);
	assertEquals("http://localhost:4200/homepage-user", BountiesUtilityDriver.driver.getCurrentUrl());
}


// don't understand this
@When("the Bounty Hunter clicks the Upload a Bounty link")
public void the_bounty_hunter_clicks_the_upload_a_bounty_link() {
    
}

@When("the Bounty Hunter can see a list Active Bounties")
public void the_bounty_hunter_can_see_a_list_active_bounties() {
    
}

@When("the Bounty Hunter inputs {string} into the first name input field")
public void the_bounty_hunter_inputs_into_the_first_name_input_field(String string) {
    
}

@When("the Bounty Hunter inputs {string} into the last name input field")
public void the_bounty_hunter_inputs_into_the_last_name_input_field(String string) {
    
}

@When("the Bounty Hunter inputs {string} into the code name input field")
public void the_bounty_hunter_inputs_into_the_code_name_input_field(String string) {
    
}

@When("the Bounty Hunter inputs {string} into the decription of capture input field")
public void the_bounty_hunter_inputs_into_the_decription_of_capture_input_field(String string) {
    
}

@When("the Bounty Hunter clicks submits")
public void the_bounty_hunter_clicks_submits() {
   
}
@Then("the bounty will be registered as complete")
public void the_bounty_will_be_registered_as_complete() {
    
}



	

}
