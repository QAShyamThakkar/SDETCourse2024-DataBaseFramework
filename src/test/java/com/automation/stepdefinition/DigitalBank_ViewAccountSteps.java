package com.automation.stepdefinition;

import io.cucumber.java.en.Then;
import com.automation.pages.*;

public class DigitalBank_ViewAccountSteps {

    DigitalBank_ViewAccountPage digitalBankViewAccountPage = new DigitalBank_ViewAccountPage();

    @Then("verify user is on View Accounts page")
    public void verify_user_is_on_view_accounts_page() {
        digitalBankViewAccountPage.verifyUserIsOnViewAccountsPage();

    }

    @Then("verify transaction history displayed for new transaction on UI")
    public void verify_transaction_history_displayed_for_new_transaction_on_ui() {
        digitalBankViewAccountPage.verifyTransactionHistory();

    }

    @Then("verify transaction details getting updated into the database")
    public void verify_transaction_details_getting_updated_into_the_database() {
        digitalBankViewAccountPage.verifyDetailsInDatabase();

    }

}
