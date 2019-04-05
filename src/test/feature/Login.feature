Feature: Login

  Background:
    Given User is on Home Page
    And User enter username "mngr188229"
    And User enter password "pAqUsap"
    And User click button Login

  Scenario: Login Successfull
    Given User enter click New Customer
    And User enter customer name "Banking01"
    And User enter date of birth "15/05/2000"
    And User enter address "Thao Dien, Quan 2"
    And User enter city "Ho Chi Minh"
    And User enter state "Single"
    And User enter pin "123456"
    And User enter mobile number "0333211234"
    And User enter email "banking01@gmail.com"
    And User enter password "1234567"
#    And User click button Submit