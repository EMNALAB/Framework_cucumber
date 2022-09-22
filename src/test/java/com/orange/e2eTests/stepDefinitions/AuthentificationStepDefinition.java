package com.orange.e2eTests.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orange.e2eTests.pageObjects.AuthentificationPage;
import com.orange.e2eTests.utils.Common;
import com.orange.e2eTests.utils.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class AuthentificationStepDefinition extends Common{

	public WebDriver driver;
	
	AuthentificationPage authentificationPage =new  AuthentificationPage(driver);

	
	
	
	@Given("^Open application$")
	public void openApplication() throws Throwable {
		logger.info("Open application Orange");
		authentificationPage.navigate();
		
	}

	
}
