Feature: A Business Owner can create a new bounty 
    As a Business Owner, I wish to create a new bounty
    
    
    Background: A Business Owner is logged in on the Star Hunter Page
        Given the Business Owner is on the login page
        When the Business Owner selects the Business Owner Login
        And the Business Owner inputs "username" into the username field
        And the Business Owner inputs "password" into the password field
        And the Business Owner clicks login
        Then the Business Owner is directed to the home page
        
        
  Scenario Outline: Post a Bounty
    When the Business Owner clicks the Register a New Bounty link
    And the Business Owner can see a list of active Bounty Hunters
    And the Business Owner inputs "hostname" into the host name input field
#   And the Business Owner inputs "firstname" into the first name input field
#   And the Business Owner inputs "lastname" into the last name input field
#   And the Business Owner inputs "codename" into the code name input field
#   And the Business Owner inputs "description" into the physical description input field
    And the Business Owner inputs "species" into the species input field
    And the Business Owner inputs "height" into the height input field
    And the Business Owner inputs "weight" into the weight input field
#   And the Business Owner inputs "org" into the organization input field
    And the Business Owner inputs "association" into the known associates input field
    And the Business Owner inputs "representative" into the known representatives input field
#   And the Business Owner inputs "image" into the image input field 
    And the Business Owner selects the status
#   And the Business Owner inputs "limit" into the time limit input field
#   And the Business Owner inputs "amount" into the amount input field
#   And the Business Owner inputs "crime" into the description of crime input field
    And the Business Owner submits the information
    Then a new bounty will uploaded
