Feature: Filters functional tests
  Scenario: TOP RATED filter test
    Given I am on the Berlin Restorants page
    When I select  TOP RATED filter
    Then I see that Top Rated filter is applied