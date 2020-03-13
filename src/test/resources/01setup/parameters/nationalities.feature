Feature: Creating Nationalities
@Regression
  Scenario Outline: Nationalities creation

    Given Enter the user name and password
    And Click on setup
    And Click on parameters
    And Click on Nationalities
    And Click on add button
    And Enter the name "<Name>"
    And Click on save button frame
    Then Verify data is created name is "<Name>"
    And Remove the "<Name>" from the cities table
    Then Verify "<Name>" is removed

    Examples:
      |Name|ShortName|
      |Testers12 | Qa  |

