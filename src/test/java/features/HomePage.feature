@HomePage
Feature: HomePage

Scenario: Open Dell webpage
    Given Browser is opened
    When "https://www.dell.com/en-nz" is entered on the browser
    Then Dell NZ homepage is shown


Scenario: View All Laptops
    Given Browser is opened
    When "https://www.dell.com/en-nz" is entered on the browser
    And User navigates to view all laptops
    Then All laptops are shown

#  Scenario Outline: Successful Registration - New user and valid password
#    Given I am on the Registration page
#    When I input "<username>" & "<firstname>" & "<lastname>" & "<password>" & "<confirm>"
#    And I click on Register button
#    Then A success message should be displayed
#    #NOTE - update username prior to running to ensure uniqueness
#    Examples:
#      |username|firstname|lastname|password|confirm|
#      |test2602001|test|2602001|P@ssword|P@ssword|
#      |test2602007|test|2602007|P@ssword9|P@ssword9|

