@Regression
Feature: Inventory Page Verification

  Scenario: Verify user is on inventory page after login
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then User should see the product listing page with title "Products"
