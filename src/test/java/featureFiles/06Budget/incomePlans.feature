Feature: Creating income Plans
  @SmokeTest
  Scenario Outline: Income plans creation

    Given Enter the user name and password
    And Click on Budget
    And Click on Setup
    And Click on income plans
    And Click on add button
    And Enter the name in full page "<Name>"
    And Select all the required dropdown
    And Click on add button
    And Select all the required in the frame in add form
    And Enter the "<Fee Amount>" in the fee Amount
    And Enter the "<Student count>" in the student count
    And Click on apply button
    And Click on save button frame
    And Click on Budget
    And Click on Setup
    And Click on income plans
    Then Verify data is created name is "<Name>"
    And Remove the "<Name>" from the cities table
    Then Verify "<Name>" is removed

    Examples:
      |Name|Fee Amount|Student count|
      |Testers12 | 1232131       |   1  |
      |Testers13 | 12322       |   323  |
      |Testers14 | 121       |   1   |


