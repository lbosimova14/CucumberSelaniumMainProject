@calendar_events
Feature: All calendar events

  Scenario: Verify column names
    Given user is on the login page
    And user logs in as store manager
    Then user navigates to "Activities" then to "Calendar Events"
    And user verifies that column names are displayed
      | TITLE             |
      | CALENDAR          |
      | START             |
      | END               |
      | RECURRENT         |
      | RECURRENCE        |
      | INVITATION STATUS |

  @homework_4_1
  Scenario: Verify that view, edit and delete calendar options are displayed
    Given user is on the login page
    And user logs in as store manager
    Then user navigates to "Activities" then to "Calendar Events"
    And user verifies that following options are displayed for "Testers meeting" calendar event
      | Delete |
      | Edit   |
      | View   |

  @homework_4_2
  Scenario: Verify that "Title" column still displayed
    Given user is on the login page
    And user logs in as store manager
    Then user navigates to "Activities" then to "Calendar Events"
    And user "deselects" following grid options
      | CALENDAR          |
      | START             |
      | END               |
      | RECURRENT         |
      | RECURRENCE        |
      | INVITATION STATUS |
    Then user verifies that column names are displayed
      | TITLE |

  @homework_4_3
  Scenario: Verify save and close drop-down
    Given user is on the login page
    And user logs in as store manager
    Then user navigates to "Activities" then to "Calendar Events"
    And user clicks on "Create Calendar Event" button
    Then user should see following save and close options
      | Save And Close |
      | Save And New   |
      | Save           |

  @homework_4_4
  Scenario: Verify that cancel button redirects user to "All Calendar Events" page
    Given user is on the login page
    And user logs in as store manager
    Then user navigates to "Activities" then to "Calendar Events"
    And user clicks on "Create Calendar Event" button
    And user clicks on "Cancel" button
    Then user verifies that "All Calendar Events" page subtitle is displayed

  @homework_4_5
  Scenario: Verify that difference between start and end time is exactly 1 hour
    Given user is on the login page
    And user logs in as store manager
    Then user navigates to "Activities" then to "Calendar Events"
    And user clicks on "Create Calendar Event" button
    Then user verifies that end time is 1 hour after start time

  @homework_4_6
  Scenario: Verify that difference between start and end time is exactly 1 hour
    Given user is on the login page
    And user logs in as store manager
    Then user navigates to "Activities" then to "Calendar Events"
    And user clicks on "Create Calendar Event" button
    Then user sets starts time to "9:00 PM"
    And user verifies that end time is "10:00 PM"

  @homework_4_7
  Scenario: Verify that start and time input boxes become invisible after selecting all day event
    Given user is on the login page
    And user logs in as store manager
    Then user navigates to "Activities" then to "Calendar Events"
    And user clicks on "Create Calendar Event" button
    Then user "selects" "All-Day Event" option
    And user "selects" "All-Day Event" option
    Then user verifies that "All-Day Event" option is selected
    And user verifies that end time is not visible
    Then user verifies that start date is visible
    And user verifies that end date is visible

  @homework_4_8
  Scenario: Verify that repeats options are available
    Given user is on the login page
    And user logs in as store manager
    Then user navigates to "Activities" then to "Calendar Events"
    And user clicks on "Create Calendar Event" button
    When user "selects" "Repeat" option
    Then user verifies that "Repeat" option is selected
    Then user verifies that following options for repeats drop-down are available
      | Daily   |
      | Weekly  |
      | Monthly |
      | Yearly  |

  @homework_4_9
  Scenario: Verify that start and time input boxes become invisible after selecting all day event
    Given user is on the login page
    And user logs in as store manager
    Then user navigates to "Activities" then to "Calendar Events"
    And user clicks on "Create Calendar Event" button
    When user "selects" "Repeat" option
    Then user verifies that "Repeat" option is selected
    And user verifies that "Repeat Every" option is selected
    And user verifies that "Never" option is selected
    And user verifies summary text is exactly "Daily every 1 day"

  @homework_4_10
  Scenario: Verify that following message as a summary is displayed: "Daily every 1 day, end after 10 occurrences"
    Given user is on the login page
    And user logs in as store manager
    Then user navigates to "Activities" then to "Calendar Events"
    And user clicks on "Create Calendar Event" button
    When user "selects" "Repeat" option
    Then user verifies that "Repeat" option is selected
    When user "selects" "After" option
    And enters "10" occurrences
    Then user verifies summary text is exactly "Daily every 1 day, end after 10 occurrences"
