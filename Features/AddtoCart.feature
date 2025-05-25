@regression
Feature: Login and add to cart items

  Scenario: Login and add to cart "Sauce Labs Backpack" then verify cart page
    Given User navigate to saucelab login page
    When User successfully login with correct username and password
    Then User landing in the main page
    When User add "Sauce Labs Backpack" item to cart
    Then User could verify the item "Sauce Labs Backpack" is displayed in the cart page

  Scenario: Login and add to cart "Sauce Labs Fleece Jacket" then verify cart page
    Given User navigate to saucelab login page
    When User successfully login with correct username and password
    Then User landing in the main page
    When User add "Sauce Labs Fleece Jacket" item to cart
    Then User could verify the item "Sauce Labs Fleece Jacket" is displayed in the cart page

  Scenario: Login and navigate to About menu
    Given User navigate to saucelab login page
    When User successfully login with correct username and password
    Then User landing in the main page
    When User navigate to about menu side bar
    Then User verify the about page is displayed 

Scenario Outline: Login and add to cart with dynamic data
	  Given User navigate to saucelab login page
    When User successfully login with correct username and password
    Then User landing in the main page
    When User add <item_name> item data to cart
    Then User could verify the item data <item_name> is displayed in the cart page
    Examples: 
      | item_name  							| 		
      | Sauce Labs Backpack 		| 
      | Sauce Labs Fleece Jacket | 
