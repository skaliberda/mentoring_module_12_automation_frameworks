package com.epam.mentoring.behavior.open_forum;

import com.epam.mentoring.behavior.BaseBehavior;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenForumBehavior extends BaseBehavior {

  private OpenForumAssert openForumAssert = new OpenForumAssert();

  @Given("^User on the page - http://software-testing.ru/$")
  public void User_on_the_page_() throws Throwable {
	  user.atHomePage().open();
  }

  @When("^User opens forum$")
  public void User_opens_forum() throws Throwable {
	  user.atHomePage().openForum();
  }

  @Then("^User should see forum page$")
  public void User_should_see_forum_page() throws Throwable {
	  openForumAssert.checkThatForumPageIsOpenedAndForumCategoriesAreDisplayed();
  }
}
