package com.FreeCRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(DropDownPage.class.getName());
    public DropDownPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//li//a[contains(text(),'CRM')])[1]")
    WebElement crm;

    @FindBy(xpath = "//li/a[contains(text(),'CRM for Any Business')]")
    WebElement dropDownLink;


    public void hoverOverCrm(WebDriver driver){
        hoverOver(driver, crm);
        LOG.info("hover over menu success");
    }

    public void clickOnDropDown(){
        clickOn(dropDownLink);
        LOG.info("click on drop down link success");
    }
}
