Feature: Testing loginpage functionality

  Scenario Outline: Verify loginpage with valid credentials
    Then open browser and launch url
    When login user "<name>" and passwd "<pass>"
    Examples:
      | name | pass   |
      | vasu | passwd |
      | sree |   |
      | dev  |   |