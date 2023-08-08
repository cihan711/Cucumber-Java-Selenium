Feature: Running keyPress tests

Background:
  Given user is on keyPress page

  Scenario: Action keyPress tests
    When user gets the main title of the keyPress page
    Then keyPress page main title should be "Key Presses"
    Then user check keyPress page is working

