#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Create a New User
  I wish to create a new user for the Star Hunters website

  @tag1
  Scenario: Bounty Hunter Creates a new account
    Given the user in on the create a new account page
    When a user inputs thier first name
    And a user inputs thier last name
    And a user inputs thier user name
    And a user inputs thier codename
    And a user inputs thier password
    And a user inputs thier confirmed password
    And a user inputs thier email
    And a user inputs thier species
    And a user inputs thier currency
    And a user inputs thier avatar
    And a user submits the information
    Then a user will be created on the database
    And a user is redirected to the Bounty Hunter Home page

  @tag2
  Scenario Outline: Bounty Hunter Creates a new account
    Given the user in on the create a new account page
    When a user inputs thier first name "<firstname>"
    And a user inputs thier last name "<lastname>"
    And a user inputs thier user name "<username>"
    And a user inputs thier codename "<codename>"
    And a user inputs thier password "<password>"
    And a user inputs thier confirmed password "<password>"
    And a user inputs thier email "<email>"
    And a user inputs thier species "<species>"
    And a user inputs thier currency "<currency>"
    And a user inputs thier avatar "<avatar>"
    And a user submits the information 
    Then a user will be created on the database 
    And a user is redirected to the Bounty Hunter Home page
    
    
    Examples: 
      | firstname | lastname | username | codename | password | password | email | species | currency | avatar |
      |           |          |          |          |          |          |       |         |          |        |
     
     
  @tag1
  Scenario: Business Owner Creates a new account
    Given the user in on the create a new account page
    When a user inputs thier first name
    And a user inputs thier last name
    And a user inputs thier user name
    And a user inputs thier codename
    And a user inputs thier password
    And a user inputs thier confirmed password
    And a user inputs thier email
    And a user inputs thier species
    And a user inputs thier currency
    And a user inputs thier avatar
    And a user submits the information
    Then a user will be created on the database
    And a user is redirected to the Business Owner Home page

  @tag2
  Scenario Outline: Business Owner Creates a new account
    Given the user in on the create a new account page
    When a user inputs thier first name "<firstname>"
    And a user inputs thier last name "<lastname>"
    And a user inputs thier user name "<username>"
    And a user inputs thier codename "<codename>"
    And a user inputs thier password "<password>"
    And a user inputs thier confirmed password "<password>"
    And a user inputs thier email "<email>"
    And a user inputs thier species "<species>"
    And a user inputs thier currency "<currency>"
    And a user inputs thier avatar "<avatar>"
    And a user submits the information 
    Then a user will be created on the database 
    And a user is redirected to the Business Owner Home page
    
    
    Examples: 
      | firstname | lastname | username | codename | password | password | email | species | currency | avatar |
      |           |          |          |          |          |          |       |         |          |        |
