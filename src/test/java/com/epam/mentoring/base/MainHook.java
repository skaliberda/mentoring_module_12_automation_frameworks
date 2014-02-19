package com.epam.mentoring.base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.epam.mentoring.core.Driver;

import java.io.IOException;

/**
 * Cucumber hooks are executed before or after each scenario
 */
public class MainHook {

  @Before
  public void prepare() {
//	  System.out.println("This method is executed - prepare");
  }

  @After
  public void cleanUp(Scenario result) throws IOException {
//	  System.out.println("This method is executed - takeScreenShot");
    result.embed(getScreenShotBytes(), "image/png");
  }

  private byte[] getScreenShotBytes() {
    if(Driver.getInstance() instanceof TakesScreenshot){
      return ((TakesScreenshot) Driver.getInstance()).getScreenshotAs(OutputType.BYTES);
    }
    return new byte[]{};
  }

}

