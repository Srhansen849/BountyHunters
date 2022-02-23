Feature: Forgot My Password
  As a user, I wish to reset my password

  
  Scenario: User resets their password
    Given the user is on the forgot my password page
    And the user has an account with Star Hunters
    When a user inputs thier email 
    And a user submits the information
    Then a email will be sent to the user
    And a user will be redirected to the login page
