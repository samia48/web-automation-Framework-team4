package com.Scaledupit.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(ShirtPage.class.getName());

    public ShoppingCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //objects

    @FindBy(xpath = "//div[@class='wc-proceed-to-checkout']")
    WebElement ProceedToCheckoutButton;
    @FindBy(xpath = "(//input[@type='number'])[1]")
    WebElement quantityButton;
    @FindBy(xpath = "(//a[@class='remove'])[1]")
    WebElement deleteButton;
    @FindBy(xpath = "(//button[@class='button wp-element-button'])[2]")
    WebElement updatecartButton;



    //reusable methods

    public void clickOnProceedToCheckoutButton() {
        clickOn(ProceedToCheckoutButton);
        LOG.info("click on Proceed To Checkout button success");

    }
    public void clickOnQuantityButton() {
        clickOn(quantityButton);
        LOG.info("click on quantity button success");

    }
    public void clickOnDeleteButton() {
        clickOn(deleteButton);
        LOG.info("click on delete button success");

    }
    public void clickOnUpdateCartButton() {
        clickOn(updatecartButton);
        LOG.info("click on update button success");

    }



}
