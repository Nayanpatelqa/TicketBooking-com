Feature: E2E Flight Booking Functionality

  Scenario Outline: User should be able to book a Flight
    Given I am on Home Page
    When I Click on Cookies Accept & Close
    And I click on Flights from header "<Menu>"
    Then I Navigate to Flights Page successfully
    And I click on one way Trip Radio button
    # 2)Test the availability of flight tickets with some filters
    And I select Economy class
    #1)Test if the flights are available from any two destinations
    And I Select on Destination from where
    And I enter "<LocationFrom>"
    And I select on Destination To "<LocationTo>"
    # 2)Test the availability of flight tickets with some filters
    And I select Date
    And I click on Search Button
    And I select Direct only radio checkbox
    And I click on See Flight button
    And I Click on select button
    And I click on Next button
    And I click on Next button in extras Page
    #3)Test if flight seat number is a window seat or an aisle seat (in this site this feature "window seat or an aisle seat" is not present so I verify seat no.)
    And I select a seat from
    And I Verify seat No
    And I Click on Next button in Seat Page
    And I am on Who's flying Page
    #Other Scenario:
    And I enter Contact "<email>"
    And I enter Contact phone number "<Phone number>"
    And I enter  First Name"<First names>"
    And I enter  Last Name "<Last names>"
    And I select "<Gender>"
    And I click on Next button in pax Page
    Then I navigate to Check and pay Page
    # I failed this test case by intensely
    And  I enter card details "<Card number>"

    Examples:
      | Menu    |  | LocationFrom |  | LocationTo |  | email        |  | Phone number |  | First names |  | Last names |  | Gender |  | Card number |
      | flights |  | LHR          |  | BOM        |  | Qa@gmail.com |  | 7111100123   |  | QA          |  | Test       |  | Male   |  |             |


