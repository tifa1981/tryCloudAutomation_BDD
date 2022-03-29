Feature: As a user, I should be able to update settings.



 @wip
  Scenario: Verify users are able to update settings
    Given user on the dashboard page
    When user clicks the Files module
    And user clicks Settings on the left bottom corner
    Then user should be able to click any buttons

  @wip
  Scenario: Verify users to see the app storage usage
    Given user on the dashboard page
    When user clicks the Files module
    And user checks the current storage usage
    And user uploads file with the upload file option
    And user refreshes the page
    Then user should be able to see storage usage is increased



