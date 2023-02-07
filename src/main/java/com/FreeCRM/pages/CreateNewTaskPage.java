package com.FreeCRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTaskPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(CreateNewTaskPage.class.getName());
    public CreateNewTaskPage(WebDriver driver) { PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//i[@class='users icon']")
    WebElement hoverOverLeftMenu;

    @FindBy(xpath = "(//span[@class='item-text'])[6]")
    WebElement clickTask;

    @FindBy(xpath = "(//button[@class='ui linkedin button'])[4]")
    WebElement createButton;

    @FindBy(xpath = "//input[@name='title']")
    WebElement titleField;

    @FindBy(xpath = "  //button[@class='ui linkedin button']")
    WebElement saveButton;

    public void setHoverOverLeftMenu(WebDriver driver){
        hoverOver(driver, hoverOverLeftMenu);
        LOG.info("hover over menu success");
    }

    public void clickOnTaskIcon(){
        clickOn(clickTask);
        LOG.info("click on task success");
    }

    public void clickOnCreateBtn(){
        clickOn(createButton);
        LOG.info("click on create button success");
    }

    public void typeTitle(String title){
        type(titleField, title);
        LOG.info("type on title field success");
    }
    public void clickOnSaveButton(){
        clickOn(saveButton);
        LOG.info("click on save button success");
    }


}
