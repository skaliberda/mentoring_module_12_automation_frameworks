@done @forum
Feature: Search Test

  Scenario: Perform Search
    Given User on the page - http://software-testing.ru/
    When User opens forum
    And I type "Test query"
    And I click "Search Button"
    Then I see "Результаты поиска"

  Scenario: Empty Search
    Given User on the page - http://software-testing.ru/
    When User opens forum
    And I type ""
    And I click "Search Button"
    Then I see error message contains next text "слова для поиска имеет менее 2 символов"

  Scenario: Search without results
    Given User on the page - http://software-testing.ru/
    When User opens forum
    And I type "12"
    And I click "Search Button"
    Then I see no result message contains next text "Поиск не дал результатов по"