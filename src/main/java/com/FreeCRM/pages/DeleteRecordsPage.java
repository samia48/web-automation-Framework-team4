package com.FreeCRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteRecordsPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(DeleteRecordsPage.class.getName());
    public DeleteRecordsPage(WebDriver driver) { PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//i[@class='trash alternate outline icon']")
    WebElement trashIcon;

    @FindBy(xpath = "(//a[@class='item'])[18]")
    WebElement contactIcon;


    @FindBy(xpath = "(//div[@class='ui fitted checkbox'])[2]")
    WebElement selectIcon;

    @FindBy(xpath = "//button[@class='ui negative button']")
    WebElement removeIcon;

    @FindBy(xpath = "//button[@class='ui primary button']")
    WebElement okButton;

    public void clickOnTrashIcon(){
        clickOn(trashIcon);
        LOG.info("click on trash success");
    }

    public void clickOnContactIcon(){
        clickOn(contactIcon);
        LOG.info("click on contacts success");
    }

    public void clickOnSelectIcon(){
        clickOn(selectIcon);
        LOG.info("click on select success");
    }

    public void clickOnRemoveIcon(){
        clickOn(removeIcon);
        LOG.info("click on remove icon success");
    }

    public void clickOnOkButton(){
        clickOn(okButton);
        LOG.info("click on ok button success");
    }

}
