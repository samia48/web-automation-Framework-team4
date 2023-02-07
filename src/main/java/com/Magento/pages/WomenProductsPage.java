package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenProductsPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(WomenProductsPage.class.getName());

    public WomenProductsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Jackets']")
    WebElement jacketsButton;

    public void clickOnJackets() {
        clickOn(jacketsButton);
        LOG.info("click jackets button success");
    }
}
