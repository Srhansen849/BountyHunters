Feature: A Bounty Hunter can upload a bounty
	As a Bounty Hunter, I wish to register a bounty as complete

  Background: A Bounty Hunter is logged in on the Star Hunter Page
		Given the Bounty Hunter is on the login page
		When the Bounty Hunter selects the Bounty Hunter Login
		And the Bounty Hunter inputs "username" into the username field
		And the Bounty Hunter inputs "password" into the password field
		And the Bounty Hunter clicks login
		Then the Bounty Hunter is directed to the home page
		
		
 Scenario Outline: Editing Profile
		 	Given a bounty hunter inputs their user name "<username>"
		 	And a bounty hunter inputs their password "<password>"
		 	When a bounty hunter is in the editing profile
		 	And a bounty hunter edits the name "<name>"
		 	And a bounty hunter edits the description "<description"
		 	And a bounty hunter edits the amount "<amount>"
		 	And a bounty hunter edits the height "<height>"
		 	And a bounty hunter edits the weight "<weight"
		 	And a bounty hunter edits the organization "<org>"
		 	And a bounty hunter edits the associates "<associates>"
		 	And a bounty hunter edits the time limit "<limit>"
		 	And a bounty hunter edits the image
		 	Then a bounty hunter submits the information for changes
		 	And  a bounty hunter is redirected to the successful editing page
		 	
		 	Examples: 
		 		| username  | password  | name | description | amount | height | weight | org | associates | limit |
		 		|  |  |  |  |  |  |  |  |  |  | 
		 		|  |  |  |  |  |  |  |  |  |  |

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

	

