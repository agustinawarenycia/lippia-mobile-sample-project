Feature: As a user i want to interact with the mobile application

  Scenario Outline: The user starts the application, log in to the app, then proceed to log out
    Given The app is loaded correctly
    When The user logs in the application with: <email>, <password>
    #Then The user log out of the app
    Then Home page is correct


    When the user go to menu
    And change to dark mode
    Then confirm dark mode is enabled

    When the user track his work <hour> and minutes <minutes>, select project and confirm
    Then confirm new entry is added correctly

    @Demo
    Examples:
      | email                        | password | hour | minutes |
      | agustina.warenycia@gmail.com | 123456   | 02    | 22      |


