package com.epam.mentoring.pages;

import org.openqa.selenium.WebDriver;

import com.epam.mentoring.core.Driver;

public class BasePage {

  public WebDriver getDriver() {
    return Driver.getInstance();
  }
}
