package com.epam.mentoring.behavior.create_topic;

import com.epam.mentoring.behavior.BaseBehavior;
import com.epam.mentoring.behavior.open_forum.OpenForumAssert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateTopicBehavior extends BaseBehavior {
    
//    Given User is logged into forum
//    When user is on the subforum Selenium - Functional Testing  
//    When user creates new topic
//    Then User should see new topic editor

    private CreateTopicAssert createTopicAssert = new CreateTopicAssert();
    
    @Given("^user is logged into forum$")
    public void user_is_logged_into_forum() throws Throwable {
        user.atHomePage().open();
        user.atHomePage().openForum();
        user.atForumPage().userSignsIn();
    }

    @When("^user is on the subforum Selenium - Functional Testing$")
    public void user_is_on_the_subforum_Selenium_Functional_Testing() throws Throwable {
        user.atForumPage().openSubForum();
    }
    
    @When("^user creates new topic$")
    public void user_creates_new_topic() throws Throwable {
        user.atSubForumPage().createsNewTopic();
    }
    
    @Then("^user should see new topic editor$")
    public void user_should_see_new_topic_editor() throws Throwable {
        
    }
            
}
