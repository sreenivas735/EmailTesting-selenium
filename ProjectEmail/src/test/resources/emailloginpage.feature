@loin-functionality
Feature: Verify the login functionality of a email

  @login-validcreds
  Scenario: verify the login functionality with valid creds
    Given enter valid username "Vasusurepalli735@gmail.com"
    And enter valid password "Sreenivas@735"
    When click the login button
    And verify the user interface is visible
    Then takescreenshot
#
  @login-invalidates
  Scenario: verify the login functionality with invalid creds
    Given enter valid username "Vasusurepalli735@gmail.com"
    And enter valid password "Sreenivas12354@123"
    When click the login button
    And verify the user is getting error msg "Incorrect username or password."
    Then takescreenshot name is "error.jpg"


#  @login-valid-user-invalid-pass
#  Scenario: verify the login functionality with valid user and invalid password
#    Given enter valid username
#    When click the login button
#    And verify the user is getting error msg
#
#  @login-invalid-user-valid-pass
#  Scenario: verify the login functionality with invalid user and valid password
#    Given enter invalid username and valid password
#    When click the login button
#    And verify the user is getting error msg
#
#  @empty-user-empty-pass
#  Scenario: verify the login functionality with empty user and empty password
#    Given enter empty username  and empty password
#    When click the login button
#    And verify the user is getting error msg
#
#  @user-emptypass
#  Scenario: verify the login functionality with user and empty password
#    Given enter username and empty password
#    When click the login button
#    And verify the user is getting error msg
#
#  @emptyuser-pass
#  Scenario: verify the login functionality with empty user and password
#    Given enter empty username and password
#    When click the login button
#    And verify the user is getting error msg