package com.Magento.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageMagento extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePageMagento.class.getName());

    public HomePageMagento(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //object
    @FindBy(xpath = "//input[@id='search']")
    WebElement searchField;

    @FindBy(xpath = "//button[@class='action search']")
    WebElement searchButton;


    @FindBy(xpath = "(//li[@class='authorization-link']//preceding-sibling::a)[1]")
    WebElement signinButton;

    @FindBy(xpath = "(//span[text()='Welcome, samia iddir!'])[1]")
    WebElement headerText;

    @FindBy(xpath = "(//li[@class='authorization-link']//following::li/a)[1]")
    WebElement createanAccountButton;


    @FindBy(xpath = "//a[@class='action showcart']")
    WebElement cartButton;
    @FindBy(xpath = "//span[text()='Gear']")
    WebElement gearFloatingMenu;

    @FindBy(xpath = "//span[text()='Fitness Equipment']")
    WebElement fitnessEquipment;
    @FindBy (xpath = "//span[text()='Sale']")
    WebElement saleButton;



    //reusable steps
    public void typeItemToSearch(String item){
        type(searchField, item);
        LOG.info("item name type success");
    }
    public void clickOnSearchButton(){
        clickOn(searchButton);
        LOG.info("click search success");
    }
    public void searchItem(String item){
        typeAndEnter(searchField, item);
        LOG.info("item name type and enter success");
    }

    public void clickOnSigninButton(){
        clickOn(signinButton);
        LOG.info("click on signin button success");
    }
    public void clickOnCartButton(){
        clickOn(cartButton);
        LOG.info("click on cart button success");
    }

    public void clickOnAddToCartButton(WebDriver driver){
        clickWithActions(driver, cartButton);
        LOG.info("click cart button success");
    }
    public void clickOnCreateanAccountButton(){
        clickOn(createanAccountButton);
        LOG.info("click signin button success");
    }
    public void hoverOverFloatingMenu(WebDriver driver){
        hoverOver(driver, gearFloatingMenu);
        LOG.info("Gear hover over menu success");
    }
    public void clickOnFitnessEquipment(){
        clickOn(fitnessEquipment);
        LOG.info("click fitness Equipment success");
    }

    public void ClickOnSaleButton(){
        clickOn(saleButton);
        LOG.info("click fitness Equipment success");
    }

    public String getHeaderText(){

        return getTextFromElement(headerText);
    }

}
