Feature: Create a City

  Scenario Outline:  City Creating

    Given navigate to website
    And Click on setup , parameters and "Cities"
    And Click on add button
    And Type in the Name "<CityName>"
    And Choose any value from the dropdown
    When Click on save button
    Then Verify data is created name is "<CityName>"
    And Remove the data "<CityName>"
    Then Verify data is removed "<CityName>"

    Examples:
      | CityName  |
      |   city4   |
      |   city5   |
