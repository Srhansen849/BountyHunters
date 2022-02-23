
Feature: Create a New User
  I wish to create a new user for the Star Hunters website


  Scenario: Bounty Hunter Creates a new account
    Given the user in on the create a new account page
    When a user selects the Bounty Hunter Account
    And a user inputs "huntername" into the hunter name input field
#   And a user inputs "firstname" into the first name input field
#   And a user inputs "lastname" into the last name input field
#    And a user inputs "codename" into the codename input field
    And a user inputs "currency" into the currency input field
    And a user inputs "username" into the user name input field
    And a user inputs "password" into the password input field
    And a user inputs "password" into the confirmed password input field
    And a user inputs "email" into the email input field
#   And a user inputs "avatar" into the avatar input field
    And a user submits the information 
    Then a user will be created on the database
    And a user is redirected to the Bounty Hunter Home page


  Scenario: Business Owner Creates a new account
    Given the user in on the create a new account page
    When a user selects the Business Owner Account
#   And a user inputs "firstname" into the first name input field
#   And a user inputs "lastname" into the last name input field
    And a user inputs "codename" into the codename input field
    And a user inputs "currency" into the currency input field
    And a user inputs "username" into the user name input field
    And a user inputs "password" into the password input field
    And a user inputs "password" into the confirmed password input field
    And a user inputs "email" into the email input field
    And a user inputs "representative" into the representative input field
    And a user inputs "association" into the association input field
#   And a user inputs "avatar" into the avatar input field
    And a user submits the information
    Then a user will be created on the database
    And a user is redirected to the Business Owner Home page


  