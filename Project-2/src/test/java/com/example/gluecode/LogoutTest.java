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

public class LogoutTest {
	
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
	





}


//@Given("the Bounty Hunter is on the login page")
//public void the_bounty_hunter_is_on_the_login_page() {
//  
//}
//
//@When("the Bounty Hunter selects the Bounty Hunter Login")
//public void the_bounty_hunter_selects_the_bounty_hunter_login() {
//  
//}
//@When("the Bounty Hunter inputs {string} into the username field")
//public void the_bounty_hunter_inputs_into_the_username_field(String string) {
//  
//}
//@When("the Bounty Hunter inputs {string} into the password field")
//public void the_bounty_hunter_inputs_into_the_password_field(String string) {
//  
//}
//@When("the Bounty Hunter clicks login")
//public void the_bounty_hunter_clicks_login() {
//  
//}
//@Then("the Bounty Hunter is directed to the home page")
//public void the_bounty_hunter_is_directed_to_the_home_page() {
//  
//}
//
//
////another @given #2
//
//@When("the Bounty Hunter inputs the incorrect {string} into the username field")
//public void the_bounty_hunter_inputs_the_incorrect_into_the_username_field(String string) {
//  
//}
//
//@When("the Bounty Hunter inputs the incorrect {string} into the password field")
//public void the_bounty_hunter_inputs_the_incorrect_into_the_password_field(String string) {
//  
//}
//
//@Then("the Bounty Hunter is directed to the login page")
//public void the_bounty_hunter_is_directed_to_the_login_page() {
//  
//}
//
//
////another @given #3
//
//
//@Given("the Business Owner is on the login page")
//public void the_business_owner_is_on_the_login_page() {
//  
//}
//
//@When("the Business Owner selects the Bounty Hunter Login")
//public void the_business_owner_selects_the_bounty_hunter_login() {
//  
//}
//@When("the Business Owner inputs {string} into the username field")
//public void the_business_owner_inputs_into_the_username_field(String string) {
//  
//}
//@When("the Business Owner inputs {string} into the password field")
//public void the_business_owner_inputs_into_the_password_field(String string) {
//  
//}
//@When("the Business Owner clicks login")
//public void the_business_owner_clicks_login() {
//  
//}
//@Then("the Business Owner is directed to the home page")
//public void the_business_owner_is_directed_to_the_home_page() {
//  
//}
//
//
////another @given #4
//
//@When("the Business Owner inputs the incorrect {string} into the username field")
//public void the_business_owner_inputs_the_incorrect_into_the_username_field(String string) {
//  
//}
//@When("the Business Owner inputs the incorrect {string} into the password field")
//public void the_business_owner_inputs_the_incorrect_into_the_password_field(String string) {
// 
//}
