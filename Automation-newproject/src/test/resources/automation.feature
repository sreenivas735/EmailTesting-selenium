@all
Feature: Verify the functionality of the automation page

  @automation-textbox
  Scenario: verify the automation page
    Given enter username "Vasudev"
    When  enter email "vasusurepalli735@gmail.com"
    And  enter phone number "8978095451"
    Then enter address "Vembuluru, Dakkili, Thirupathi, Andrapradesh-524134"
    And take screenshot "screen.jpg"

  @automation-checkboxes
  Scenario Outline: verify the automation page
    Given click the Gender radiobutton "<gender>"
    And click the days checkbox "<day>"
    Then click the days checkbox "<day2>"
    And take screenshot "<screen>"
    Examples:
      | gender | day    | day2     | screen |
      | male   | sunday | saturday | sc1    |
      | male   | friday | tuesday  | sc2    |
      | female | monday | saturday | sc3    |
      | female | sunday | monday   | sc4    |

  @automation-colour-country
  Scenario Outline: verify the automation page
    Given click the country dropdown
    And  Select the country "<country>"
    Then select the colour "<colour>"
    And select the colour "<colour1>"
    And take screenshot "<screen>"
    Examples:
      | country | colour | colour1 | screen         |
      | Germany | Blue   | Green   | colour-contry  |
      | Japan   | Green  | Red     | colour-contry1 |

  @automation-links
  Scenario Outline: verify the automation page
    Given click the opencart link
    And verify user able to see the page "<opencart>"
    Then click on open hrm page link
    And verify user able to see the login page of hrm "<HRMpage>"
    Examples:
      | opencart   | HRMpage |
      | Components | Login   |
      | Desktops   | Login   |


