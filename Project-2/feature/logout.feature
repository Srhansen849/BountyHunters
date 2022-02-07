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
Feature: User logs out of the Star Hunters website
  As a user, I wish to log out of the Star Hunters website

  @tag1
  Scenario: User successfully logs out
    Given the user is logged in with a username 
    And the user is logged in with a password 
    When the user selects the logout button
    Then the users session is invalidated
    And the user redirected to the Home page

  @tag2
  Scenario Outline: User successfully logs out
    Given the user is logged in with a username "<username>"
    And the user is logged in with a password "<password>"
    When the user selects the logout button
    Then the users session is invalidated
    And the user redirected to the Home page

    Examples: 
      | username  | password    |
      |  |  |
