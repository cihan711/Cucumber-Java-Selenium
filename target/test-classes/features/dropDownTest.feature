@Smoke
Feature: Running dropdown tests

Background:
  Given user is on dropdown page

  Scenario: Action dropdown tests
    When user gets the main title of the Dropdown page
    Then dropDownpage main title should be "Dropdown List"
    Then user check dropdown page is working

