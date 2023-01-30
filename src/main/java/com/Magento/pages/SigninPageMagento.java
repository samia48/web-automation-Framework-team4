package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPageMagento extends CommonAPI {
    Logger LOG = LogManager.getLogger(SigninPageMagento.class.getName());
    public SigninPageMagento(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //objects
    @FindBy(xpath = "//input[@name='login[username]']")
    WebElement emailField;
    @FindBy(xpath = "//input[@name='login[password]']")
    WebElement passwordField;

    @FindBy(xpath = "//button[@class='action login primary']")
    WebElement signinButton;

    @FindBy(xpath = "//div[@id='email-error']")
    WebElement errorMessage;
    @FindBy(xpath = "//div[@class='message-error error message']")
    WebElement errorMessage1;


    //reusable methods
    public void typeEmailAddress(String emailAddress){
        type(emailField,emailAddress);
        LOG.info("type email address success");
    }
    public void typePassword(String password){
        type(passwordField,password);
        LOG.info("type password success");
    }
    public void typeInvalidEmailAddress(String invalidEmailAddress){
        type(emailField,invalidEmailAddress);
        LOG.info("type email address success");
    }
    public void typeInvalidPassword(String invalidPassword){
        type(passwordField,invalidPassword);
        LOG.info("type password success");
    }
    public void clickOnSigninButton(){
        clickOn(signinButton);
        LOG.info("click signin button success");
    }
    public String getErrorMessage(){

        return getTextFromElement(errorMessage);

    }
    public String getErrorMessage1(){
        if(errorMessage1.getText().contains("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later")){
            System.out.println("Success message is " + errorMessage1.getText());
        }else if (errorMessage1.getText().contains("Incorrect CAPTCHA")) {
            System.out.println("Error message is " + errorMessage1.getText());
        }
        return getTextFromElement(errorMessage1);
    }
}
