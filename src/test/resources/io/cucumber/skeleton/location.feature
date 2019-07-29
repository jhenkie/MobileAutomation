@LocationTest
Feature: Validate location feature

  Scenario: Check all location address of iovio
    When I press location button in login page
    Then It should show netherland address in location page
    And It should show USA address in location page
    And It should show romania address in location page
    And It should show mexico address in location page
