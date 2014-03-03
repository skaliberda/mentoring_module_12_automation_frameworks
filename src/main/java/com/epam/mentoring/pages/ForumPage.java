package com.epam.mentoring.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForumPage extends BasePage {

    @FindBy(id = "sign_in")
    private WebElement signInButton;
    
    @FindBy(id = "ips_username")
    private WebElement usernameField;
    
    @FindBy(id = "ips_password")
    private WebElement passwordField;
    
    @FindBy(xpath = "//input[@class='ipsButton']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[@title='Selenium - Functional Testing']")
    private WebElement subforumLink;
    
    public void userSignsIn() {
    	try { 
    			if (signInButton.isDisplayed()) {
    				signInButton.click();
    				usernameField.sendKeys("Training");
    				passwordField.sendKeys("Qweasdzxc123");
    				submitButton.click();
    			} 
    		} catch(NoSuchElementException e) { System.out.println("User is already signed in"); }

    }
    
    public void openSubForum() {
        subforumLink.click();
    }
}
