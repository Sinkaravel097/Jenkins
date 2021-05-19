package org.stepdefinition;

import org.bas.BaseClass;
import org.pojo.AmzLoginPojo;
 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmzInvalidCredential extends BaseClass{
	
	AmzLoginPojo a;
	
	@Given("User to launch the browser and hit amazon url")
	public void user_to_launch_the_browser_and_hit_amazon_url() {
		
		launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}

	@When("User has to enter the invalid email or phone number")
	public void user_has_to_enter_the_invalid_email_or_phone_number() {
	   
		a = new AmzLoginPojo();
		fillText(a.getAmzEmail(), "amazon@gmail.com");
	}

	@When("User has to click the continue btn")
	public void user_has_to_click_the_continue_btn() {
	    
		btnClick(a.getAmzContinue());
	}

	@When("User has to enter the invalid password inn password field")
	public void user_has_to_enter_the_invalid_password_inn_password_field() {
	    
		fillText(a.getAmzPassword(), "amazon3456");
	}

	@When("User has to click the sign btn")
	public void user_has_to_click_the_sign_btn() {
	    
		btnClick(a.getAmzSignin());
	}
	
	@Then("User has to close the entire browser")
	public void user_has_to_close_the_entire_browser() {
	    closeBrowser();
	}

}
