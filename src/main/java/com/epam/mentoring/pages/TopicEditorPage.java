package com.epam.mentoring.pages;

import com.epam.mentoring.core.Driver;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopicEditorPage extends BasePage {

	@FindBy(id = "topic_title")
	private WebElement subjectField;
	
	@FindBy(xpath = "//input[@name='preview']")
	private WebElement previewButton;
                
	public void userEntersSubject(String subject) {
		subjectField.sendKeys(subject);
	}
	
	public void userPreviewsTopic() {
		previewButton.click();
	}

        public void entersTopicOfBody(String bodyOfTopic) {
            WebDriver driver = Driver.getInstance();
            WebElement frame = driver.findElement(By.xpath("//td/iframe"));
            driver.switchTo().frame(frame);
            WebElement body = driver.findElement(By.xpath("//body"));
            body.click();
            body.clear();
            body.sendKeys(bodyOfTopic);
            JavascriptExecutor executor = (JavascriptExecutor)getDriver();
            executor.executeScript("arguments[0].innerHTML = '"+ bodyOfTopic +"'", body);
        
            driver.switchTo().defaultContent();
    }
}
