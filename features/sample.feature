Feature: Login functionality check for Face Book

  Scenario: Login with Invalid Credentials
    Given Open chrome broswer and start facebook application
    When I enter username as "ravirs271"
    And I enter password as "12345"
    Then Login should fail

  @oneOfMyScenarios
  Scenario: Login with Invalid Credentials
    Given Open chrome broswer and start facebook application
    When I enter username as "abc"
    And I enter password as "111"
    Then Login should fail
