package org.pojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzLoginPojo extends BaseClass {
	
	public AmzLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ap_email")
	private WebElement amzEmail;
	
	@FindBy(id="continue")
	private WebElement amzContinue;
	
	@FindBy(id="ap_password")
	private WebElement amzPassword;
	
	@FindBy(id="signInSubmit")
	private WebElement amzSignin;

	public WebElement getAmzEmail() {
		return amzEmail;
	}

	public WebElement getAmzContinue() {
		return amzContinue;
	}

	public WebElement getAmzPassword() {
		return amzPassword;
	}

	public WebElement getAmzSignin() {
		return amzSignin;
	}
	

}
