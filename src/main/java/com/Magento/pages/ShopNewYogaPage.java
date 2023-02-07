package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopNewYogaPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(ShopNewYogaPage.class.getName());

    public ShopNewYogaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[@class='product-image-wrapper'])[8]")
    WebElement ElisaEverCoolTee ;

    @FindBy(xpath = "(//span[@class='product-image-wrapper'])[9]")
    WebElement LaylaTee ;
    @FindBy(xpath = "(//a[@class='action view'])[7]")
    WebElement ReviewsButton ;

    public void clickOnElisaEverCoolTee() {
        clickOn(ElisaEverCoolTee);
        LOG.info("click Elisa Ever Cool Tee success");
    }
    public void clickOnReviews() {
        clickOn(ReviewsButton);
        LOG.info("click review button success");
    }
    public void hoverOverLaylaTee(WebDriver driver){
        waitForElementToBeVisible(driver, 10, LaylaTee);
        hoverOver(driver,LaylaTee);
        LOG.info("hover over LaylaTee success");
    }
}
