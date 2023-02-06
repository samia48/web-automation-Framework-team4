package com.Scaledupit.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuitarPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(GuitarPage.class.getName());

    public GuitarPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //objects

    @FindBy(xpath = "//input[@class='submit']")
    WebElement submitButton;
    @FindBy(xpath = "//li[@id='tab-title-reviews']/a")
    WebElement reviewButton;
    @FindBy(xpath = "//a[@class='star-5']")
    WebElement ratingButton;
    @FindBy(id = "comment")
    WebElement reviewField;



    //reusable methods
    public void clickOnSubmitButton() {
        clickOn(submitButton);
        LOG.info("click on submit button success");

    }

    public void clickReviewButton() {
        clickOn(reviewButton);
        LOG.info("click on submit button success");

    }

    public void clickRating() {
        clickOn(ratingButton);
        LOG.info("click on Rating button success");

    }

    public void typeReview(String review) {
        type(reviewField, review);
        LOG.info("type review success");
    }

}



