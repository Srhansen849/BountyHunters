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
Feature: User Logs into Star Hunter
  As a user, I wish to login to the Star Hunters website using proper Credentials

  @tag1
  Scenario: Bounty Hunter successfully logs in 
    Given a user is at the login page
    When a user inputs thier user name
    And a user inputs thier password
    And a user submits the information
    But that user is a user of the role Bounty Hunter
    Then the user is redirected to the Home page for the Bounty Hunters

  @tag2
  Scenario Outline: Bounty Hunter successfully logs in 
    Given a user is at the login page
    When a user inputs thier user name "<username>"
    And a user inputs thier password "<password>"
    And a user submits the information
    But that user is a user of the role Bounty Hunter
    Then the user is redirected to the Home page for the Bounty Hunters


    Examples: 
      | username  | password    |
      |  |  |

      
  @tag3
  Scenario: Bounty Hunter failed logs in 
    Given a user is at the login page
    When a user inputs thier user name
    And a user inputs thier password
    And a user submits the information
    But that user is a user of the role Bounty Hunter
    Then the user is redirected to the Home page for the Bounty Hunters

  @tag4
  Scenario Outline: Bounty Hunter failed logs in 
    Given a user is at the login page
    When a user inputs the incorrect user name "<username>"
    And a user inputs the incorrect password "<password>"
    And a user submits the information
    But that user is a user of the role Bounty Hunter
    Then the user is redirected to the Home page for the Bounty Hunters


    Examples: 
      | username  | password    |
      |  |  |
      
  @tag5
  Scenario: Business Owner successfully logs in 
    Given a user is at the login page
    When a user inputs thier user name
    And a user inputs thier password
    And a user submits the information
    But that user is a user of the role Bounty Hunter
    Then the user is redirected to the Home page for the Bounty Hunters

  @tag6
  Scenario Outline: Business Owner successfully logs in 
    Given a user is at the login page
    When a user inputs thier user name "<username>"
    And a user inputs thier password "<password>"
    And a user submits the information
    But that user is a user of the role Bounty Hunter
    Then the user is redirected to the Home page for the Bounty Hunters


    Examples: 
      | username  | password    |
      |  |  |

      
  @tag7
  Scenario: Business Owner failed logs in 
    Given a user is at the login page
    When a user inputs thier user name
    And a user inputs thier password
    And a user submits the information
    But that user is a user of the role Bounty Hunter
    Then the user is redirected to the Home page for the Bounty Hunters

  @tag8
  Scenario Outline: Business Owner failed logs in 
    Given a user is at the login page
    When a user inputs the incorrect user name "<username>"
    And a user inputs the incorrect password "<password>"
    And a user submits the information
    But that user is a user of the role Bounty Hunter
    Then the user is redirected to the Home page for the Bounty Hunters


    Examples: 
      | username  | password    |
      |  |  |