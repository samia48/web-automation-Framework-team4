package com.Scaledupit.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //objects

    @FindBy(xpath = "//div[@class='wc-proceed-to-checkout']")
    WebElement ProceedToCheckoutButton;

    //reusable methods

    public void clickOnProceedToCheckoutButton(){
        clickOn(ProceedToCheckoutButton);
        LOG.info("click on Proceed To Checkout button success");

    }

}
