package com.epam.mentoring.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.mentoring.core.Driver;

public class ForumPage extends BasePage {

    @FindBy(id = "sign_in")
    private WebElement signInButton;
    
    @FindBy(id = "ips_username")
    private WebElement usernameField;
    
    @FindBy(id = "ips_password")
    private WebElement passwordField;
    
    @FindBy(xpath = "//input[@class='ipsButton']")
    private WebElement submitButton;
    
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
    
    public void openSubForum(String subForumName) {
    	WebDriver driver = Driver.getInstance();
        WebElement subforumTitle = driver.findElement(By.xpath("//a[@title='"+ subForumName +"']"));
        subforumTitle.click();
    }
}
