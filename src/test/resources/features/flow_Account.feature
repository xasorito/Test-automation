@Cucumber
Feature: Account test flow
  
  This feature is about realice account test flow in the website Your logo

  Background: Catalina enter my store
    Given Catalina enter my store website

  Scenario: Create Account
    When Catalina enter the option sign in
    And Catalina click the button for create account
    Then Catalina should be able to enter data in the form and see account created

  Scenario: Enter an invalid email and see the error message
    When Catalina enters the option sign in and enters an invalid email
    Then Catalina should be able to see an error message

  Scenario: Password Recovery
    When Catalina select the button forgot your password
    Then Catalina could see the message that the password is reset

  Scenario: Login
    When Catalina enter the option sign in
    And Catalina enter the username and password
    Then Catalina successfully login
