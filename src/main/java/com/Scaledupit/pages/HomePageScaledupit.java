package com.Scaledupit.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class HomePageScaledupit extends CommonAPI {
    Logger LOG = LogManager.getLogger(com.Scaledupit.pages.HomePageScaledupit.class.getName());

    public HomePageScaledupit(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //object
    @FindBy(xpath = "//a[@class='my-account']")
    WebElement MyAccountButton;

    @FindBy(xpath = "//input[@id='wp-block-search__input-1']")
    WebElement SearchField;

    @FindBy(xpath = "//button[@class='wp-block-search__button has-icon wp-element-button']")
    WebElement searchButton;
    @FindBy(xpath = "//a[@class='slicknav_btn slicknav_collapsed']")
    WebElement slickNavMenuButton;
    @FindBy(xpath = "(//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-308'])[2]")
    WebElement ShopButton;
    @FindBy(xpath = "(//div[@class='slider-desc']/div/div/a)[2]")
    WebElement BagCollection;
    @FindBy(xpath = "(//a[@class='button wp-element-button product_type_simple add_to_cart_button ajax_add_to_cart'])[8]")
    WebElement addguitar;
    @FindBy(xpath = "(//a[@class='button wp-element-button product_type_simple add_to_cart_button ajax_add_to_cart'])[12]")
    WebElement addhoodie;
    @FindBy(xpath = "(//a[text()='View cart'])[2]")
    WebElement viewcart;
    @FindBy(xpath = "//a[text()='View All']")
    WebElement viewAllButton;
    @FindBy(xpath = "//a[@class='at-wc-icon cart-icon']")
    WebElement cartButton;
    @FindBy(xpath = "//a[@class='remove remove_from_cart_button']")
    WebElement deleteButton;
    @FindBy(xpath = "//a[@class='special-menu']")
    WebElement categoryButton;
    @FindBy(xpath = "(//a[text()='Men Collection'])[1]")
    WebElement menCollection;
    @FindBy(xpath = "(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link']/img)[41]")
    WebElement guitar;

    //reusable steps
    public void clickOnMyAccountButton() {
        clickOn(MyAccountButton);
        LOG.info("click on login button success");
    }

    public void typeItemToSearch(String item) {
        type(SearchField, item);
        LOG.info("item name type success");
    }

    public void clickOnSearchButton() {
        clickOn(searchButton);
        LOG.info("click search success");
    }

    public void clickOnslickNavMenuButton() {
        clickOn(slickNavMenuButton);
        LOG.info("click slick Nav Menu Button success");
    }

    public void clickOnShopButton() {
        clickOn(ShopButton);
        LOG.info("click on shop Button success");

    }

    public void clickOnBagCollection() {
        clickOn(BagCollection);
        LOG.info("click on bag collection success");

    }

    public void clickOnAddGuitar() {
        clickOn(addguitar);
        LOG.info("click on add guitar success");

    }

    public void clickOnAddHoodie() {
        clickOn(addhoodie);
        LOG.info("click on add hoodie success");

    }

    public void clickOnViewCart() {
        clickOn(viewcart);
        LOG.info("click on view cart success");

    }

    public void clickOnViewAll() {
        clickOn(viewAllButton);
        LOG.info("click on view all success");

    }

    public void hoverOverCartButton(WebDriver driver) {
        waitForElementToBeVisible(driver, 10, cartButton);
        hoverOver(driver, cartButton);
        LOG.info("hover over cart Button success");
    }


    public void clickOnDeleteButton() {
        clickOn(deleteButton);
        LOG.info("click on delete success");

    }

    public void clickOnCategoryButton() {
        clickOn(categoryButton);
        LOG.info("click on category success");

    }

    public void clickOnMenCollection() {
        clickOn(menCollection);
        LOG.info("click on men collection button success");

    }
    public void clickOnGuitar() {
        clickOn(guitar);
        LOG.info("click on guitar success");

    }




}