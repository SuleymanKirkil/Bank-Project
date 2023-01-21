@UI
  Feature: US001 Kullanıcı GMI Bank uygulamasına giriş yapar

    Background:
      Given User opens GMI Bank Main page
      Given User Clicks on login Button

      Scenario: TC_00101 User logs in with correct credentials

        Given User clicks on sign in button
        And User clicks on username box
        And User types valid user name
        And User clicks on password box
        And User types correct password and clicks on sign in
        Then User validates account page is opened
        And User closes the browser
