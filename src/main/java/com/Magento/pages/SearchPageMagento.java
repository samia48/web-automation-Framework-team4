package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageMagento extends CommonAPI {
    Logger LOG = LogManager.getLogger(SearchPageMagento.class.getName());

    public SearchPageMagento(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='Wayfarer Messenger Bag']")
    WebElement WayfarerMessengerBag;
    @FindBy(xpath = "//img[@alt='Typhon Performance Fleece-lined Jacket']")
    WebElement TyphonPerformanceFleecelinedJacket;
    @FindBy(xpath = "(//a[@class='action towishlist'])[5]")
    WebElement AddToWishList;


    public void clickOnWayfarerMessengerBag(){
        clickOn(WayfarerMessengerBag);
        LOG.info("click WayfarerMessengerBag success");
    }
    public void hoverOverTyphonPerformanceFleecelinedJacket(WebDriver driver){
        waitForElementToBeVisible(driver, 10, TyphonPerformanceFleecelinedJacket);
        hoverOver(driver,TyphonPerformanceFleecelinedJacket);
        LOG.info("hover over Typhon Performance Fleece lined Jacket success");
    }
    public void clickOnAddToWishList(){
        clickOn(AddToWishList);
        LOG.info("click WayfarerMessengerBag success");
    }
}
