Feature: Creating subject categories
  @SmokeTest
  Scenario Outline: subject categories creation

    Given Enter the user name and password
    And Click on setup
    And Click on parameters
    And Click on Subject Categories
    And Click on add button
    And Enter the name "<Name>"
    And Enter the code "<ShortName>"
    And Click on save button frame
    Then Verify data is created name is "<Name>"
    And Remove the "<Name>" from the cities table
    Then Verify "<Name>" is removed

    Examples:
      |Name|ShortName|
      |Testers12 | qa123123  |

