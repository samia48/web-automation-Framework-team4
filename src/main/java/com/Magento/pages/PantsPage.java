package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PantsPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(PantsPage.class.getName());

    public PantsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//li[@class='item'])[21]")
    WebElement ColdButton;

    @FindBy(xpath = "(//div[@class='filter-options-title'])[11]")
    WebElement ClimatBbutton;
    @FindBy(xpath = "(//li[@class='item'])[1]")
    WebElement BaseLayerButton;
    @FindBy (xpath = "(//div[@class='filter-options-title'])[1]")
    WebElement StyleButton;


    public void clickOnStyleButton(){
        clickOn(StyleButton);
        LOG.info("click On Style Button success");
    }
    public void selectOptionFromMenuDropdown(String option){
        selectOptionFromDropdown(StyleButton, option);
        LOG.info(option+" option selected from the dropdown");
    }

    public void clickOnBaseLayerButton(){
        clickOn(BaseLayerButton);
        LOG.info("click On Base Layer Button success");
    }

    public void clickOnClimatBbutton(){
        clickOn(ClimatBbutton);
        LOG.info("click On Climat Bbutton success");
    }
    public void clickOnColdButton(){
        clickOn(ColdButton);
        LOG.info("click On Cold Button success");
    }

}
