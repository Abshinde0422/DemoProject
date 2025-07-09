Feature: Menu Item Features
  

  @TC005
  Scenario: Verify the presence of All items button in menu drawer
   Given User is on SauceDemo login page
   When User enters username "standard_user" and password "secret_sauce"
   And User clicks on menu drawer icon
   Then Verify user can see All item button
   
   @TC006
  Scenario: Verify the functionality of All items button in menu drawer
   Given User is on SauceDemo login page
   When User enters username "standard_user" and password "secret_sauce"
   And User clicks on menu drawer icon
   And User clicks on All item button
   Then Verify user navigate back to products page
   
   @TC007
  Scenario: Verify the presence of All items button in menu drawer
   Given User is on SauceDemo login page
   When User enters username "standard_user" and password "secret_sauce"
   And User clicks on menu drawer icon
   Then Verify user can see Logout button
   
      @TC008
  Scenario: Verify the presence of All items button in menu drawer
   Given User is on SauceDemo login page
   When User enters username "standard_user" and password "secret_sauce"
   And User clicks on menu drawer icon
   And User clicks on Logout button
   Then Verify user navigate back to login page
 
