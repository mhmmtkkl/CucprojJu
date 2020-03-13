Feature: Add to card

  Scenario Outline: Adding to card


    And search for "<Item>"
    And Click on any item
    And Choose or enter all the required fields
    And Click on add to card
    Then Verify item is in the card

    Examples:
      |Item|
      |Teddy bear |
      |Phone Case|
      |Car accessories |
      |Teddy bear |
      |Phone Case|
      |Car accessories |
