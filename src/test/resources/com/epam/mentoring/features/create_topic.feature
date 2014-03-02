@done @forum
Feature: Create new topic functionality

  Scenario: As User I want to be able to create new topic
    Given user is logged into forum
    When user is on the subforum Selenium - Functional Testing  
    When user creates new topic
    Then user should see new topic editor