package com.Scaledupit.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class HomePageScaledupit extends CommonAPI {
        Logger LOG = LogManager.getLogger(com.Scaledupit.pages.HomePageScaledupit.class.getName());
        public HomePageScaledupit(WebDriver driver){
            PageFactory.initElements(driver, this);
        }
        //object
        @FindBy(xpath = "//a[@class='my-account']")
        WebElement MyAccountButton;

        @FindBy(xpath = "//input[@id='wp-block-search__input-1']")
        WebElement SearchField;

        @FindBy(xpath = "//button[@class='wp-block-search__button has-icon wp-element-button']")
        WebElement searchButton;

        //reusable steps
        public void clickOnMyAccountButton(){
            clickOn(MyAccountButton);
            LOG.info("click on login button success");
        }

        public void typeItemToSearch(String item){
            type(SearchField, item);
            LOG.info("item name type success");
        }
        public void clickOnSearchButton(){
            clickOn(searchButton);
            LOG.info("click search success");
        }




    }


