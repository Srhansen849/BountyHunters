
Feature: A Bounty Hunter can upload a bounty
	As a Bounty Hunter, I wish to register a bounty as complete


  Background: A Bounty Hunter is logged in on the Star Hunter Page
		Given the Bounty Hunter is on the login page
		When the Bounty Hunter selects the Bounty Hunter Login
		And the Bounty Hunter inputs "username" into the username field
		And the Bounty Hunter inputs "password" into the password field
		And the Bounty Hunter clicks login
		Then the Bounty Hunter is directed to the home page
		
		
	Scenario: Completed a bounty
		When the Bounty Hunter clicks the Upload a Bounty link
		And the Bounty Hunter inputs "firstname" into the first name input field
		And the Bounty Hunter inputs "lastname" into the last name input field 
		And the Bounty Hunter inputs "codenme" into the code name input field 
#		And the Bounty Hunter inputs "image" into the image input field
		And the Bounty Hunter inputs "decription_of_capture" into the decription of capture input field
		And the Bounty Hunter clicks submits
		Then the bounty will be registered as complete 
		 	
		 	