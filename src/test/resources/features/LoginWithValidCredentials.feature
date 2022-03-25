Feature: Login functionality

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

    Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When user enters invalid username "<invalidUsername>" and passcode "<invalidPassword>"
    And user clicks the login button
    Then user should be able to see "<errorMessage>" is displayed
    Examples:
      | invalidUsername | invalidPassword | errorMessage                |
      | user28          | wrong           | Wrong username or password. |
      | wrong           | Userpass123     | Wrong username or password. |
      | wrong           | wrong           | Wrong username or password. |