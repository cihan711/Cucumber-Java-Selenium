Feature: Running Home Page


  Scenario: Action Home Page
    Given user is on home page
    When user gets the main title of the page
    Then page main title should be "Welcome to the-internet"