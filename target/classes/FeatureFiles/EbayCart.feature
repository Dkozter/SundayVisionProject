@regression
Feature: Ebay Search Filter Functionality 
 
	 Scenario: search for shirts with Long Sleeves
    Given Open Ebay Website
    When Search for shirts
		And Select first shirt product on item list
		And Select color on shirt
		And Select size on shirt
		And Select quantity of shirt
		Then Add to cart