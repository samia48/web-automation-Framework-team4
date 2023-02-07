package com.FreeCRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewDocumentPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(CreateNewDocumentPage.class.getName());
    public CreateNewDocumentPage(WebDriver driver) { PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//i[@class='users icon']")
    WebElement hoverOverLeftMenu;

    @FindBy(xpath = "(//span[@class='item-text'])[9]")
    WebElement clickDocument;

    @FindBy(xpath = "(//button[@class='ui linkedin button'])[2]")
    WebElement createButton;

    @FindBy(xpath = " //input[@name='title']")
    WebElement titleField;

    @FindBy(xpath = " //button[@class='ui button']")
    WebElement cancelButton;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    WebElement saveButton;

    public void setHoverOverLeftMenu(WebDriver driver){
        hoverOver(driver, hoverOverLeftMenu);
        LOG.info("hover over menu success");
    }

    public void clickOnDocuments(){
        clickOn(clickDocument);
        LOG.info("click on cases icon success");
    }


    public void clickOnCreateBtn(){
        clickOn(createButton);
        LOG.info("click on create button success");
    }


    public void typeTitleName(String enterTitleName){
        type(titleField, enterTitleName);
        LOG.info("type on title field success");
    }

    public void clickOnCancelButton(){
        clickOn(cancelButton);
        LOG.info("click on cancel button success");
    }

    public void clickOnSaveButton(){
        clickOn(saveButton);
        LOG.info("click on save button success");
    }

}
