
Feature: A Bounty Hunter can upload a bounty
	As a Bounty Hunter, I wish to register a bounty as complete


  Background: A Bounty Hunter is logged in on the Star Hunter Page
		Given the Bounty Hunter is on the login page
		When the Bounty Hunter selects the Bounty Hunter Login
		And the Bounty Hunter inputs "username" into the username field
		And the Bounty Hunter inputs "password" into the password field
		And the Bounty Hunter clicks login
		Then the Bounty Hunter is directed to the home page

	Scenario: Editing Profile as Bounty Hunter
		When the Bounty Hunter clicks the Upload a Bounty link
		And the Bounty Hunter selects the edit profile button
		And the Bounty Hunter inputs "firstname" into the first name input field
		And the Bounty Hunter inputs "lastname" into the last name input field
		And the Bounty Hunter inputs "codename" into the code name input field
		And the Bounty Hunter inputs "email" into the email input field
		And the Bounty Hunter inputs "username" into the username input field
		And the Bounty Hunter inputs "password" into the password input field
		And the Bounty Hunter inputs "password" into the confirm password input field
#		And the Bounty Hunter inputs "avatar" into the avatar input field
		And the Bounty Hunter clicks submit
		Then the Bounty Hunter profile will be updated
		 	