Feature: faeture to test google search functionality

  @smoketest
  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And user hit enter
    Then user is navigated to search results
