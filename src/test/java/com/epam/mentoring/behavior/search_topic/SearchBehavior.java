package com.epam.mentoring.behavior.search_topic;

import com.epam.mentoring.behavior.BaseBehavior;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class SearchBehavior extends BaseBehavior {

    @When("^I type \"([^\"]*)\"")
    public void typeText(String text) {
        user.atForumPage().fillSearchField(text);
    }

    @When("I click \"Search Button\"")
    public void clickSearchButton() {
        user.atForumPage().clickSearchButton();
    }

    @Then("I see \"([^\"]*)\"")
    public void checkSearchList(String searchResult) {
        assertTrue("Page with search results is not visible.", searchResult.equals(user.atSearchResultPage().getLabelText()));
    }

    @Then("I see error message contains next text \"([^\"]*)\"")
    public void checkErrorMessage(String searchResult) {
        assertTrue("Message for empty search is not visible.", user.atSearchResultPage().getErrorMessageText().contains(searchResult));
    }

    @Then("I see no result message contains next text \"([^\"]*)\"")
    public void checkNoResultMessage(String searchResult) {
        assertTrue("Message for empty search is not visible.", user.atSearchResultPage().getNoResultMessageText().contains(searchResult));
    }
}
