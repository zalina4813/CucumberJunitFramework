
@doordash
Feature: user should be able to search for restaurants near given address

  @doordash1
  Scenario: verify user can search restaurants by valid address
    Given user is doordash homepage
    When the user enters "4976 Millenia Blvd, Orlando Fl" in the address search bar
    And the user clicks on the search button
    Then user should see a list of restaurants available near "4976 Millenia Blvd, Orlando Fl"



