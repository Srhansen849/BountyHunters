package com.example.gluecode;

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

public class PostBountyTest {
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

@Given("the Business Owner is on the login page")
public void the_business_owner_is_on_the_login_page() {
    
}

@When("the Business Owner selects the Business Owner Login")
public void the_business_owner_selects_the_business_owner_login() {
    
}
@When("the Business Owner inputs {string} into the username field")
public void the_business_owner_inputs_into_the_username_field(String string) {
    
}
@When("the Business Owner inputs {string} into the password field")
public void the_business_owner_inputs_into_the_password_field(String string) {
   
}
@When("the Business Owner clicks login")
public void the_business_owner_clicks_login() {
    
}
@Then("the Business Owner is directed to the home page")
public void the_business_owner_is_directed_to_the_home_page() {
    
}
@When("the Business Owner clicks the Register a New Bounty link")
public void the_business_owner_clicks_the_register_a_new_bounty_link() {
   
}
@When("the Business Owner can see a list of active Bounty Hunters")
public void the_business_owner_can_see_a_list_of_active_bounty_hunters() {
  
}
@When("the Business Owner inputs {string} into the first name input field")
public void the_business_owner_inputs_into_the_first_name_input_field(String string) {
    
}
@When("the Business Owner inputs {string} into the last name input field")
public void the_business_owner_inputs_into_the_last_name_input_field(String string) {
    
}
@When("the Business Owner inputs {string} into the code name input field")
public void the_business_owner_inputs_into_the_code_name_input_field(String string) {
    
}
@When("the Business Owner inputs {string} into the physical description input field")
public void the_business_owner_inputs_into_the_physical_description_input_field(String string) {
   
}
@When("the Business Owner inputs {string} into the species input field")
public void the_business_owner_inputs_into_the_species_input_field(String string) {
    
}
@When("the Business Owner inputs {string} into the height input field")
public void the_business_owner_inputs_into_the_height_input_field(String string) {
    
}
@When("the Business Owner inputs {string} into the weight input field")
public void the_business_owner_inputs_into_the_weight_input_field(String string) {
    
}
@When("the Business Owner inputs {string} into the organization input field")
public void the_business_owner_inputs_into_the_organization_input_field(String string) {
   
}
@When("the Business Owner inputs {string} into the known associates input field")
public void the_business_owner_inputs_into_the_known_associates_input_field(String string) {
   
}
@When("the Business Owner selects the status")
public void the_business_owner_selects_the_status() {
    
}
@When("the Business Owner inputs {string} into the time limit input field")
public void the_business_owner_inputs_into_the_time_limit_input_field(String string) {
   
}
@When("the Business Owner inputs {string} into the amount input field")
public void the_business_owner_inputs_into_the_amount_input_field(String string) {
    
}
@When("the Business Owner inputs {string} into the description of crime input field")
public void the_business_owner_inputs_into_the_description_of_crime_input_field(String string) {
   
}
@When("the Business Owner submits the information")
public void the_business_owner_submits_the_information() {
   
}
@Then("a new bounty will uploaded")
public void a_new_bounty_will_uploaded() {
   
}

}
