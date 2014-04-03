package com.epam.mentoring.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

  private static WebDriver driver;

  public static WebDriver getInstance() {
    if (driver == null) {
      driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    return driver;
  }
}
