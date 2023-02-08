package com.FreeCRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewEventPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateNewEventPage.class.getName());
    public CreateNewEventPage(WebDriver driver) { PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//i[@class='users icon']")
    WebElement hoverOverLeftMenu;

    @FindBy(xpath = "//i[@class='calendar icon']")
    WebElement calenderIcon;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    WebElement createButton;

    @FindBy(xpath = "//input[@name='title']")
    WebElement titleField;

    @FindBy(xpath = " //button[@class='ui button']")
    WebElement cancelButton;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    WebElement saveButton;

    public void setHoverOverLeftMenu(WebDriver driver){
        hoverOver(driver, hoverOverLeftMenu);
        LOG.info("hover over menu success");
    }

    public void clickOnCalenderIcon(){
        clickOn(calenderIcon);
        LOG.info("click on calender icon success");
    }

    public void clickOnCreateBtn(){
        clickOn(createButton);
        LOG.info("click on create button success");
    }

    public void typeOnTitleField(String enterTitle){
        type(titleField, enterTitle);
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
