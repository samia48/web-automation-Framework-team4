package com.Scaledupit.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(BillingPage.class.getName());

    public BillingPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //objects

    @FindBy(xpath = "//ul[@class='wc_payment_methods payment_methods methods']")
    WebElement InfoMessage;

    //reusable methods

    public String getInfoMessage(){

        return getTextFromElement(InfoMessage);

    }

}
