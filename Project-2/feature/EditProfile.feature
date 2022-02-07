 Scenario: Editing Profile
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