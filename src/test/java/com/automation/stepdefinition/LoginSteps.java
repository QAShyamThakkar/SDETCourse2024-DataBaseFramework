package com.automation.stepdefinition;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user open website")
    public void user_open_website() {
        loginPage.openWebsite();
    }

    @When("user log in with valid username and valid password")
    public void user_log_in_with_valid_username_and_valid_password() {
        loginPage.doLogin();
    }

    @Then("verify user is on the home page")
    public void verify_user_is_on_the_home_page() {
        loginPage.verifyHomePage();
    }

}
