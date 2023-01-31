package com.Scaledupit.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearhPageScaledupit extends CommonAPI {

    Logger LOG = LogManager.getLogger(SearhPageScaledupit.class.getName());

    public SearhPageScaledupit(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //objects

    @FindBy(xpath = "(//span[@class='product-title'])[2]")
    WebElement ShirtButton;

    //reusable methods
    public void clickOnShirtButton(){
        clickOn(ShirtButton);
        LOG.info("click on Shirt button success");
    }




}


