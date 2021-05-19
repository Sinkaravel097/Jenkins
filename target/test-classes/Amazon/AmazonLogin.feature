@Feature2 @Feature1
Feature: To validate Amazon login functionality

	@Regression
  Scenario: To verify with invalid credential of amazon login
    Given User to launch the browser and hit amazon url
    When User has to enter the invalid email or phone number
    And User has to click the continue btn
    And User has to enter the invalid password inn password field
    And User has to click the sign btn
    Then User has to close the entire browser

	@Sanity
  Scenario: To verify with valid credential of amazon login
    Given User to launch the browser and hit amazon url
    When User has to enter the valid email or phone number
    And User to click the continue btn
    And User has to enter the valid password inn password field
    And User to click the sign btn
    Then User to close the browser

    