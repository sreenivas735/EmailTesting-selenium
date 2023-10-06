@allScenarios
Feature: verify the functionality of the Swaglabs loginpage

  @swag-valid-creds
  Scenario: verify the Swaglabs loginpage with valid creds
    Given enter user "standard_user"
    When  enter password "secret_sauce"
    And click on login button
    Then verify the user able to see the login page
    And take screenshot "swaglabs.jpg"


  @swag-no-creds
  Scenario Outline: verify the Swaglabs loginpage with without creds
    Given enter user "<username>"
    When  enter password "<password>"
    And click on login button
    Then verify user getting error message "<errormsg>"
    And take screenshot "<screenshotfile>"

    Examples:
      | username      | password     | errormsg                                                                  | screenshotfile                   |
      |               |              | Epic sadface: Username is required                                        | swaglabserrorwithnocreds.jpg     |
      |               | secret_sauce | Epic sadface: Username is required                                        | swaglabserrorwithnouser.jpg      |
      | standard_user |              | Epic sadface: Password is required                                        | swaglabserrorwithnopass.jpg      |
      | standard      | secret       | Epic sadface: Username and password do not match any user in this service | swaglabserror.jpg                |
      | standard_user | standerd     | Epic sadface: Username and password do not match any user in this service | swaglabserrorwithinvalidpass.jpg |
      | standard      | secret_sauce | Epic sadface: Username and password do not match any user in this service | swaglabserrorwithinvaliduser.jpg |
