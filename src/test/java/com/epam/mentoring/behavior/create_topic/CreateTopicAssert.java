package com.epam.mentoring.behavior.create_topic;

import com.epam.mentoring.behavior.BaseBehavior;
import com.epam.mentoring.core.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateTopicAssert extends BaseBehavior {
    
    public void checkThatNewTopicEditorIsDisplayed(String subForumName) {
        Assert.assertTrue(Driver.getInstance().findElement(By.xpath("//h1[text()='Создание новой темы в "+ subForumName +"']")).isDisplayed());
    }

    public void checkThatErrorMessageIsDisplayed() {
	Assert.assertTrue(Driver.getInstance().findElement(By.
				xpath("//p[@class='message error' and contains(text(),'Название темы должно быть больше 2 символов')]")).isDisplayed());		
	}

    public void checkThatTopicBodyIsFilledWithText(String enteredText) {
        WebDriver driver = Driver.getInstance();
        WebElement frame = driver.findElement(By.xpath("//td/iframe"));
        driver.switchTo().frame(frame);
        String editorContent = driver.findElement(By.xpath("html/body")).getText();        
        Assert.assertTrue(editorContent.equalsIgnoreCase(enteredText));
        driver.switchTo().defaultContent();
    }
}
