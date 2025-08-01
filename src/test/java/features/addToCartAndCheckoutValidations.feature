Feature: Add to Cart and Checkout Validations


  Scenario Outline: Add item to cart and proceed to checkout
    Given User is on Greenkart Home Page
    When User searched product <product> in Search Bar and add quantity <quantity>
    Then User adds the product to the cart
    And User verifies the <product> is checkout page with quantity <quantity>
Examples:
  | product | quantity |
  | tomato  | 3        |
