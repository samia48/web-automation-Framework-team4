package com.Scaledupit.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MusicPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(MusicPage.class.getName());

    public MusicPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //objects

    @FindBy(xpath = "//select[@class='orderby']")
    WebElement menuDropdown;

    @FindBy(xpath = "(//a[@class='button wp-element-button product_type_simple add_to_cart_button ajax_add_to_cart'])[4]")
    WebElement addWooAlbum3;


    public void clickOnAddWooAlbum3() {
        clickOn(addWooAlbum3);
        LOG.info("click on woo Album button success");

    }

    public void selectOptionFromMenuDropdown(String option){
        selectOptionFromDropdown(menuDropdown, option);
        LOG.info(option+" option selected from the dropdown");
    }




}


