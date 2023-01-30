package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchPageMagento extends CommonAPI {
    Logger LOG = LogManager.getLogger(SigninPageMagento.class.getName());
    public WatchPageMagento(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //objects
    @FindBy(xpath = "//img[@alt='Dash Digital Watch']")
    WebElement Item1;

    @FindBy(xpath = "(//a[@class='action tocompare'])[2]")
    WebElement addToCompareButton1;
    @FindBy(xpath = "//img[@alt='Aim Analog Watch']")
    WebElement Item2;

    @FindBy(xpath = "(//a[@class='action tocompare'])[9]")
    WebElement addToCompareButton2;
    @FindBy(xpath = "//a[@class='action compare primary']")
    WebElement CompareButton;
    @FindBy(xpath = "//div[@class='message-success success message']//preceding-sibling::div")
    WebElement confirmation;
    @FindBy(xpath = "//div[text()='You added product Aim Analog Watch to the ']")
    WebElement confirmation1;

    //reusable methods
    public void hoverOverItem1(WebDriver driver){
        waitForElementToBeVisible(driver, 10, Item1);
        hoverOver(driver,Item1);
        LOG.info("hover over Item1 success");
    }
    public void hoverOverItem2(WebDriver driver){
        waitForElementToBeVisible(driver, 10, Item2);
        hoverOver(driver,Item2);
        LOG.info("hover over Item2 success");
    }
    public void clickOnAddToCompareButton1(){
        clickOn(addToCompareButton1);
        LOG.info("click on add to compare button success");
    }
    public String getconfirmationMessage(){
        return getTextFromElement(confirmation);
    }
    public String getconfirmationMessage1(){
        return getTextFromElement(confirmation1);
    }
    public void clickOnAddToCompareButton2(){
        clickOn(addToCompareButton2);
        LOG.info("click on add to compare button success");
    }
    public void clickOnCompareButton(){
        clickOn(CompareButton);
        LOG.info("click on compare button success");
    }

}
