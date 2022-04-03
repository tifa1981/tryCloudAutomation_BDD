@wip_Tariq
Feature: As a user, I should be able to access to Files module.

  Background: user is on file page
    Given user on the dashboard page
    When the user clicks the "Files" module

  Scenario: verify users can access to Files module
    Then verify the page is "Files - Trycloud QA"

  Scenario: verify users can select all the uploaded files from the page
    And user click the top-left checkbox of the table
    Then verify all the files are selected