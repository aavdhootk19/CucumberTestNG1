Feature: Search and place the order of the product

Scenario: Seach experience for product search in both home page and offers page

Given User is on GreenKart Page
When user searched with Short name "Tom" and extract actual name of product
Then user search for same shortname "Tom" in offers page to check if product exist 
And close the bwoser


Scenario Outline: Seach experience for product search in both home page and offers page

Given User is on GreenKart Page
When user searched with Short name <Name> and extract actual name of product
Then user search for same shortname <Name> in offers page to check if product exist 
And close the bwoser

Examples:
|Name |
|AVK  |
|KUL  |