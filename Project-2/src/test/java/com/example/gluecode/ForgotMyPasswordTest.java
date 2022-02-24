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

public class ForgotMyPasswordTest {
	
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




//@Given("the user is on the forgot my password page")
//public void the_user_is_on_the_forgot_my_password_page() {
//    
//}
//
//@Given("the user has an account with Star Hunters")
//public void the_user_has_an_account_with_star_hunters() {
//    
//}
//
//@When("a user inputs thier email")
//public void a_user_inputs_thier_email() {
//   
//}
//
//@When("a user submits the information")
//public void a_user_submits_the_information() {
//    
//}
//
//@Then("a email will be sent to the user")
//public void a_email_will_be_sent_to_the_user() {
//   
//}
//@Then("a user will be redirected to the login page")
//public void a_user_will_be_redirected_to_the_login_page() {
//    
//}