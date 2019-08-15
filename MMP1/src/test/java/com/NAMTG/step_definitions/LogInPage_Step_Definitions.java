package com.NAMTG.step_definitions;

import static org.junit.Assert.assertEquals;

import com.NAMTG.pages.LogInPage;
import com.NAMTG.utilities.Configuration_Reader;
import com.NAMTG.utilities.Driver_Utils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInPage_Step_Definitions {

	LogInPage loginPage = new LogInPage();

	@Given("User has valid url, user should be able to see the Login Button")
	public void user_has_valid_url_user_should_be_able_to_see_the_Login_Button() {

		Driver_Utils.getDriver().get(Configuration_Reader.getProperty("url"));
		String expectedTitle = "NAMTG";
		String actualTitle = Driver_Utils.getDriver().getTitle();
		assertEquals(expectedTitle, actualTitle);

	}

	@When("User clicks on Login button, enters username and password, should be able to see homepage")
	public void user_clicks_on_Login_button_enters_username_and_password_should_be_able_to_see_homepage() {

		loginPage.login.click(); 
		loginPage.username.sendKeys(Configuration_Reader.getProperty("username"));
		loginPage.password.sendKeys(Configuration_Reader.getProperty("password"));
		loginPage.signin.click();

	}

	@When("User clicks on Logout button")
	public void user_clicks_on_Logout_button() {
		
		loginPage.logOut.click();

	}

	@Then("User should able to Logout successfully")
	public void user_should_able_to_Logout_successfully() {
	}
	
	String expetectedTitle = "NAMTG";
	String actualTitleString = Driver_Utils.getDriver().getTitle();
	
	
	
	
	
	
	
}
