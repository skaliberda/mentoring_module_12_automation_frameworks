package com.epam.mentoring.steps;

import org.openqa.selenium.support.PageFactory;

import com.epam.mentoring.core.Driver;
import com.epam.mentoring.pages.HomePage;
import com.epam.mentoring.pages.ForumPage;
import com.epam.mentoring.pages.SubForumPage;

public class User {

  private HomePage homePage = PageFactory.initElements(Driver.getInstance(), HomePage.class);
  private ForumPage forumPage; //= PageFactory.initElements(Driver.getInstance(), ForumPage.class);
  private SubForumPage subForumPage; //forumPage = PageFactory.initElements(Driver.getInstance(), ForumPage.class);
  
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
}
