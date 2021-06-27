Feature: Register new user

  As a web user
  I want to register in advantage shopping
  To be able to buy a product

  Scenario: Register successful
    Given That a web user wants to register in advantage shopping online
    When He fills all the requested fields
    Then He should see him username in the homepage