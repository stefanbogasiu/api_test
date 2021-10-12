Feature: Search by keyword

  @Test1
  Scenario: Searching for a term
    Given Sergey is navigating to weather api homepage
    When he looks up "New%20York"
    Then he should see information about "New York"

  @Test2
  Scenario: Searching for a term
    Given Sergey is navigating to weather api homepage
    When he looks up "WrongCity"
    Then he should see information about "WrongCity"

