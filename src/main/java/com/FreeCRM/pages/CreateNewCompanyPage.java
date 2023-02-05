package com.FreeCRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCompanyPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateNewCompanyPage.class.getName());

    public CreateNewCompanyPage(WebDriver driver){PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[@class='item-text'])[4]")
    WebElement addCompanyButton;

    @FindBy(xpath = "(//button[@class='ui linkedin button'])[3]")
    WebElement companyCreateButton;

    @FindBy(xpath = "(//input[@name='name'])[1]")
    WebElement nameField;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    WebElement saveButton;

    @FindBy(xpath = "//*[@class='trash icon']")
    WebElement deleteBtn;

    @FindBy(xpath = "(//*[@class='checkmark icon'])[2]")
    WebElement delete;

    public void clickOnAddCompanyButton(){
        clickOn(addCompanyButton);
        LOG.info("click trash icon success");
    }

    public void clickOnCompanyCreateBtn(){
        clickOn(companyCreateButton);
        LOG.info("click trash icon success");
    }

    public void typeName(String name){
        type(nameField, name);
        LOG.info("type name success");
    }

    public void clickOnSaveButton(){
        clickOn(saveButton);
        LOG.info("click trash icon success");
    }

    public void clickdeleteButton(){
        clickOn(deleteBtn);
        LOG.info("click trash icon success");
    }

    public void clickDelete(){
        clickOn(delete);
        LOG.info("click trash icon success");
    }

}
