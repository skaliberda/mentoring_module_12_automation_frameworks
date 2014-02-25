@done @forum
Feature: Create new topic functionality

  Scenario Outline: As User I want to be able to create new topic
    Given User is logged 
    And user is on the subforum <a>  
    When User clicks Новая Тема button 
    Then User should see Создание новой темы в <a>
    
    Examples: Subforum name
    
    | a 													|
    | Создание новой темы в Автоматизированное тестирование |
