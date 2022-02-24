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

public class EditProfileTest {
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


//
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
//@Given("a bounty hunter inputs their user name {string}")
//public void a_bounty_hunter_inputs_their_user_name(String string) {
//  
//}
//@Given("a bounty hunter inputs their password {string}")
//public void a_bounty_hunter_inputs_their_password(String string) {
//  
//}
//@When("a bounty hunter is in the editing profile")
//public void a_bounty_hunter_is_in_the_editing_profile() {
//  
//}
//@When("a bounty hunter edits the name {string}")
//public void a_bounty_hunter_edits_the_name(String string) {
// 
//}
//@When("a bounty hunter edits the description {string}")
//public void a_bounty_hunter_edits_the_description(String string) {
//  
//}
//@When("a bounty hunter edits the amount {string}")
//public void a_bounty_hunter_edits_the_amount(String string) {
//  
//}
//@When("a bounty hunter edits the height {string}")
//public void a_bounty_hunter_edits_the_height(String string) {
//  
//}
//@When("a bounty hunter edits the weight {string}")
//public void a_bounty_hunter_edits_the_weight(String string) {
//  
//}
//@When("a bounty hunter edits the organization {string}")
//public void a_bounty_hunter_edits_the_organization(String string) {
//  
//}
//@When("a bounty hunter edits the associates {string}")
//public void a_bounty_hunter_edits_the_associates(String string) {
//  
//}
//@When("a bounty hunter edits the time limit {string}")
//public void a_bounty_hunter_edits_the_time_limit(String string) {
//  
//}
//@When("a bounty hunter edits the image")
//public void a_bounty_hunter_edits_the_image() {
// 
//}
//@Then("a bounty hunter submits the information for changes")
//public void a_bounty_hunter_submits_the_information_for_changes() {
//  
//}
//@Then("a bounty hunter is redirected to the successful editing page")
//public void a_bounty_hunter_is_redirected_to_the_successful_editing_page() {
//  
//}
//
////another @given #2
//
////another @given #3
//@When("the Bounty Hunter clicks the Upload a Bounty link")
//public void the_bounty_hunter_clicks_the_upload_a_bounty_link() {
//  
//}
//@When("the Bounty Hunter selects the edit profile button")
//public void the_bounty_hunter_selects_the_edit_profile_button() {
// 
//}
//@When("the Bounty Hunter inputs {string} into the first name input field")
//public void the_bounty_hunter_inputs_into_the_first_name_input_field(String string) {
//  
//}
//@When("the Bounty Hunter inputs {string} into the last name input field")
//public void the_bounty_hunter_inputs_into_the_last_name_input_field(String string) {
//  
//}
//@When("the Bounty Hunter inputs {string} into the code name input field")
//public void the_bounty_hunter_inputs_into_the_code_name_input_field(String string) {
//  
//}
//@When("the Bounty Hunter inputs {string} into the email input field")
//public void the_bounty_hunter_inputs_into_the_email_input_field(String string) {
// 
//}
//@When("the Bounty Hunter inputs {string} into the username input field")
//public void the_bounty_hunter_inputs_into_the_username_input_field(String string) {
//
//}
//@When("the Bounty Hunter inputs {string} into the password input field")
//public void the_bounty_hunter_inputs_into_the_password_input_field(String string) {
//  
//}
//@When("the Bounty Hunter inputs {string} into the confirm password input field")
//public void the_bounty_hunter_inputs_into_the_confirm_password_input_field(String string) {
//  
//}
//@When("the Bounty Hunter clicks submit")
//public void the_bounty_hunter_clicks_submit() {
// 
//}
//@Then("the Bounty Hunter profile will be updated")
//public void the_bounty_hunter_profile_will_be_updated() {
// 
//}
