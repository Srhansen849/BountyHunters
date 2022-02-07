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
Feature: Forgot My Password
  As a user, I wish to reset my password

  @tag1
  Scenario: User resets their password
    Given the user is on the forgot my password page
    And the user has an account with Star Hunters
    When a user inputs thier email 
    And a user submits the information
    Then a email will be sent to the user
    And a user will be redirected to the login page

  @tag2
  Scenario Outline: User resets their password
    Given the user is on the forgot my password page
    And the user has an account with Star Hunters
    When a user inputs thier email "<email>"
    And a user submits the information
    Then a email will be sent to the user
    And a user will be redirected to the login page

    Examples: 
      | email |
      |  |
