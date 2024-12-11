Feature: Generate Calories feature

  @generateCalories1
  Scenario: Verify user can generate 4 meals for given amount of calories
    Given user goes to "https://www.eatthismuch.com/"
    And user enters 2500 calories
    Then user selects 4 meals
    And user clicks on generate
    Then verify 4 meals are generated

  @generateCalories2
  Scenario: Verify user can generate 6 meals for given amount of calories
    Given user goes to "https://www.eatthismuch.com/"
    And user enters 3500 calories
    Then user selects 6 meals
    And user clicks on generate

    @generateCalories3
    Scenario: Verify user can generate 5 meals for given amount of calories for Vegan
      Given user goes to "https://www.eatthismuch.com/"
      Then user selects vegan
      And user enters 2500 calories
      Then user selects 5 meals
      And user clicks on generate
