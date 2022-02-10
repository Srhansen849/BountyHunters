
Feature: User Logs into Star Hunter
  As a user, I wish to login to the Star Hunters website using proper Credentials

 
  Scenario: Bounty Hunter successfully logs in 
    Given a user is at the login page
    When a user inputs thier user name
    And a user inputs thier password
    And a user submits the information
    But that user is a user of the role Bounty Hunter
    Then the user is redirected to the Home page for the Bounty Hunters

      
  Scenario: Bounty Hunter failed logs in 
    Given a user is at the login page
    When a user inputs thier user name
    And a user inputs thier password
    And a user submits the information
    But that user is a user of the role Bounty Hunter
    Then the user is redirected to the Home page for the Bounty Hunters
      

  Scenario: Business Owner successfully logs in 
    Given a user is at the login page
    When a user inputs thier user name
    And a user inputs thier password
    And a user submits the information
    But that user is a user of the role Bounty Hunter
    Then the user is redirected to the Home page for the Bounty Hunters


  Scenario: Business Owner failed logs in 
    Given a user is at the login page
    When a user inputs thier user name
    And a user inputs thier password
    And a user submits the information
    But that user is a user of the role Bounty Hunter
    Then the user is redirected to the Home page for the Bounty Hunters

