Feature: OfferPage product validation

  Scenario Outline: User enter product short name and validates the same in Offer Page
    Given User is on Greenkart Home Page
    When User searched product <shortname> in Search Bar
    And User extracts the actual product name from Search Results
    And User Navigates to Offer Page and searches the product <shortname>
    Then User extracts the product full name from Offer Page and Verifies the same with Home Page product full name

Examples:
  | shortname |
  | tom       |
  | bro       |
  | straw     |
    | cauli     |

