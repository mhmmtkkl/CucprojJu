Feature: Creating Citizenship
  @SmokeTest
  Scenario Outline: Citizenship creation

    Given navigate to website
    And Click on setup , parameters and "Citizenships"
    And Click on add button
    And  Creation two inputs are  "<CitizenshipName>" , "<ShortName>"
    And Click on save button frame
    Then Verify data is created name is "<CitizenshipName>"
    And Remove the "<CitizenshipName>" from the cities table
    Then Verify "<CitizenshipName>" is removed

Examples:
  |CitizenshipName|ShortName|
  |Testers12 | Qa  |

