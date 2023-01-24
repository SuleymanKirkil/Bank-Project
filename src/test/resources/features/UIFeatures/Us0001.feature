@US_01_registration
Feature: US01_System should allow any user to register with valid credentials

    Background:
      Given User opens GMI Bank Main page
      Given User Clicks on login Button
      And User Clicks on Registration Button

#  @goUrl
  @US_01-TC_01_SSN_Box_Testing
  Scenario: US_01-TC_01-registration_SSN_Box
    Given User clicks "SSN Box" and clicks next box
    And User verifies "Please enter your social security number." message is displayed

