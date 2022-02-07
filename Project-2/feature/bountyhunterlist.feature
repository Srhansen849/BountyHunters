  Scenario: Bounty Hunter Info
    Given A Business Owner has successfully logged in
    When the username has been entered "<username>"
    And and the password been verified "<password>"
    Then they can click a tab to view list of top ranked bounty hunters

   Examples: 
      | username  | password | status  |
      | name1 		|     5 	 | success |
      | name2 		|     7 	 | Fail    |
  
  
  
  
  

