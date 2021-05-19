package org.pojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	// Email Field
	@CacheLookup
	@FindBys({
		@FindBy(xpath="//input[@id='email']"),
		@FindBy(xpath="//input[@name='email']"),
		@FindBy(xpath="//input[@placeholder='Email address or phone number']")
	})
	private WebElement emailFindBys;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@id='email']"),
		@FindBy(xpath="//input[@name='email']"),
		@FindBy(xpath="//input[@placeholder='Email address or phone number']")
	})
	private WebElement emailFindAll;
	
	
	
	// Password Field
	@CacheLookup
	@FindBy(name="pass")
	private WebElement password;
	
	
	
	// Login Button
	
	@CacheLookup
	@FindBys({
		@FindBy(xpath="//button[@id='u_0_d_ZP']"),
		@FindBy(xpath="//button[@name='login']")
	})
	private WebElement loginFindBys;
	
	
	@FindAll({
		@FindBy(xpath="//button[@id='u_0_d_ZP']"),
		@FindBy(xpath="//button[@name='login']")
	})
	private WebElement loginFindAll;

	
	public WebElement getEmailFindBys() {
		return emailFindBys;
	}

	public WebElement getEmailFindAll() {
		return emailFindAll;
	}

	public WebElement getLoginFindBys() {
		return loginFindBys;
	}

	public WebElement getLoginFindAll() {
		return loginFindAll;
	}

	public WebElement getPassword() {
		return password;
	}

	
	
	
	
	
}
