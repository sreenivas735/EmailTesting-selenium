Feature: verify the loginpage functionality

  @makemytrip
  Scenario Outline: verify the functionality from and to and calender selection
    Given Click on X-mark
    When select the bus
    And click the from option
    Then Enter the from "<fromcity>" and  enter the "<fromHint>" for selecting city
    And Enetr the to "<tocity>" and enter the "<toHint>" for seelecting city
    When enter the "<year>" and "<month>" and "<day>" for cal selection
    And click the search button
    Then verify the user able to see the page

    Examples:
      | year | month    | day | fromcity  | fromHint  | tocity      | toHint          |
      | 2023 | November | 20  | nellore   | Nellore   | venkatagiri | Venkatagirikota |
      | 2023 | December | 25  | bangalore | Bangalore | rapur       | Rapur           |

