package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order000017128Page extends CommonAPI {

    Logger LOG = LogManager.getLogger(Order000017128Page.class.getName());

    public Order000017128Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='action print']/span")
    WebElement printOrderButton;

    public void clickOnPrintOrder() {
        clickOn(printOrderButton);
        LOG.info("click on print order button success");
    }
}
