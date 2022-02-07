

  Scenario: Submit Finished Bounty
    Given a bounty hunter logs in with their username "<username>"
    And a bounty hunter logs in with their password "<password>"
    When a bounty hunter selects a bounty "<bountyId>"
    And a bounty hunter selects the status 
    And a bounty hunter inputs the description "<description>"
    Then a bounty hunter submits the finished bounty




    Examples: 
      | username  | password | bountyId  | description |
      |  |   |  | | |

