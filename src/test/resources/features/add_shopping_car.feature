Feature: As a user to vivanda I want add a product in the shopping car

  Scenario: Add to shopping basket
    Given I enter into vivanda page
    When I add a product vino into shopping car
    Then I verify that the product selected is in the shopping car
