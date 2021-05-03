@Cucumber
Feature: Buys test flow
  
  This feature is about realice Buys test flow in the website Your logo

  Background: Catalina enter my store
    Given Catalina enter my store website
    When Catalina enter the option sign in
    And Catalina enter the username and password
    Then Catalina successfully login

  Scenario: Search Dress and view detail
    When Catalina search for the dress
    Then Catalina see view detail for dress

  Scenario: Buys flow test
    Given Catalina search for the dress
    When Catalina see view detail for dress
    And Catalina select  cuantity, size, color and comment order
    Then Catalina accepts the terms and conditions and selects the payment method and confirms the order
