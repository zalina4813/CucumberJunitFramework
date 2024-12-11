
@vending
Feature: Vending Machine Product Purchase

  @vending1
  Scenario: User purchases a product with exact change
    Given the vending machine is powered on
    And the vending machine has stock of "Soda"
    When the user inserts $1.50
    And the user selects "Soda"
    Then the vending machine dispenses "Soda"
    And the vending machine displays "Thank you!"

  @vending2
  Scenario: User tries to purchase a product with insufficient funds
    Given the vending machine is powered on
    And the vending machine has stock of "Chips"
    When the user inserts $0.50
    And the user selects "Chips"
    Then the vending machine displays "Insufficient funds. Please insert $1.00 more."
    And no product is dispensed

  @vending3
  Scenario: User purchases a product and receives change
    Given the vending machine is powered on
    And the vending machine has stock of "Candy Bar"
    When the user inserts $2.00
    And the user selects "Candy Bar"
    Then the vending machine dispenses "Candy Bar"
    And the vending machine returns $0.50 in change
    And the vending machine displays "Thank you!"