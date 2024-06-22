Feature: Validate Login and Log out Functionality


  Scenario: Verify user can log in with Valid credentials
    Given user open website
    When user log in with valid username and valid password
    Then verify user is on the home page