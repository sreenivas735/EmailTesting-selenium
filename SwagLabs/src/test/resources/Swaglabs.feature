@allScenarios
Feature: verify the functionality of the Swaglabs loginpage

  @swag-valid-creds
  Scenario: verify the Swaglabs loginpage with valid creds
    Given enter user "standard_user"
    When  enter password "secret_sauce"
    And click on login button
    Then verify the user able to see the login page
    And take screenshot "swaglabs.jpg"
@swag-invalid-creds
  Scenario: verify the Swaglabs loginpage with invalid creds
    Given enter user "standard"
    When  enter password "secret"
    And click on login button
    Then verify user getting error message "Epic sadface: Username and password do not match any user in this service"
    And take screenshot "swaglabserror.jpg"
@swag-no-creds
  Scenario: verify the Swaglabs loginpage with without creds
    Given enter user ""
    When  enter password ""
    And click on login button
    Then verify user getting error message "Epic sadface: Username is required"
    And take screenshot "swaglabserrorwithnocreds.jpg"
@swag-validuser-invalidpass
  Scenario: verify the Swaglabs loginpage with validuser and invalid pass
    Given enter user "standard_user"
    When  enter password "standerd"
    And click on login button
    Then verify user getting error message "Epic sadface: Username and password do not match any user in this service"
    And take screenshot "swaglabserrorwithinvalidpass.jpg"
  @swag-invaliduser-validpass
  Scenario: verify the Swaglabs loginpage with invaliduser and valid pass
    Given enter user "standard"
    When  enter password "secret_sauce"
    And click on login button
    Then verify user getting error message "Epic sadface: Username and password do not match any user in this service"
    And take screenshot "swaglabserrorwithinvaliduser.jpg"

  @swag-nulluser-validpass
  Scenario: verify the Swaglabs loginpage with invaliduser and valid pass
    Given enter user ""
    When  enter password "secret_sauce"
    And click on login button
    Then verify user getting error message "Epic sadface: Username is required"
    And take screenshot "swaglabserrorwithnouser.jpg"

  @swag-nulluser-validpass
  Scenario: verify the Swaglabs loginpage with invaliduser and valid pass
    Given enter user "standard_user"
    When  enter password ""
    And click on login button
    Then verify user getting error message "Epic sadface: Password is required"
    And take screenshot "swaglabserrorwithnopass.jpg"