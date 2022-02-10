
Feature: A Bounty Hunter can see list of active bounties
	As a Bounty Hunter, I wish to see the list of active bounties


  Background: A user is logged in on the Star Hunter Page
		Given the Bounty Hunter is on the login page
		When the Bounty Hunter selects the Bounty Hunter Login
		And the Bounty Hunter inputs "username" into the username field
		And the Bounty Hunter inputs "password" into the password field
		And the Bounty Hunter clicks login
		Then the Bounty Hunter is directed to the home page
		
		
  Scenario: Clicks on List of Active Bounties link
    When the Bounty Hunter clicks on the List of Active Bounties link
    Then the Bounty Hunter will be taken to the List of Active Bounties page
  
  