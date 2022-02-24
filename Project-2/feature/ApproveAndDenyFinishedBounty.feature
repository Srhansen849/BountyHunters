Feature: A Business Owner can Confirm a Bounty has been completed 
    As a Business Owner, I wish to check the status of the bounty
    
    
    Background: A Business Owner is logged in on the Star Hunter Page
        Given the Business Owner is on the login page
        When the Business Owner selects the Business Owner Login
        And the Business Owner inputs "username" into the username field
        And the Business Owner inputs "password" into the password field
        And the Business Owner clicks login
        Then the Business Owner is directed to the home page
        
        
  Scenario: Approve Finished Bounty
    When the Business Owner clicks the Confirm a Bounty link
    And the Business Owner selects a completed bounty
    And the Business Owner add an "amount"
    And the Business Owner submits the information
    Then the bounty will be registered as complete