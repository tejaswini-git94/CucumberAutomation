@ClassicRegressionSuite
Feature: FlipKart - Search functionality
@searchtest
  Scenario: SearchTest1
    Given user is on the home page
    When user search for "Mobiles"
    Then search results are displayed
 	When user click on the first product
    Then product details page is displayed
    When user click on BuyNow Button

@searchtest
  Scenario: SearchTest2
    Given user is on the home page
    When user search for "laptops"
    Then search results are displayed
 	When user click on the first product
    Then product details page is displayed
    When user click on BuyNow Button
    
#    Then the item is displayed in the cart page

@searchtest1
 Scenario Outline: SearchTest3
    Given user is on the home page
    When user search for "<product>"
    Then search results are displayed
 	When user click on the first product
    Then product details page is displayed
    When user click on BuyNow Button
    Examples:
    |product|
    |tv|
    |refrigerator|