Feature: Search by keyword

  Scenario: Searching for a term
    Given Sergey is navigating to weather api homepage
    When he looks up "New%20York"
    Then he should see information about "New York"

  Scenario: Searching for a term
    Given Sergey is navigating to weather api homepage
    When he looks up "Bucuresti"
    Then he should see information about "Bucuresti"

