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
      |Title                  | Employment type |CompanyName |Location         | Month | Year |Industry                      | Description               |
      |QA Automation Engineer | Full-time       |SpeedUpTech |Quindío, Colombia| May   | 2022 |IT Services and IT Consulting | Automatizacion de pruebas |

      Then I should see in the profile