Feature: Buy ticket

  As a web user
  I search Avianca Airlines
  To be able to buy a ticket

  @smokeTest
  Scenario: Buy Successful
    Given that a web user wants to access Avianca Airlines
    When i have filled in the necessary fields
    Then you should see the flight that has been selected
