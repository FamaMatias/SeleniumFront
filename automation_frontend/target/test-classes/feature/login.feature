Feature: login
  As user
  I want to login in my page
  To look for a job

  Scenario: Login Correct
    Given that Elvis is in the portal
    When he complete the information for the login
    | User            | Password   |
    | elvis@gmail.com | 9876543    |
    Then the user can see the name

