package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPageMagento extends CommonAPI {
    Logger LOG = LogManager.getLogger(CheckOutPageMagento.class.getName());

    public CheckOutPageMagento(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='View and Edit Cart']")
    WebElement viewAndEditCartBoton;
    @FindBy(xpath = "//input[@class='radio'])[1]")
    WebElement ShipingMethodBtn;
    @FindBy(xpath = "//span[text()='Next']")
    WebElement NextButton;
    @FindBy(xpath = "//span[text()='Place Order']")
    WebElement PlaceOrderBtn;

    public void clickOnPlaceOrderBtn(){
        clickOn(PlaceOrderBtn);
        LOG.info("click on Next button success");
    }
    public void clickOnNextButton(){
        clickOn(NextButton);
        LOG.info("click on Next button success");
    }
    public void clickShipingMethodBtn(){
        clickOn(ShipingMethodBtn);
        LOG.info("click on Shiping Methodbutton success");
    }
    public void clickOnViewAndEditCart(WebDriver driver){
        clickWithActions(driver, viewAndEditCartBoton);
        LOG.info("click on view and edit cart button success");
    }
}
