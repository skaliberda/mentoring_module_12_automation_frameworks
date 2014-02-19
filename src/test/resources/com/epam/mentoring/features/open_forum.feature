@done @forum
Feature: Open forum functionality

  Scenario: As User I want be able to navigate to the forum
    Given User on the page - http://software-testing.ru/ 
    When User opens forum
    Then User should see forum page
