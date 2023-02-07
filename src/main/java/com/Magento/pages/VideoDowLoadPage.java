package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VideoDowLoadPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(VideoDowLoadPage.class.getName());
    public VideoDowLoadPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //objects
    @FindBy (xpath = "//div[@class='message info empty']")
    WebElement errorMessage ;



    public String geterrorMessage(){

        return getTextFromElement(errorMessage);
    }
}
