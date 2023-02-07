package com.FreeCRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCallPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateNewCallPage.class.getName());
    public CreateNewCallPage(WebDriver driver) { PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//i[@class='users icon']")
    WebElement hoverOverLeftMenu;

    @FindBy(xpath = "(//span[@class='item-text'])[8]")
    WebElement clickCalls;

    @FindBy(xpath = "(//button[@class='ui linkedin button'])[3]")
    WebElement createButton;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    WebElement callTimeField;

    @FindBy(xpath = "//div[@aria-label='Choose Sunday, 10 September 2023']")
    WebElement dateField;

    @FindBy(xpath = "//li[@class='react-datepicker__time-list-item  react-datepicker__time-list-item--selected']")
    WebElement timeField;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    WebElement saveButton;


    public void setHoverOverLeftMenu(WebDriver driver){
        hoverOver(driver, hoverOverLeftMenu);
        LOG.info("hover over menu success");
    }

    public void clickOnCallIcon(){
        clickOn(clickCalls);
        LOG.info("click on cases icon success");
    }

    public void clickOnCreateBtn(){
        clickOn(createButton);
        LOG.info("click on create button success");
    }

    public void ClickOnCallTimeBox(){
        clickOn(callTimeField);
        LOG.info("click call time field success");
    }


    public void enterDateAndTime(String enterTimeAndDate){
        type(callTimeField, enterTimeAndDate);
        LOG.info("type time and date success");
    }

    public void clickOnSaveButton(){
        clickOn(saveButton);
        LOG.info("click on save button success");
    }

}
