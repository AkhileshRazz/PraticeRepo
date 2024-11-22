Feature: Search and place the order for products

Scenario: Search Exprience for product search in both 
Given User is on GreenKart Landing page
When user searched with shortName "Tom" and extract actual name of product
Then user searched for same shortName "Tom" in offerpage to check if the product exist
Then validate product name in offerpage matches with Landing page
