Feature: US01_System should allow any user to register with valid credentials

  Background:
    Given User opens GMI Bank Main page
    Given User Clicks on login Button
    And User Clicks on Registration Button

#  @SSNTest
  @US_01-TC_01_SSN_Box_Testing02
  Scenario: US_01-TC_01-registration_SSN_Box
    When User enters valid SSN in the SSN Box and clicks next box
    |   valid SSN       |
    |   123412347      |
    |   324523556      |
    |   721112576      |
    And User verifies SSN is accepted
    When User enters invalid SSN in the SSN Box and clicks next box
    |   Invalid SSN   |
    |   12345678      |
    |   000344556     |
    |   123001234     |
    |   123120000     |
    |   912121234     |
    And User verifies invalid SSN message is displayed

