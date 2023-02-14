package com.FreeCRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestoreRecordPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(RestoreRecordPage.class.getName());

    public RestoreRecordPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@class='item'])[19]")
    WebElement company;

    @FindBy(xpath = "(//div[@class='ui fitted checkbox'])[2]")
    WebElement checkBox;

    @FindBy(xpath = "//button[@class='ui button']")
    WebElement restoreSelectedButton;

    @FindBy(xpath = "//button[@class='ui primary button']")
    WebElement okButton;


    public void clickOnCompany(){
        clickOn(company);
        LOG.info("click company success");
    }

    public void clickOnCheckBox(){
        clickOn(checkBox);
        LOG.info("click on checkbox success");
    }

    public void clickOnRestoreButton(){
        clickOn(restoreSelectedButton);
        LOG.info("click on restore success");
    }

    public void clickOnOkButton(){
        clickOn(okButton);
        LOG.info("click ok button success");
    }

}

