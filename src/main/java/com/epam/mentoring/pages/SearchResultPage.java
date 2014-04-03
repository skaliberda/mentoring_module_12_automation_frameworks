package com.epam.mentoring.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {
    @FindBy(xpath = "//h1[@class = 'ipsType_pagetitle']")
    private WebElement searchLabel;

    @FindBy(xpath = "//p[@class = 'message error']")
    private WebElement errorMessage;

    @FindBy(xpath = "//p[@class = 'no_messages']")
    private WebElement noResult;

    public String getLabelText() {
        waitForPageReady();
        return searchLabel.getText();
    }

    public String getErrorMessageText() {
        waitForPageReady();
        return errorMessage.getText();
    }

    public String getNoResultMessageText() {
        waitForPageReady();
        return noResult.getText();
    }
}
