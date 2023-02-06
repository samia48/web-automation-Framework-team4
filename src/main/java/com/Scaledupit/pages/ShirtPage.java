package com.Scaledupit.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShirtPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(ShirtPage.class.getName());

    public ShirtPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //objects

    @FindBy(xpath = "//button[@name='add-to-cart']")
    WebElement AddToCartButton;


    //reusable methods
    public void clickOnAddToCartButton(){
        clickOn(AddToCartButton);
        LOG.info("click on Shirt button success");

    }


}
