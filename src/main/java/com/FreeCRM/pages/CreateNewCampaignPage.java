package com.FreeCRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCampaignPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateNewCampaignPage.class.getName());
    public CreateNewCampaignPage(WebDriver driver) { PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//i[@class='users icon']")
    WebElement hoverOverLeftMenu;

    @FindBy(xpath = "(//span[@class='item-text'])[11]")
    WebElement clickCampaigns;

    @FindBy(xpath = "(//button[@class='ui linkedin button'])[1]")
    WebElement createButton;

    @FindBy(xpath = "//input[@name ='name']")
    WebElement nameField;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    WebElement saveButton;

    public void setHoverOverLeftMenu(WebDriver driver){
        hoverOver(driver, hoverOverLeftMenu);
        LOG.info("hover over menu success");
    }

    public void clickOnCampaigns(){
        clickOn(clickCampaigns);
        LOG.info("click on campaigns success");
    }

    public void clickOnCreateBtn(){
        clickOn(createButton);
        LOG.info("click on create button success");
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
