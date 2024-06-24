Feature: Transfer Fund Feature

  Scenario: Verify user is able to transfer fund
    Given user open the website
    Given user enters valid "DigitalBank.userName" and "DigitalBank.password"
    When user clicks on Sign In button

    Then verify user is successfully logged in to the account
    When user clicks on transfer between accounts

    Then verify user is on internal transfer page
    When user select from account "DigitalBank.fromAccount"
    And user select to account "DigitalBank.toAccount"
    And enter amount "transfer.amount"
    And click on submit button

    Then verify user is on View Accounts page
    And verify transaction history displayed for new transaction on UI
    And verify transaction details getting updated into the database



