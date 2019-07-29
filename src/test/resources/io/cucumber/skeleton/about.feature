@AboutTest
Feature: Validate about feature

  Scenario: Check title and detail about iovio
    When I press about button in login page
    Then It should show title in about page
    And It should show detail in about page
