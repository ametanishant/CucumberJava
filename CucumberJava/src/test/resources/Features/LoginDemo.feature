Feature: faeture to test login functionality

  @smoketest
  Scenario Outline: Check login is succesfull with valid credentials
    Given browser is open -T1
    And user is on login page -T1
    When user enters a <username> and <password> -T1
    And user hit enter -T1
    Then user is navigated to home page -T1

    Examples: 
      | username | password |
      | Ram     |     12345 |
      | Ele     |     12345 |
