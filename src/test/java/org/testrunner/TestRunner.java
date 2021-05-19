package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreport.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefinition", monochrome = true, dryRun = false, strict = false,plugin= {"html:target","junit:Reports\\xmlreport.xml","json:Reports\\jsonreport.json","rerun:D:\\NewMaven\\Cucumber11.30am\\src\\test\\resources\\failedscenarios.txt"})
public class TestRunner {

	// features ---> mention the feature file path
	// glue --> mention the step definition class path
	// monochrome=true --> we can get the output as readable format
	// dryRun=true --> To get the missing snippets alone
	
	@AfterClass
	public static void reportGeneration() {
		JvmReport.generateJvmReport("D:\\NewMaven\\Cucumber11.30am\\Reports\\jsonreport.json");
	}

	
}




