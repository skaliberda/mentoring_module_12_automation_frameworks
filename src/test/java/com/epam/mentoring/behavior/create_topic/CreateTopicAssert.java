package com.epam.mentoring.behavior.create_topic;

import com.epam.mentoring.behavior.BaseBehavior;
import com.epam.mentoring.core.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CreateTopicAssert extends BaseBehavior {
    
    public void checkThatNewTopicEditorIsDisplayed() {
        Assert.assertTrue(Driver.getInstance().findElement(By.xpath("//h1[text()='Создание новой темы в Selenium - Functional Testing']")).isDisplayed());
    }
}
