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

  Scenario: Post a Bounty
    Given a manager logs in with their "<username>"
    And a manager inputs their password "<password>"
    When a manager is logged in
    And  a manager inputs the name "<name>"
    And a manager inputs the description "<description>"
    And a manager inputs the amount "<amount>"
    And a manager selects the status 
    And a manager inputs the height "<height>"
    And a manager inputs the weight "<weight>"
    And a manager inputs the organization "<org>"
    And a manager inputs the known associates "<associates>"
    And a manager inputs the time limit "<limit>"
    Then a manager submits the new bounty




    Examples: 
      | username  | password | name  | description | amount | height | weight | org | associates | limit |
      |  |   |  |  |  |  |  |  |  |  |
      |  |  |  |  |  |  |  |  |  |  |
