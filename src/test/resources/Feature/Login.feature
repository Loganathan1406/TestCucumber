Feature: To login facebook in valid email and password

  Background: 
    Given User have enter in facebook in Chorome Browserchrome browser

  Scenario: 
     to validate login with valid email and password

    When User have to enter valid email and password
    Then have to show credentials page

  Scenario: 
     To forget password in facebook

    When user haveto click in forget password text
    Then user have to show credentials page
