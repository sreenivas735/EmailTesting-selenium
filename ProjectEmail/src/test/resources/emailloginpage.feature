@loin-functionality
Feature: Verify the login functionality of a email

  @login-validcreds
  Scenario: verify the login functionality with valid creds
    Given enter username "Vasusurepalli735@gmail.com"
    And enter password "Sreenivas@735"
    When click the login button
    And verify the user interface is visible
    Then takescreenshot name is "valid.jpg"
#
  @login-invalidates
  Scenario: verify the login functionality with invalid creds
    Given enter username "Vasusurepa1235@gmail.com"
    And enter password "Sreenivas12354@123"
    When click the login button
    And verify the user is getting error msg "Incorrect username or password."
    Then takescreenshot name is "error.jpg"


  @login-valid-user-invalid-pass
  Scenario: verify the login functionality with valid user and invalid password
    Given enter username "vasusurepalli735@gmail.com"
    And enter password "Sreenivas7635425"
    When click the login button
    And verify the user is getting error msg "Incorrect username or password."
    Then takescreenshot name is "errorusinginvalidcreds.jpg"
#
  @login-invalid-user-valid-pass
  Scenario: verify the login functionality with invalid user and valid password
    Given enter username "vasusurepalli3253@123"
    And enter password "Sreenivas@735"
    When click the login button
    And verify the user is getting error msg "Incorrect username or password."
    Then takescreenshot name is "errorwithvalidpassandinvaliduser.jpg"


  @empty-user-empty-pass
  Scenario: verify the login functionality with empty user and empty password
    Given enter username ""
    And enter password ""
    When click the login button
    And verify the user is getting error msg "Incorrect username or password."
    Then takescreenshot name is "emptyuserandemptypass.jpg"
#
  @user-emptypass
  Scenario: verify the login functionality with user and empty password
    Given enter username "vasusurepalli735@gmail.com"
    And enter password ""
    When click the login button
    And verify the user is getting error msg "Incorrect username or password."
    Then takescreenshot name is "userwithemptypass.jpg"
  @emptyuser-pass
  Scenario: verify the login functionality with empty user and password
    Given enter username ""
    And enter password "Sreenivas@735"
    When click the login button
    And verify the user is getting error msg "Incorrect username or password."
    Then takescreenshot name is "emptyuserwithpass.jpg"