@Feature1
Feature: To validate fb login functionality

  Background: 
    Given User has to launch the browser and hit the url

  @Smoke
  Scenario: To validate login with invalid username and invalid password
    When User has to enter the invalid email in email fields
      | username1        | username2           | username3          |
      | java@gmail.com   | selenium@gmail.com  | devops@gmail.com   |
      | j456va@gmail.com | seghjnium@gmail.com | delkjhps@gmail.com |
      | j987a@gmail.com  | syc56nium@gmail.com | de672ps@gmail.com  |
    And User has to enter the invalid password in password fields
      | password1 | password2  | password3 |
      | ja4562    | sele977667 | 345674567 |
      | j562      |       7667 |    345674 |
      | j62       | se667      |      3457 |
    And User has to click the login button
    And User has to logged in the home page or not
    Then User has to close the browser

	@Sanity
  Scenario: To validate login with valid username and valid password
    When user has to enter the valid email in email field
    And User has to enter the valid password in password field
    And User to click login btn
    Then User to close the entire browser
