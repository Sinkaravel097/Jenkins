package org.stepdefinition;

import org.bas.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	@Before(order=1)
	public void beforeExecution() {
		chromeBrowser();
		System.out.println("Browser launched");
	}
	
	@Before(order=2)
	public void beforeExecution1() {
		maxWindow();
		System.out.println("Window Maximized");
	}
	
	@Before(order=3,value="@Smoke")
	public void beforeExecution2() {
		System.out.println("Before Screenshot");
	}
	
	@After(order=5)
	public void afterExecution() {
		closeBrowser();
		System.out.println("Quit");
	}
	 
	@After(order=7)
	public void afterExecution1(Scenario s) {
		
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] tks = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(tks, "image/png");
			System.out.println(s.getName()+"***Scenario Failed***");
		}
		
		System.out.println("***Scenario End***");
	}
	
	
	
	
	

	
	
}
