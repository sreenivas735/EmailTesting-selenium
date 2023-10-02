@alltests
Feature: Verify the instagram login page functionality


@Test-userChecking
  Scenario Outline: Verify the instagram login page functionality with valid creds
    Given Open the browser and click the url
    When Enter username "<user>"and password "<pass>"
    And Click the submit button
    Then Verify the homepage is visible to the user
    Examples:
      | user | pass     |
      | vasu | vasu@735 |
      | sree | sree@123 |

@test-userChecking-2
  Scenario Outline: Verify the instagram login page functionality with valid creds
    Given Open the browser and click the url
    When Enter username "<user>"and password "<pass>"
    And Click the submit button
    Then Verify the homepage is visible to the user
    Examples:
      | user | pass     |
      | vasu | sreenivas@735 |
      | sree | sree@123456 |
