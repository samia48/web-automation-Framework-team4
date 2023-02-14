package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Date;

public class ShoppingCartPageMagento extends CommonAPI {
    Logger LOG = LogManager.getLogger(ShoppingCartPageMagento.class.getName());

    public ShoppingCartPageMagento(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Update Shopping Cart']")
    WebElement updateShoppingCart;

    @FindBy(xpath = "//a[@class='action action-delete']")
    WebElement removeButton;

    @FindBy(xpath = "//span[text()='Proceed to Checkout']")
    WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//a[@class='use-ajax action towishlist action-towishlist']//preceding-sibling::span")
    WebElement moveToWishListButton;

    @FindBy(xpath = "//a[@class='logo']//preceding-sibling::img")
    WebElement LUMAButton;
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement quantityField;





    public void typeOnQuantityField(){
        quantityField.clear();
        quantityField.sendKeys("2");
        LOG.info("type quantity success");
    }


    public void ClickOnUpdateShoppingCart(){
        clickOn(updateShoppingCart);
        LOG.info("update shopping cart success");
    }

    public void ClickOnRemoveButton (){
        clickOn(removeButton);
        LOG.info("click remove button success");
    }
    public void ClickOnProceedToCheckOutButton (){
        clickOn(proceedToCheckoutButton);
        LOG.info("click proceed to checkout button success");
    }
    public void ClickOnMoveToWishListButton (){
        clickOn(moveToWishListButton);
        LOG.info("click move To Wish List Button success");
    }
    public void ClickOnLUMAButton (){
        clickOn(LUMAButton);
        LOG.info("click LUMA button success");
    }
}
