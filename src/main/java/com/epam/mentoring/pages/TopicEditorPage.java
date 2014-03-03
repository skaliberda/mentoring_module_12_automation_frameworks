package com.epam.mentoring.pages;

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
}
