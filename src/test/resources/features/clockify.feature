Feature: As a user i want to interact with the mobile application

  Scenario Outline: The user starts the application, log in to the app, then proceed to log out
    Given The app is loaded correctly
    When The user logs in the application with: <email>, <password>
    Then Home page is correct


    When the user go to menu
    And change to dark mode
    Then confirm dark mode is enabled

    When the user track his work hour and minutes, select project and confirm
    And confirm new entry is added correctly


    Then The user log out of the app
    @Demo
    Examples:
      | email                        | password |
      | agustina.warenycia@gmail.com | 123456   |


