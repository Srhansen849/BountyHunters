
Feature: User Logs into Star Hunter
  As a user, I wish to login to the Star Hunters website using proper Credentials

 
  Scenario: Bounty Hunter successfully logs in 
    Given the Bounty Hunter is on the login page
		When the Bounty Hunter selects the Bounty Hunter Login
		And the Bounty Hunter inputs "username" into the username field
		And the Bounty Hunter inputs "password" into the password field
		And the Bounty Hunter clicks login
		Then the Bounty Hunter is directed to the home page

      
  Scenario: Bounty Hunter failed logs in 
    Given the Bounty Hunter is on the login page
		When the Bounty Hunter selects the Bounty Hunter Login
		And the Bounty Hunter inputs the incorrect "username" into the username field
		And the Bounty Hunter inputs the incorrect "password" into the password field
		And the Bounty Hunter clicks login
		Then the Bounty Hunter is directed to the login page
      

  Scenario: Business Owner successfully logs in 
    Given the Business Owner is on the login page
		When the Business Owner selects the Bounty Hunter Login
		And the Business Owner inputs "username" into the username field
		And the Business Owner inputs "password" into the password field
		And the Business Owner clicks login
		Then the Business Owner is directed to the home page


  Scenario: Business Owner failed logs in 
    Given the Business Owner is on the login page
		When the Business Owner selects the Bounty Hunter Login
		And the Business Owner inputs the incorrect "username" into the username field
		And the Business Owner inputs the incorrect "password" into the password field
		And the Business Owner clicks login
		Then the Business Owner is directed to the login page

