@done @forum
Feature: Create new topic functionality

  Scenario: As User I want to be able to create new topic
    Given user is logged into forum
    When user is on the subforum Selenium - Functional Testing  
    When user creates new topic
    Then user should see new topic editor
    
  Scenario: As User I want to avoid creating topic with subject less then 2 symbols
    Given user is in the topic editor
    When user enters single symbol as subject name
    When user selects preview
    Then user should see error message
    
 Scenario: As User I want to preview text entered as topic body
    Given user is in the editor of topic
    When user enters topic body
    When user opens preview
    Then user should see entered text in topic body