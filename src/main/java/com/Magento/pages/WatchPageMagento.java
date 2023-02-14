package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchPageMagento extends CommonAPI {
    Logger LOG = LogManager.getLogger(WatchPageMagento.class.getName());
    public WatchPageMagento(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //objects
    @FindBy(xpath = "//img[@alt='Dash Digital Watch']")
    WebElement DashDigitalWatch;

    @FindBy(xpath = "(//a[@class='action tocompare'])[2]")
    WebElement addToCompareButton1;
    @FindBy(xpath = "(//a[@class='action tocompare'])[5]")
    WebElement addToCompareBtn1;

    @FindBy(xpath = "//img[@alt='Aim Analog Watch']")
    WebElement AimAnalogWatch;
    @FindBy(xpath = "//img[@alt='Luma Analog Watch']")
    WebElement LumaAnalogWatch;


    @FindBy(xpath = "(//a[@class='action tocompare'])[9]")
    WebElement addToCompareButton2;
    @FindBy(xpath = "(//a[@class='action tocompare'])[4]")
    WebElement addToCompareBtn2;
    @FindBy(xpath = "//a[@class='action compare primary']")
    WebElement CompareButton;
    @FindBy(xpath = "//div[@class='message-success success message']//preceding-sibling::div")
    WebElement confirmation;
    @FindBy(xpath = "//div[text()='You added product Aim Analog Watch to the ']")
    WebElement confirmation1;

    //reusable methods
    public void hoverOverItem1(WebDriver driver){
        waitForElementToBeVisible(driver, 10, DashDigitalWatch);
        hoverOver(driver,DashDigitalWatch);
        LOG.info("hover over DashDigitalWatch success");
    }
    public void hoverOverItem2(WebDriver driver){
        waitForElementToBeVisible(driver, 10, AimAnalogWatch);
        hoverOver(driver,AimAnalogWatch);
        LOG.info("hover over AimAnalogWatch success");
    }
     public void clickOnAddToCompareButton1(){
        clickOn(addToCompareButton1);
        LOG.info("click on add to compare button1 success");
    }
    public void clickOnAddToCompareBtn1(){
        clickOn(addToCompareBtn1);
        LOG.info("click on add to compare btn1 success");
    }
    public String getconfirmationMessage(){
        return getTextFromElement(confirmation);
    }
    public String getconfirmationMessage1(){
        return getTextFromElement(confirmation1);
    }
    public void clickOnAddToCompareButton2(){
        clickOn(addToCompareButton2);
        LOG.info("click on add to compare button2 success");
    }
    public void clickOnCompareButton(){
        clickOn(CompareButton);
        LOG.info("click on compare button success");
    }

    public void hoverOver(WebDriver driver){
        waitForElementToBeVisible(driver, 10, LumaAnalogWatch);
        hoverOver(driver,LumaAnalogWatch);
        LOG.info("hover over AimAnalogWatch success");
    }
    public void clickOnAddToCompareBtn2(){
        clickOn(addToCompareBtn2);
        LOG.info("click on add to compare btn2 success");
    }

}
