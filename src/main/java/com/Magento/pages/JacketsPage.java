package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JacketsPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(JacketsPage.class.getName());

    public JacketsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='toolbar-sorter sorter']/select")
    WebElement sortByDropDown;

    @FindBy(xpath = "(//a[@class='modes-mode mode-grid'])[1]")
    WebElement GridButton;
    @FindBy(xpath = "(//a[@class='modes-mode mode-list'])[1]")
    WebElement ListButton;
    @FindBy (xpath = "(//button[@class='action switch'])[1]")
    WebElement DropDown;
    @FindBy(xpath = "(//li[@class='authorization-link']//preceding-sibling::a)[1]")
    WebElement signinButton;
    @FindBy (xpath = "//li[@class='authorization-link']/a")
    WebElement SignOut;



    public void clickOnSigninButton(){
        clickOn(signinButton);
        LOG.info("click on signin button success");
    }

    public void clickOnDropDown(){
        clickOn(DropDown);
        LOG.info("click DropDown Button success");
    }

    public void clickOnSignOut(){
        clickOn(SignOut);
        LOG.info("click Sign out Button success");
    }
    public void clicKOnList(){
        clickOn(ListButton);
        LOG.info("click Sign out Button success");
    }

    public void clicKOnGrid(){
        clickOn(GridButton);
        LOG.info("click grid Button success");
    }
    public void clicKOnSortByDropDown(){
        clickOn(sortByDropDown);
        LOG.info("click sort By success");
    }


}
