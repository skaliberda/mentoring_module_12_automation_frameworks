package com.epam.mentoring.behavior.open_forum;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.epam.mentoring.behavior.BaseBehavior;
import com.epam.mentoring.core.Driver;

public class OpenForumAssert extends BaseBehavior {

    public void checkThatForumPageIsOpenedAndForumCategoriesAreDisplayed() {
        Assert.assertTrue(Driver.getInstance().findElement(By.id("categories")).isDisplayed());
    }
}
