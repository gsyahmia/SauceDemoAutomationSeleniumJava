
@regression
Feature: Login and add to cart item 1
  
  Scenario: Login and add to cart "Sauce Labs Backpack" then verify cart page
    Given User navigate to saucelab login page
    When User successfully login with correct username "standard_user" and password "secret_sauce"
    Then User landing in the main page
    When User add "Sauce Labs Backpack" item to cart
    Then User could verify the item "Sauce Labs Backpack" is displayed in the cart page

  Scenario: Login and add to cart "Sauce Labs Fleece Jacket" then verify cart page
    Given User navigate to saucelab login page
    When User successfully login with correct username "standard_user" and password "secret_sauce"
    Then User landing in the main page
    When User add "Sauce Labs Fleece Jacket" item to cart
    Then User could verify the item "Sauce Labs Fleece Jacket" is displayed in the cart page 
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
