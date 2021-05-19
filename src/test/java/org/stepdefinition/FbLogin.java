package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.bas.BaseClass;

import org.pojo.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {

	LoginPojo l;

	@Given("User has to launch the browser and hit the url")
	public void user_has_to_launch_the_browser_and_hit_the_url() {
		
		launchUrl("https://www.facebook.com/");
	}

	@When("User has to enter the invalid email in email field")
	public void user_has_to_enter_the_invalid_email_in_email_field() {

		l = new LoginPojo();
		fillText(l.getEmailFindAll(), "selenium@gmail.com");

	}

	@When("User has to enter the invalid password in password field")
	public void user_has_to_enter_the_invalid_password_in_password_field() {

		fillText(l.getPassword(), "selenium@gmail.com");
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {

		btnClick(l.getLoginFindAll());

	}
	
	@When("User has to logged in the home page or not")
	public void user_has_to_logged_in_the_home_page_or_not() {
	    System.out.println("Enter the valid credentials");
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {

		closeBrowser();
	}
	
	
	@When("User has to enter the {string} in email field")
	public void user_has_to_enter_the_in_email_field(String email) {
		l = new LoginPojo();
		fillText(l.getEmailFindAll(), email);
	}

	@When("User has to enter the {string} in password field")
	public void user_has_to_enter_the_in_password_field(String pass) {
		
		fillText(l.getPassword(), pass);
	}
	
	
	@When("User has to enter the invalid email in email fields")
	public void user_has_to_enter_the_invalid_email_in_email_fields(io.cucumber.datatable.DataTable dt) {
		
		l = new LoginPojo();  
		
		List<Map<String, String>> mp = dt.asMaps();
		
		fillText(l.getEmailFindAll(), mp.get(1).get("username2"));
	}

	@When("User has to enter the invalid password in password fields")
	public void user_has_to_enter_the_invalid_password_in_password_fields(io.cucumber.datatable.DataTable dt) {
		
		List<Map<String, String>> mp = dt.asMaps();
		
		fillText(l.getPassword(), mp.get(2).get("password3"));

	}
      

}
