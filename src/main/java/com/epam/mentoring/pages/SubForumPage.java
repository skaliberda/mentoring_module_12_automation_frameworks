package com.epam.mentoring.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubForumPage extends BasePage {
    
    @FindBy(xpath = "//a[@title='Новая Тема']")
    private WebElement newTopicButton;

    public void createsNewTopic() {
        newTopicButton.click();
    }
}
