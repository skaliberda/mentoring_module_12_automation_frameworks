package com.epam.mentoring.pages;

import com.epam.mentoring.core.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver getDriver() {
        return Driver.getInstance();
    }

    public void waitForPageReady() {
        Object status;
        do {
            status = ((JavascriptExecutor) getDriver()).executeScript("return document.readyState");
        } while (!status.toString().equals("complete"));
    }
}
