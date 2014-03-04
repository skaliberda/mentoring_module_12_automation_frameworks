package com.epam.mentoring.behavior.create_topic;

import com.epam.mentoring.behavior.BaseBehavior;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PreviewTopicBehavior extends BaseBehavior {

	private CreateTopicAssert createTopicAssert = new CreateTopicAssert();
		
	@Given("^user is in the editor of topic$")
	public void user_is_in_the_topic_editor() throws Throwable {
		user.atHomePage().open();
		user.atHomePage().openForum();
		user.atForumPage().userSignsIn();
		user.atForumPage().openSubForum("Selenium - Functional Testing");
		user.atSubForumPage().createsNewTopic();
	}
	
	@When("^user enters topic body$")
    public void user_enters_topic_body() throws Throwable {
		user.atTopicEditorPage().entersTopicOfBody("This is a body of topic");
        }
	
	@When("^user opens preview$")
	public void user_selects_preview() throws Throwable {
        user.atTopicEditorPage().userPreviewsTopic();
	}
	
    @Then("^user should see entered text in topic body$")
    public void user_should_see_entered_text_in_topic_body() throws Throwable {
        createTopicAssert.checkThatTopicBodyIsFilledWithText("This is a body of topic");
    }
}
