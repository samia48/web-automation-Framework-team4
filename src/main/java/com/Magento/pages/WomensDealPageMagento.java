package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomensDealPageMagento extends CommonAPI {
    Logger LOG = LogManager.getLogger(WomensDealPageMagento.class.getName());

    public WomensDealPageMagento(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "*[alt='Josie Yoga Jacket']")
    WebElement josieYogaJacket;
    @FindBy(xpath = "(//div[@class='swatch-option text'])[58]")
    WebElement sizeMButton;

    @FindBy(xpath = "(//div[@class='swatch-option color'])[34]")
    WebElement colorBlackButton;


    @FindBy(xpath = "(//span[text()='Add to Cart'])[12]")
    WebElement addToCartButton;
    @FindBy(xpath = "//div[@class='message-success success message']//preceding-sibling::div")
    WebElement confirmation;

    @FindBy(xpath = "//a[@class='action showcart']")
    WebElement cartButton;
    @FindBy(xpath = "//span[text()='View and Edit Cart']")
    WebElement viewAndEditCartButton;


    public void hoverOverJosieYogaJacket(WebDriver driver){
        waitForElementToBeVisible(driver, 10, josieYogaJacket);
        hoverOver(driver,josieYogaJacket);
        LOG.info("hover over Josie Yoga Jacket success");
    }
    public void clickOnSizeM(){
        clickOn(sizeMButton);
        LOG.info("click add to cart button success");
    }
    public void ClickOnColorBlackButton(){
        clickOn(colorBlackButton);
        LOG.info("click color Black Button success");
    }
    public void ClickAddToCartButton(){
        clickOn(addToCartButton);
        LOG.info("click add To Cart Button success");
    }
    public String getconfirmationMessage(){
        return getTextFromElement(confirmation);
    }
    public void ClickOnCartButton(){
        clickOn(cartButton);
        LOG.info("click on cart button success");
    }
    public void ClickOnViewAndEditCart(WebDriver driver){
        clickWithActions(driver, viewAndEditCartButton);
        LOG.info("click on view and edit cart button success");
    }


}
