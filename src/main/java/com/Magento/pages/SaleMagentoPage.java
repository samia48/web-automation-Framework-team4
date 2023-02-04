package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaleMagentoPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(SaleMagentoPage.class.getName());

    public SaleMagentoPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Shop Women’s Deals']")
    WebElement shopWomensDeal;


    public void clickOnShopWomensDealButton(){
        clickOn(shopWomensDeal);
        LOG.info("click add to cart button success");
    }
}
