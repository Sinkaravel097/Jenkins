package org.stepdefinition;

import org.bas.BaseClass;
import org.pojo.AmzLoginPojo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmzValidCredential extends BaseClass{
	
	AmzLoginPojo a;
	
	@When("User has to enter the valid email or phone number")
	public void userHasToEnterTheValidEmailOrPhoneNumber() {
		a = new AmzLoginPojo();
		fillText(a.getAmzEmail(), "amaz345@gmail.com");
	}

	@When("User to click the continue btn")
	public void userToClickTheContinueBtn() {
		btnClick(a.getAmzContinue());
	}

	@When("User has to enter the valid password inn password field")
	public void userHasToEnterTheValidPasswordInnPasswordField() {
		fillText(a.getAmzPassword(), "aon3456");
	}

	@When("User to click the sign btn")
	public void userToClickTheSignBtn() throws InterruptedException {
		btnClick(a.getAmzSignin());
		Thread.sleep(3000);
	}

	@Then("User to close the browser")
	public void userToCloseTheBrowser() {
		closeBrowser();
	}
	

}
