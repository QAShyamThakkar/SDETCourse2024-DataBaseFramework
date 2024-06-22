package com.automation.stepdefinition;

import com.automation.pages.DigitalBank_LoginPage;
import io.cucumber.java.en.*;

public class DigitalBank_LoginSteps {

    DigitalBank_LoginPage digitalBankLoginPage = new DigitalBank_LoginPage();

    @Given("user open the website")
    public void user_open_the_website() {
        digitalBankLoginPage.userOpenWebsite();
        
    }

    @Given("user enters valid {string} and {string}")
    public void user_enters_valid_and(String userName, String password) {
        digitalBankLoginPage.userEnterValidCred(userName, password);
    }

    @When("user clicks on Sign In button")
    public void user_clicks_on_sign_in_button() {
        digitalBankLoginPage.clickOnSubmitBtn();
        
    }



}
