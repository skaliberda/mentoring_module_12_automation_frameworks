package com.epam.mentoring.behavior.create_topic;

import com.epam.mentoring.behavior.BaseBehavior;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateNewTopicWithShortSubjectBehavior extends BaseBehavior {

	private CreateTopicAssert createTopicAssert = new CreateTopicAssert();

	@Given("^user is in the topic editor$")
	public void user_is_in_the_topic_editor() throws Throwable {
		user.atHomePage().open();
		user.atHomePage().openForum();
		user.atForumPage().userSignsIn();
		user.atForumPage().openSubForum("Selenium - Functional Testing");
		user.atSubForumPage().createsNewTopic();
	}

	@When("user enters single symbol \"([^\"]*)\" as subject name")
	public void user_enters_single_symbol_as_subject_name(String singleSymbol) throws Throwable {
		user.atTopicEditorPage().userEntersSubject(singleSymbol);
	}

	@When("^user selects preview$")
	public void user_selects_preview() throws Throwable {
		user.atTopicEditorPage().userPreviewsTopic();
	}

    @Then("^user should see error message$")
    public void user_should_see_error_message() throws Throwable {
        createTopicAssert.checkThatErrorMessageIsDisplayed();
    }
}
