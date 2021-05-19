package org.stepdefinition;

import org.bas.BaseClass;
import org.pojo.LoginPojo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin2 extends BaseClass {

	LoginPojo l;
	
	@When("user has to enter the valid email in email field")
	public void user_has_to_enter_the_valid_email_in_email_field() {
		l = new LoginPojo();
	   fillText(l.getEmailFindAll(), "framework@gmail.com");
	}

	@When("User has to enter the valid password in password field")
	public void user_has_to_enter_the_valid_password_in_password_field() {
	   fillText(l.getPassword(), "frameword876");
	}

	@When("User to click login btn")
	public void user_to_click_login_btn() {
	    btnClick(l.getLoginFindAll());
	}

	@Then("User to close the entire browser")
	public void user_to_close_the_entire_browser() {
	    closeBrowser();
	}
}
