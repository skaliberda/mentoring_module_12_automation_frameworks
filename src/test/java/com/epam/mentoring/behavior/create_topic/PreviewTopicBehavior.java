package com.epam.mentoring.behavior.create_topic;

import com.epam.mentoring.behavior.BaseBehavior;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PreviewTopicBehavior extends BaseBehavior {

	private CreateTopicAssert createTopicAssert = new CreateTopicAssert();
	
//	 Scenario: As User I want to preview text entered as topic body
//	    Given user is in the topic editor
//	    When user enters topic body
//	    When user selects preview
//	    Then user should see entered text in topic body
	
	@Given("^user is in the topic editor$")
	public void user_is_in_the_topic_editor() throws Throwable {
		user.atHomePage().open();
		user.atHomePage().openForum();
		user.atForumPage().userSignsIn();
		user.atForumPage().openSubForum();
		user.atSubForumPage().createsNewTopic();
	}
	
	@When("^user enters topic body$")
    public void user_enters_topic_body() throws Throwable {
        
    }
	
	@When("^user selects preview$")
	public void user_selects_preview() throws Throwable {
		
	}
	
}
