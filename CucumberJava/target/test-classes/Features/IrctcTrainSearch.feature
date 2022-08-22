Feature: Searching the Train

  Scenario Outline: User can see the Available Trains List
    Given browser is open
    And user is on train search page
    When user clicks on OK Btn
    And user enters <From> and <To>
    When user enters journey date
    And user selects the journey class
    Then user clicks on the search Button

    Examples: 
      | From        | To            |
      | RAJAHMUNDRY | NELLORE - NLR |
