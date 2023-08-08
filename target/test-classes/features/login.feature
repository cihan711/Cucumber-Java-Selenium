Feature: Running Login Page
  Background:
    Given user is on login page
    When user gets the main title of the Login page
    Then loginPage main title should be "Login Page"


  @smoke
  Scenario: Action Login Page positive
  When user log into correct "tomsmith" username and "SuperSecretPassword!" password
  And user verify to click login button
    Then user should see Secure Area page
    When user verify to click logout button
    Then user should see Login page

  @negative
  Scenario Outline: Action Login Page negative
    When user log into incorrect <username>  and correct "SuperSecretPassword!" password
    And user verify to click login button
    Then user should see Error message
    When user log into correct "tomsmith" username and incorrect <password>
    And user verify to click login button
    Then user should see Error message
    Examples:
      | username | password |
      | mert     | 121      |
      | selim    | 1234     |
