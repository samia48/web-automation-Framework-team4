package com.FreeCRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateNewDealPage extends CommonAPI {
 Logger LOG = LogManager.getLogger(CreateNewDealPage.class.getName());

 public CreateNewDealPage(WebDriver driver) { PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//i[@class='money icon']" )
    WebElement clickDeal;

    @FindBy(xpath = "(//button[@class='ui linkedin button'])[5]" )
    WebElement createButton;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    WebElement titleField;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    WebElement saveButton;

    public void clickOnDeals(){
        clickOn(clickDeal);
        LOG.info("click on Deals success");
    }

    public void clickOnCreateButton(){
        clickOn(createButton);
        LOG.info("click on Create button success ");

    }

    public void typeOnTitle(String title){
        type(titleField, title);
        LOG.info("type on title field success");
    }

    public void clickOnSaveButton(){
        clickOn(saveButton);
        LOG.info("click on save button success");
    }
}
