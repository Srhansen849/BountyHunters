Feature: A Bounty Hunter logs out of the Star Hunters website
  As a Bounty Hunter, I wish to log out of the Star Hunters website


  Background: A Bounty Hunter is logged in on the Star Hunter Page
        Given the Bounty Hunter is on the login page
        When the Bounty Hunter selects the Bounty Hunter Login
        And the Bounty Hunter inputs "username" into the username field
        And the Bounty Hunter inputs "password" into the password field
        And the Bounty Hunter clicks login
        Then the Bounty Hunter is directed to the home page
        
        
  Scenario: Bounty Hunter logs out
    When the user selects the logout button
    Then the users session is invalidated
    And the user redirected to the Home page