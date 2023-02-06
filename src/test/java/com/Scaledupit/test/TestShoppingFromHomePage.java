package com.Scaledupit.test;

import base.CommonAPI;
import com.Scaledupit.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestShoppingFromHomePage extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestShoppingFromHomePage.class.getName());
    @Test
    public void HomePageProducts() throws InterruptedException {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        homePage.clickOnMyAccountButton();
        LoginPageScaledupit loginPage = new LoginPageScaledupit(getDriver());

        String title0 = getCurrentTitle();
        Assert.assertEquals(title0, "My account – Automation");
        LOG.info("login title page validation success");
        String username = ConnectDB.getTableColumnData("select * from cred", "username").get(0);
        loginPage.typeusername(username);
        String password = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
        loginPage.typepassword(password);
        loginPage.clickOnLoginButton();
        LOG.info("login success");
        loginPage.clickOnHomeButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Automation – Automate eCommerce");
        LOG.info("login title page validation success");

        homePage.clickOnBagCollection();
        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Bag Collection – Automation");
        LOG.info("collection Bag page title validation success");

        CollectionBagPage collectionBagPage  = new CollectionBagPage(getDriver());
        collectionBagPage.clickOnAddToCartButton();
        collectionBagPage.clickOnViewCartButton();

        String title2 = getCurrentTitle();
        Assert.assertEquals(title2, "Cart – Automation");
        LOG.info("cart page title validation success");
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.clickOnProceedToCheckoutButton();

        String title3 = getCurrentTitle();
        Assert.assertEquals(title3, "Checkout – Automation");
        LOG.info("checkout page title validation success");
        CheckOutPage checkOutPage = new CheckOutPage(getDriver());
        Thread.sleep(3000);
        checkOutPage.clickOnPlaceOrderButton();
        checkOutPage.getInfoMessage();


    }


    @Test
    public void UpdateCartandCheckOut() throws InterruptedException {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        homePage.clickOnMyAccountButton();
        LoginPageScaledupit loginPage = new LoginPageScaledupit(getDriver());

        String title0 = getCurrentTitle();
        Assert.assertEquals(title0, "My account – Automation");
        LOG.info("login title page validation success");
        String username = ConnectDB.getTableColumnData("select * from cred", "username").get(0);
        loginPage.typeusername(username);
        String password = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
        loginPage.typepassword(password);
        loginPage.clickOnLoginButton();
        LOG.info("login success");
        loginPage.clickOnHomeButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Automation – Automate eCommerce");
        LOG.info("login title page validation success");


        homePage.clickOnViewAll();
        homePage.clickOnAddGuitar();
        homePage.clickOnAddHoodie();
        homePage.clickOnViewCart();

        String title2 = getCurrentTitle();
        Assert.assertEquals(title2, "Cart – Automation");
        LOG.info("cart page title validation success");
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.clickOnQuantityButton();
        shoppingCartPage.clickOnDeleteButton();
        Thread.sleep(3000);
        shoppingCartPage.clickOnUpdateCartButton();
        shoppingCartPage.clickOnProceedToCheckoutButton();

        String title3 = getCurrentTitle();
        Assert.assertEquals(title3, "Checkout – Automation");
        LOG.info("checkout page title validation success");
        CheckOutPage checkOutPage = new CheckOutPage(getDriver());
        Thread.sleep(3000);
        checkOutPage.clickOnPlaceOrderButton();
        checkOutPage.getInfoMessage();


    }


}
