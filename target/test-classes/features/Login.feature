Feature: SauceDemo Login

  @TC001
  Scenario: Successful login with valid credentials
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then User should be logged in successfully
    
    
  @TC002 @regression
  Scenario: Verify the title of the page
    Given User is on SauceDemo login page
    Then Verify the title of the login page
    
    @TC003 @regression
    Scenario: Verify the login with empty credentials
    Given User is on SauceDemo login page
    When User do not enter any credentials
    Then Verify the error message for empty fields
    
     @TC004
  Scenario: Unsuccessful login with invalid credentials
    Given User is on SauceDemo login page
    When User enters username "Abhi" and password "Shinde"
    Then verify the error message for invalid fields
    
    
    