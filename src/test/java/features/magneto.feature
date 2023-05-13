Feature: Automate Magneto website 

@magneto1 @magneto
Scenario Outline: Verify add to art functionality
Given user navigate to magneto
Then user open menu <menu> and <submenu>
And user select the product
And user add product in cart

    Examples: 
      | menu  | submenu |
      | Gear  |     Bags |

      
@magneto2    @magneto
Scenario Outline: Verify product should add in wishist successfully	
Given user Login to magneto
Then user open menu <menu> and <submenu>
And user select the product
Then user should add product to wishlist

    Examples: 
      | menu  | submenu |
      | Gear  |     Bags |
      
      
@magneto3 @magneto
Scenario Outline: Verify add to art functionality
Given user navigate to magneto
When user search for product <product>
Then product should display

  Examples: 
      | product |
      | Overnight Duffle |
      

@magneto4 @magneto
Scenario Outline: Verify email subscription functionaliy
Given user navigate to magneto
Then user complete email <email> subscription process

 Examples: 
      | email |
      | aavdh555otk19Zoom@gmail.com |
      
      
@magneto5 @magneto
Scenario: Verify About US functionaliy
Given user navigate to magneto
Then verify aboutus page


@magneto6 @magneto
Scenario Outline: Verify add to art functionality
Given user navigate to magneto
Then user open menu <menu> and <submenu>
And user select the product
And user add product in cart
When user remove product from cart
Then product should remove from cart successfully


    Examples: 
      | menu  | submenu |
      | Gear  |     Bags |
      
@magneto7 @magneto
Scenario Outline: Verify create an account functionality
Given user navigate to magneto
When user create account with <firstname> , <lastname> and <password>
Then page title should be My Account
   Examples: 
      | firstname  | lastname | password |
      | first      |  last    | Welcome@123456|
      
      
@magneto8 @magneto
Scenario Outline: Verify advance search functionality
Given user navigate to magneto
When user perform advane search with SKU id <sku>
Then product should display
Examples:
|sku|
|MJ12|
 

@magneto9 @magneto
Scenario Outline: Verify compare product functionality
Given user navigate to magneto
When user search for the  product <product> and add to compare
And user search for the  product <product2> and add to compare
Then verify compare page product name


  Examples: 
      | product | product2 |
      | Overnight Duffle | Driven Backpack |
   
@magneto10 @magneto
Scenario Outline: Verify add to cart with quantity 
Given user navigate to magneto
Then user open menu <menu> and <submenu>
And user select the product
And user add product in cart with quantity <qty>

    Examples: 
      | menu  | submenu |
      | Gear  |     Bags |
      
      
@magneto @magneto11
Scenario: Verify user should be able to add multiple products in cart
Given user navigate to magneto
When user add multiple products in cart
|Push It Messenger Bag| Compete Track Tote|
