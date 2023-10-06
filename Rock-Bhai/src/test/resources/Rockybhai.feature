@Rocky-all
Feature: Verify the functionality of the automation page

  @Rocky-textbox
  Scenario: verify the automation page
    Given enter username "Vasudev"
    When  enter email "vasusurepalli735@gmail.com"
    And  enter phone number "8978095451"
    Then enter address "Vembuluru, Dakkili, Thirupathi, Andrapradesh-524134"
    And take screenshot "screen"


  @Rocky-checkboxes
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

  @Rocky-colour-country
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

  @Rocky-link-opencart
  Scenario Outline: verify the automation page
    Given click the opencart link
    And verify user able to see the page "<opencart>"
    Then take screenshot "<screenshot>"
    Examples:
      | opencart   | screenshot |
      | Components | cart1      |
      | Desktops   | cart2      |

  @Rocky-link-HRM
  Scenario: verify the automation page
    Then click on open hrm page link
    And take screenshot "HRMpage"
#    And verify user able to see the login page of hrm "Login"

  @Rocky-browser
  Scenario: verify the automation page
    Given Enter the data into browser "selenium"
    And click the searchbutton
    Then verify the browser display the elements "sdwsdfnium"
    And take screenshot "screen"

  @Rocky-alerts
  Scenario: verify the automation page
    Given click the alert-one
    And click the alert accept
    And take screenshot "screen1"
    When click the alert-two-Confirmbox
    And click the alert accept
    And take screenshot "screen2"
    Then verify the msg "You pressed OK!"
    And click the alert-two-Confirmbox
    When click the alert dismiss
    And take screenshot "screen3"
    And verify the msg "You pressed Cancel!"
    Then cleck the alert-three Prompt
    And pass the sendkeys "sreenivas" and click the accept
    Then verify the msg "Hello sreenivas! How are you today?"
    And take screenshot "screen4"

  @Rocky-Actions
  Scenario: verify the automation page
    Given double click the copy button
    And take screenshot "copytext"
    When drag and drop the elements
    And take screenshot "draganddrop"
#    Then move the slider button to some length 1200 660
#    And take screenshot "slider"
#    Then resize the resizablebox 1400 800
#    And take screenshot "resize"


  @Rocky-frame
  Scenario Outline: verify the automation page
    Given enter the frame
    And enter the username "<name>"
    When select the gender "<gender>"
    Then select the date "<date>"
    And select the value from "<skill>" dropdowm
    Then back out of the frame
    And take screenshot "<screenshot>"

    Examples:
      | name     | gender | date       | skill               | screenshot |
      | vasudev  | Male   | 18/10/1998 | Automation Engineer | vasu       |
      | sathis   | Male   | 12/10/1997 | QA Engineer         | sathis     |
      | Sowjanya | Female | 05/08/1996 | Developer           | sowjanya   |
      | Divya    | Female | 24/11/1997 | Manager             | divya      |

  @Rocky-calender
  Scenario: verify the automation page
    Given click the calender
    And select the date "18" and "October" and "2020"
    When enter the frame
    And click the frame calender
    Then select the date "18" and "October" and "2024" from framecal
    And back out of the frame
    Then take screenshot "cal"





