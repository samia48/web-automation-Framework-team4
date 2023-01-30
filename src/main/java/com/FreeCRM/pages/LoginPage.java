package com.FreeCRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passField;

    @FindBy(xpath = "//*[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(),'Something went wrong...')]")
    WebElement errorMessage;

    @FindBy(xpath = "//i[@class='settings icon']")
    WebElement settingsIcon;

    @FindBy(xpath = "//span[text()='Log Out']")
    WebElement logOutButton;

    @FindBy(xpath = "//i[@class='trash alternate outline icon']")
    WebElement trashIcon;

    @FindBy(xpath = "//input[@type='text']")
    WebElement searchTextBox;

    @FindBy(css = "input[type = 'text']")
    WebElement searchField;




    //reusable methods
    public void typeEmailAddress(String emailAddress){
        type(emailField, emailAddress);
        LOG.info("type email address success");
    }

    public void typePassword(String password){
        type(passField, password);
        LOG.info("type email address success");
    }
    public void clickOnLoginButton(){
        clickOn(loginButton);
        LOG.info("click login button success");
    }

    public String getErrorMessage() {

        return getTextFromElement(errorMessage);
    }

    public void clickOnSettingsIcon(){
        clickOn(settingsIcon);
        LOG.info("click setting icon success");
    }

    public void clickOnLogOutButton(){
        clickOn(logOutButton);
        LOG.info("click log out button success");
    }

    /*public void clickOnTrashIcon(){
        clickOn(trashIcon);
        LOG.info("click trash icon success");
    }

    public void clickOnSearchTextBox(){
        clickOn(searchTextBox);
        LOG.info("click trash icon success");
    }

    public void typeItemToSearch(String item){
        type(searchField, item);
        LOG.info("item name type success");
    }

    public void searchItem(String item){
        typeAndEnter(searchField, item);
        LOG.info("item name type and enter success");
    }*/

}
