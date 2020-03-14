Feature: Check amount

  Scenario Outline: Check the amount


    And search for "<Item>"
    And Click on seventy five to hundred amount
    Then Verify all the items are between seventy five to hundred amount


    Examples:
      |Item|
      |Teddy bear |
