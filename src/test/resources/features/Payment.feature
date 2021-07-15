#Author: maheswar-reddy.kamasani@capgemini.com
    
Feature: Payment

Scenario : Able to view subscription plans
    Given user is on the homepage of unacademy
    When user clicks on Get subscription
    Then user is in the Get subscription part of unacademy
    Then user can see different types of subscription plans
    And user can see benefits of the ICONIC subscription
    When user clicks on desired option as "<Option>"
    Then user can see respective subscription plans
    When user selects a required paln as "<plan>"
    Then user can see selected subscription plan
    When user clicks on Proceed to pay
    Then user can see payment method page 
    
    
    
    

    