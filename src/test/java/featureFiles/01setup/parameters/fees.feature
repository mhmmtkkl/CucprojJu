Feature: Creating Nationalities
  @SmokeTest
  Scenario Outline: Nationalities creation

    Given Enter the user name and password
    And Click on setup
    And Click on parameters
    And Click on fees
    And Click on add button
    And Enter the name "<Name>"
    And Enter the code "<code>"
    And Enter the Integration Code "<Integration_Code>"
    And Enter the priority "<priority>"
    And Click on save button frame
    Then Verify data is created name is "<Name>"
    And Remove the "<Name>" from the cities table
    Then Verify "<Name>" is removed

    Examples:
      |Name|code|Integration_Code|priority|
      |Testers12 | Qa  |123      |2213    |

