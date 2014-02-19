package com.epam.mentoring.steps;

import org.openqa.selenium.support.PageFactory;

import com.epam.mentoring.core.Driver;
import com.epam.mentoring.pages.HomePage;

public class User {

  private HomePage homePage = PageFactory.initElements(Driver.getInstance(), HomePage.class);

  public HomePage atHomePage() {
    if (homePage == null) {
     homePage = PageFactory.initElements(Driver.getInstance(), HomePage.class);
    }
    return homePage;
  }

 
}
