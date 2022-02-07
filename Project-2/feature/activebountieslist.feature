  Scenario: List of Active Bounties
    Given a Bounty Hunter has successfully logged in
    When the username has been entered "<username>"
    And and the password been verified "<password>"
    Then then they can click a tab to check List of Active Bounties


  Examples: 
     | username | password | status  |
     | name1 		|     5 	 | success |
     | name2 		|     7 	 | Fail    |