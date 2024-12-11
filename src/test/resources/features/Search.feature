@search
Feature: Google Search Functionality
  @search1
  Scenario: Verify user can search products in English
    Given user is on google search page
    When user enters "apple" in the search box
    And user clicks on search button
    Then verify results contain "apple"

  @search2
  Scenario Outline: To test multiple sets of data
    Given user is on google search page
    When user enters "<product>" in the search box
    And user clicks on search button
    Then verify results contain "<product>"
    Examples:
      | product    |
      | apple      |
      | banana     |
      | washington |
      | island     |
      | computer   |
      | orange     |