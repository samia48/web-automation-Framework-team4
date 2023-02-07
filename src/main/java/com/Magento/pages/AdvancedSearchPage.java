package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvancedSearchPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(AdvancedSearchPage.class.getName());
    public AdvancedSearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //objects

    @FindBy(xpath = "//input[@id='name']")
    WebElement ProductNameField;
    @FindBy(xpath = "//input[@id='sku']")
    WebElement SKUField;
    @FindBy(xpath = "//input[@id='description']")
    WebElement DescriptionField;
    @FindBy(xpath = "//input[@id='short_description']")
    WebElement ShortDescriptionField;
    @FindBy(xpath = "//input[@id='price']")
    WebElement PriceMinimum;
    @FindBy(xpath = "//input[@id='price_to']")
    WebElement PriceMaximum;
    @FindBy(xpath = "//div[@class='message error']")
    WebElement errorMessage;
    @FindBy(xpath = "//button[@class='action search primary']")
    WebElement SearchButton;


    public String geterrorMessage(){
        return getTextFromElement(errorMessage);
    }
    public void typeProductName(String item) {
        type(ProductNameField, item);
        LOG.info("Product name type success");
    }
    public void typeSKU(String item) {
        type(SKUField, item);
        LOG.info("SKU type success");
    }
    public void typeDescription(String item) {
        type(DescriptionField, item);
        LOG.info("type Description success");
    }
    public void typeShortDescription(String item) {
        type(ShortDescriptionField, item);
        LOG.info("type Short Description success");
    }
    public void typePriceMinimum(String item) {
        type(PriceMinimum, item);
        LOG.info("type Price Minimum success");
    }
    public void typePriceMaximum(String item) {
        type(PriceMaximum, item);
        LOG.info("type Price Maximum success");
    }
    public void clickOnSearchButton(){
        clickOn(SearchButton);
        LOG.info("click on search button success");
    }


}
