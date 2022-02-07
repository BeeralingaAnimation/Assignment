Feature: LoginPage Validation

Sceaniro: login into page
Given user on LoginPage
| Title | saucedemo |
And User enters Username, password and click on Login button
 |standard_user | secret_sauce |


Sceaniro: User adds every item from the catalogue to the cart by pressing add to cart button 
Given user on LoginPage
| Title | saucedemo |
And User enters Username, password and click on Login button
 |standard_user | secret_sauce |
 when user click on add cart icon on item
 Then user should able to see cart count incrase by 1
 
 
Sceaniro: User removes every item from the cart by pressing remove button on each of the items from catalogue in home pag 
Given user on LoginPage
| Title | saucedemo |
And User enters Username, password and click on Login button
 |standard_user | secret_sauce |
 when user click on add cart icon on item
 Then user should able to see cart count incrase by 1
 
 Scenario: User verify item title description and price
Given user on LoginPage
| Title | saucedemo |
And User enters Username, password and click on Login button
 |standard_user | secret_sauce |
 Then user on to homepage of application
 when user should see correct title
 And user should see correct description
 Then user should able to see correct price
 
  
      
      
