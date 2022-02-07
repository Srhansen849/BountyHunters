
  Scenario: Approve/DenyFinishedBounty
    Given a manager has logged in with the correct username "<username>"
    And they have input the correct password "<password>"
    When the manager has selected the finished bounty
    And the manager can alter the amount "<amount>"
    And the manager can select to approve or deny the finished bounty
    Then the manager submits the result for the finished bounty
    


    Examples: 
      | username  | password | amount  |
      |  |      |  |


