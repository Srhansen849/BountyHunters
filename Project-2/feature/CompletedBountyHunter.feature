 Scenario Outline: Completed Bounty Hunter 
		 	Given a bounty hunter inputs their user name "<username>"
		 	And a bounty hunter inputs their password "<password>"
		 	When a bounty hunter is in the file profile
		 	And a bounty hunter can view the name "<name>"
		 	And a bounty hunter can view the description "<description"
		 	And a bounty hunter can view the amount "<amount>"
		 	And a bounty hunter can view the height "<height>"
		 	And a bounty hunter can view the weight "<weight"
		 	And a bounty hunter can view the organization "<org>"
		 	And a bounty hunter can view the associates "<associates>"
		 	And a bounty hunter can view the time limit "<limit>"
		 	And a bounty hunter can view the image
		 	Then  a bounty hunter can view the completed list. 
		 	
		 	Examples: 
		 		| username  | password  | name | description | amount | height | weight | org | associates | limit |
		 		|  |  |  |  |  |  |  |  |  |  | 
		 		|  |  |  |  |  |  |  |  |  |  |
