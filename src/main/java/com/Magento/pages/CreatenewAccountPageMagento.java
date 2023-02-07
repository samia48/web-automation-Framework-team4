package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatenewAccountPageMagento extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreatenewAccountPageMagento.class.getName());
    public CreatenewAccountPageMagento(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //objects
    @FindBy(xpath = "//input[@id='email_address']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@id='password-confirmation']")
    WebElement confirmpasswordField;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastNameField;

    @FindBy(xpath = "(//div[@class='primary']//preceding-sibling::button)[1]")
    WebElement createanAccountButton;

    @FindBy(id = "email_address-error")
    WebElement errorMessage;
    @FindBy(xpath = "//div[@class='message-error error message']")
    WebElement errorMessage1;
    @FindBy(xpath = "//div[@class='message-success success message']")
    WebElement confirmation;




    //reusable methods
    public void typeFirstName(String firstName){
        type(firstNameField,firstName);
        LOG.info("type first name success");
    }
    public void typeLastName(String lastName){
        type(lastNameField,lastName);
        LOG.info("type last name success");
    }
    public void typeEmailAddress(String emailAddress){
        type(emailField,emailAddress);
        LOG.info("type email address success");
    }
    public void typePassword(String password){
        type(passwordField,password);
        LOG.info("type password success");
    }

    public void typeConfirmPassword(String password){
        type(confirmpasswordField,password);
        LOG.info("confirm password success");
    }
    public void clickOnCreateanAccountButton(){
        clickOn(createanAccountButton);
        LOG.info("click create account button success");
    }
    public String getErrorMessage(){

        return getTextFromElement(errorMessage);

    }
    public String getErrorMessage1(){

        return getTextFromElement(errorMessage1);

    }
    public String getConfirmation(){

        return getTextFromElement(confirmation);

    }

}
