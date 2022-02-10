
Feature: A Business Owner can see the Active Bounty Hunters List
	As a Business Owner, I wish to check the status of the bounty
	
	
	Background: A Business Owner is logged in on the Star Hunter Page
		Given the Business Owner is on the login page
		When the Business Owner selects the Business Owner Login
		And the Business Owner inputs "username" into the username field
		And the Business Owner inputs "password" into the password field
		And the Business Owner clicks login
		Then the Business Owner is directed to the home page
		
		
  Scenario: List of Active Bounty Hunter 
    When the Business Owner clicks on the List of Active Bounty Hunters link
    Then the Business Owner is brought to the List of Active Bounty Hunters page

  

  
  
  
  
  

