@regression
Feature: Ebay Search Filter Functionality 
 

  Scenario: search for shirts with Long Sleeves
    Given Open Ebay Website
    When Search for shirts
    When Select Long Sleeve filters
    Then The item list should only have Long Sleeve shirts
    
    #Given Open Ebay website - is what you had but it needed to be Website. I guess to reference step from first feature file. 