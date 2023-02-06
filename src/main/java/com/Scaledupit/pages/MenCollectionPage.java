package com.Scaledupit.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenCollectionPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(MenCollectionPage.class.getName());

    public MenCollectionPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //objects

    @FindBy(xpath = "//a[@class='special-menu']")
    WebElement categoryButton;
    @FindBy(xpath = "//a[text()='Music']")
    WebElement MusicButton;

    @FindBy(xpath = "(//a[@class='button wp-element-button product_type_simple add_to_cart_button ajax_add_to_cart'])[4]")
    WebElement addTieButton;


    public void clickOnCategoryButton() {
        clickOn(categoryButton);
        LOG.info("click on category success");

    }

    public void clickOnAddTieButton() {
        clickOn(addTieButton);
        LOG.info("click on Tie button success");

    }
    public void clickOnMusic() {
        clickOn(MusicButton);
        LOG.info("click on music button success");

    }



}
