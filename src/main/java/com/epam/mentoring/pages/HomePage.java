package com.epam.mentoring.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(xpath = "//a[@href='/forum/']/span")
	private WebElement forumButton;

	
	
	public void open() {
		getDriver().get("http://software-testing.ru/");
	}

	public void openForum() {
		forumButton.click();
	}
}
