package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WayfarerMessengerBagPageMagento extends CommonAPI {
    Logger LOG = LogManager.getLogger(WayfarerMessengerBagPageMagento.class.getName());

    public WayfarerMessengerBagPageMagento(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityField;

    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCartButton;


    public void clickOnAddToCartButton(){
        clickOn(addToCartButton);
        LOG.info("click add to cart button success");
    }
}
