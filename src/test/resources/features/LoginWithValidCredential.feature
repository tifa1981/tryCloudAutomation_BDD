Feature: User should be able to login using correct credentials

  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When user enters username "<username>" and passcode "<password>"
    And user clicks the login button
    Then user should be able to land on the dashboard page
    Examples:
      | username | password    |
      | user28   | Userpass123 |
      | user58   | Userpass123 |
      | user88   | Userpass123 |
      | user118  | Userpass123 |