Feature: Cierra Admin Login
Background: User launches Chrome browser
Scenario Outline: User login with valid credentials
  Given user is in home page
  When user enters "<email>" in textbox
  And user enters "<password>" in password textbox
  And user clicks on "<button>"
  Then user is navigated to "<Page>" page
  Examples:
  | email                |   password    | button   |  Page  |
  |mngr603181            | unYmApu       | Login    | Home   |

