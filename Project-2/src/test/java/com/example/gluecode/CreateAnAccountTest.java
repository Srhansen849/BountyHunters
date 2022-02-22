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

public class CreateAnAccountTest {
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
	

@Given("the user in on the create a new account page")
public void the_user_in_on_the_create_a_new_account_page() {
	this.newA = new NewAccount(BountiesUtilityDriver.driver);
    assertEquals("http://localhost:4200/newaccount", BountiesUtilityDriver.driver.getCurrentUrl());
}

@When("a user selects the Bounty Hunter Account")
public void a_user_selects_the_bounty_hunter_account() {
	WebDriver driver = new ChromeDriver();
	WebElement radio = driver.findElement(By.xpath("//input[@id='host_login']"));
	radio.click();
	this.newA = new NewAccount(BountiesUtilityDriver.driver);
    assertEquals("http://localhost:4200/newAccount", BountiesUtilityDriver.driver.getCurrentUrl());
    
}
@When("a user inputs {string} into the first name input field")
public void a_user_inputs_into_the_first_name_input_field(String string) {
	this.firstname = string;
    
}
@When("a user inputs {string} into the last name input field")
public void a_user_inputs_into_the_last_name_input_field(String string) {
    
}
@When("a user inputs {string} into the codename input field")
public void a_user_inputs_into_the_codename_input_field(String string) {
    
}
@When("a user inputs {string} into the currency input field")
public void a_user_inputs_into_the_currency_input_field(String string) {
    
}
@When("a user inputs {string} into the user name input field")
public void a_user_inputs_into_the_user_name_input_field(String string) {
    
}
@When("a user inputs {string} into the password input field")
public void a_user_inputs_into_the_password_input_field(String string) {
    
}
@When("a user inputs {string} into the confirmed password input field")
public void a_user_inputs_into_the_confirmed_password_input_field(String string) {
    
}
@When("a user inputs {string} into the email input field")
public void a_user_inputs_into_the_email_input_field(String string) {
    
}
@When("a user submits the information")
public void a_user_submits_the_information() {
    
}
@Then("a user will be created on the database")
public void a_user_will_be_created_on_the_database() {
    
}
@Then("a user is redirected to the Bounty Hunter Home page")
public void a_user_is_redirected_to_the_bounty_hunter_home_page() {
    
}

// another @Given

@When("a user selects the Business Owner Account")
public void a_user_selects_the_business_owner_account() {
    
}

@When("a user inputs {string} into the representative input field")
public void a_user_inputs_into_the_representative_input_field(String string) {
    
}
@When("a user inputs {string} into the association input field")
public void a_user_inputs_into_the_association_input_field(String string) {
    
}

@Then("a user is redirected to the Business Owner Home page")
public void a_user_is_redirected_to_the_business_owner_home_page() {
    
}


}
