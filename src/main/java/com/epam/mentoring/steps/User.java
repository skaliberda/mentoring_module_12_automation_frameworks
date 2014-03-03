package com.epam.mentoring.steps;

import org.openqa.selenium.support.PageFactory;

import com.epam.mentoring.core.Driver;
import com.epam.mentoring.pages.HomePage;
import com.epam.mentoring.pages.ForumPage;
import com.epam.mentoring.pages.SubForumPage;
import com.epam.mentoring.pages.TopicEditorPage;

public class User {

  private HomePage homePage = PageFactory.initElements(Driver.getInstance(), HomePage.class);
  private ForumPage forumPage; 
  private SubForumPage subForumPage; 
  private TopicEditorPage topicEditorPage;
  
  public HomePage atHomePage() {
    if (homePage == null) {
     homePage = PageFactory.initElements(Driver.getInstance(), HomePage.class);
    }
    return homePage;
  }

  public ForumPage atForumPage() {
    if (forumPage == null) {
       forumPage = PageFactory.initElements(Driver.getInstance(), ForumPage.class);
      }
      return forumPage;
  }
  
  public SubForumPage atSubForumPage() {
    if (subForumPage == null) {
       subForumPage = PageFactory.initElements(Driver.getInstance(), SubForumPage.class);
      }
      return subForumPage;
  }

  public TopicEditorPage atTopicEditorPage() {
	if (topicEditorPage == null) {
		topicEditorPage = PageFactory.initElements(Driver.getInstance(), TopicEditorPage.class);
	  }
	  return topicEditorPage;
	
}
}
