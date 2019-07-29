@LoginTest
Feature: Validate login feature

  Scenario: Failed - Empty username
    When I press login button in login page
    Then It should show error empty username in login page

  Scenario: Failed - Empty password
    When I fill in username in login page
    And I press login button in login page
    Then It should show error empty password in login page

  Scenario: Failed - invalid credential
    When I fill in invalid username in login page
    And I fill in invalid password in login page
    And I press login button in login page
    Then It should show error login invalid in login page

  Scenario: Success login
    When I fill in username in login page
    And I fill in password in login page
    And I press login button in login page
    Then It should show welcome note in profile page