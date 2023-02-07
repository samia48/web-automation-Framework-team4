package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderAndRuternPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(OrderAndRuternPage.class.getName());

    public OrderAndRuternPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='oar-order-id']")
    WebElement OrderIDField;

    @FindBy(xpath = "//input[@id='oar-billing-lastname']")
    WebElement BillingLastnameField;

    @FindBy(xpath = "//input[@id='oar_email']")
    WebElement EmailField;

    @FindBy(xpath = "//button[@class='action submit primary']")
    WebElement ContinueButton;




    public void clickOnContinueButton() {
        clickOn(ContinueButton);
        LOG.info("click on continue button success");
    }


    public void typeEmail(String Email) {
        type(EmailField, Email);
        LOG.info("type review success");
    }

    public void typeBillingLastname(String BillingLastname) {
        type(BillingLastnameField, BillingLastname);
        LOG.info("type review success");
    }

    public void typeOrderID(String OrderID) {
        type(OrderIDField, OrderID);
        LOG.info("type review success");
    }
}

