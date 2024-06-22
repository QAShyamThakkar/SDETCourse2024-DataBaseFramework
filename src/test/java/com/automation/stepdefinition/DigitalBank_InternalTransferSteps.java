package com.automation.stepdefinition;

import com.automation.pages.DigitalBank_InternalTransferPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DigitalBank_InternalTransferSteps {

    DigitalBank_InternalTransferPage digitalBankInternalTransferPage = new DigitalBank_InternalTransferPage();

    @Then("verify user is on internal transfer page")
    public void verify_user_is_on_internal_transfer_page() {
        digitalBankInternalTransferPage.verifyUserIsOnInternalTransferPage();

    }

    @When("user select from account {string}")
    public void user_select_from_account(String fromAccount) {
        digitalBankInternalTransferPage.userSelectFromAccount(fromAccount);

    }

    @When("user select to account {string}")
    public void user_select_to_account(String toAccount) {
        digitalBankInternalTransferPage.userSelectToAccount(toAccount);

    }

    @When("enter amount {string}")
    public void enter_amount(String amount) {
        digitalBankInternalTransferPage.enterAmount(amount);

    }

    @When("click on submit button")
    public void click_on_submit_button() {
        digitalBankInternalTransferPage.userClickOnSubmit();

    }


}
