package com.automation.stepdefinition;

import com.automation.pages.DigitalBank_HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DigitalBank_HomeSteps {

    DigitalBank_HomePage digitalBankHomePage = new DigitalBank_HomePage();

    @Then("verify user is successfully logged in to the account")
    public void verify_user_is_successfully_logged_in_to_the_account() {
        digitalBankHomePage.verifyUserOnHomePage();

    }

    @When("user clicks on transfer between accounts")
    public void user_clicks_on_transfer_between_accounts() {
        digitalBankHomePage.userClickOnTransferBetweenAccount();

    }



}
