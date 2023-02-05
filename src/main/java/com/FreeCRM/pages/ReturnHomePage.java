package com.FreeCRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnHomePage extends CommonAPI {
    Logger LOG = LogManager.getLogger(ReturnHomePage.class.getName());

    public ReturnHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//li/a[contains(text(), 'About')]")
    WebElement aboutLink;


    @FindBy(xpath = "//span[text()='free']")
    WebElement homePageLogo;

    public void clickOnAbout(){
        clickOn(aboutLink);
        LOG.info("click about success");
    }

    public void clickOnHomePageLogo(){
        clickOn(homePageLogo);
        LOG.info("click home page success");
    }

}
