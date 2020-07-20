Feature: Search user in api rest
  As integrator I want to be able to

  Scenario: Each user has a name
    Given I got the service
    When I ask for the user id 200
    Then I should see that the first name is Bonita