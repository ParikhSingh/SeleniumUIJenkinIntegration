Feature: Login

  Scenario Outline: Valid Login

    Given User launches application
    When User login with "<id>" and "<password>" credentials
    Then Verify user login successfully

    Examples:
      | id                       | password   |
      | parikhsingh11@gmail.com  | Bpes@13579 |
      | parikhsingh77@gmail.com  | Bpes@13579 |
