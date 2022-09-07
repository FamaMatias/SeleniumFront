Feature: Enter position
  As Qa Automation
  I want to enter a charge
  To update the profile

  Background: Login Correct
    Given that Elvis is in the portal
    When he complete the information for the login
      | User                    | Password            |
      | famamatias.qa@gmail.com | Mati123456          |


    Scenario: Registrer a new charge
      When Add a new job
      Then I should see in the profile