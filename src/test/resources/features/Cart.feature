@Smoke
Feature: Cart Functionality

  Scenario: User should be able to navigate to cart page
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on the cart icon
    Then User should see the cart page
