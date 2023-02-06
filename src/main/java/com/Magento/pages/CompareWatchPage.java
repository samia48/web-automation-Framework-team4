package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareWatchPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(SigninPageMagento.class.getName());
    public CompareWatchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //objects

    @FindBy(xpath = "(//button[@class='action tocart primary'])[1]")
    WebElement AddtoCartButton;
    @FindBy(xpath = "//button[@class='action-primary action-accept']")
    WebElement OkButton;


    @FindBy(xpath = "(//a[@class='action delete'])[3]")
    WebElement removeProductButton;


    //reusable methods


    public void clickOnAddToCartButton(){
        clickOn(AddtoCartButton);
        LOG.info("click on add to cart button success");
    }
    public void clickOnRemoveProductButton(){
        clickOn(removeProductButton);
        LOG.info("click on remove product button success");
    }


    public void clickOnOkButton(WebDriver driver){
        waitForElementToBeVisible(driver, 10, OkButton);
        clickOn(OkButton);
        LOG.info("click on Ok button success");
    }


}
