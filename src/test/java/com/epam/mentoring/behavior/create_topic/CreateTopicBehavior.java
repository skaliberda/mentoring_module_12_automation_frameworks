package com.epam.mentoring.behavior.create_topic;

import com.epam.mentoring.behavior.BaseBehavior;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateTopicBehavior extends BaseBehavior {

    private CreateTopicAssert createTopicAssert = new CreateTopicAssert();
    
    @Given("^user is logged into forum$")
    public void user_is_logged_into_forum() throws Throwable {
        user.atHomePage().open();
        user.atHomePage().openForum();
        user.atForumPage().userSignsIn();
    }

    @When("user is on the subforum \"([^\"]*)\"")
    public void user_is_on_the_subforum_Selenium_Functional_Testing(String subForumName) throws Throwable {
        user.atForumPage().openSubForum(subForumName);
    }
    
    @When("^user creates new topic$")
    public void user_creates_new_topic() throws Throwable {
        user.atSubForumPage().createsNewTopic();
    }
    
    @Then("user should see new topic editor in \"([^\"]*)\"")
    public void user_should_see_new_topic_editor(String subForumName) throws Throwable {
    	createTopicAssert.checkThatNewTopicEditorIsDisplayed(subForumName);
    }
            
}
