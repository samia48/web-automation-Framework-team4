package com.FreeCRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewFormPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(AddNewFormPage.class.getName());

    public AddNewFormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//i[@class='users icon']")
    WebElement hoverOverLeftMenu;

    @FindBy(xpath = "(//div[@class='menu-item-wrapper'])[12]")
    WebElement clickForm;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    WebElement addButton;

    @FindBy(xpath = " //input[@name='name']")
    WebElement nameField;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    WebElement saveButton;

    public void setHoverOverLeftMenu(WebDriver driver){
        hoverOver(driver, hoverOverLeftMenu);
        LOG.info("hover over menu success");
    }

    public void clickOnFormIcon(){
        clickOn(clickForm);
        LOG.info("click on form icon success");
    }

    public void clickOnAddButton(){
        clickOn(addButton);
        LOG.info("click on add button success");
    }


    public void typeOnNameField(String enterName){
        type(nameField, enterName);
        LOG.info("type on name field success");
    }

    public void clickOnSaveButton(){
        clickOn(saveButton);
        LOG.info("click on save button success");
    }

}

