package com.Scaledupit.test;

import base.CommonAPI;
import com.Scaledupit.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestShoppingFromMenu extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestShoppingFromMenu.class.getName());

    @Test
    public void shoppingFromMenuButton() throws InterruptedException {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        LoginPageScaledupit loginPage = new LoginPageScaledupit(getDriver());
        homePage.clickOnMyAccountButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "My account – Automation");
        LOG.info("login title page validation success");
        String username = ConnectDB.getTableColumnData("select * from cred", "username").get(0);
        loginPage.typeusername(username);
        String password = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
        loginPage.typepassword(password);
        loginPage.clickOnLoginButton();
        LOG.info("login success");
        homePage.clickOnslickNavMenuButton();
        homePage.clickOnShopButton();

        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Products – Automation");
        LOG.info("product page title validation success");
        ShopPage shopPage  = new ShopPage(getDriver());
        shopPage.clickOnBiscuit();


        String title2 = getCurrentTitle();
        Assert.assertEquals(title2, "Biscuits – Automation");
        LOG.info("biscuit page title validation success");
        BiscuitPage biscuitPage  = new BiscuitPage(getDriver());
        biscuitPage.clickOnAddToCartButton();
        biscuitPage.clickOnCartButton();

        String title3 = getCurrentTitle();
        Assert.assertEquals(title3, "Cart – Automation");
        LOG.info("cart page title validation success");
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.clickOnProceedToCheckoutButton();

        String title4 = getCurrentTitle();
        Assert.assertEquals(title4, "Checkout – Automation");
        LOG.info("checkout page title validation success");
        CheckOutPage checkOutPage = new CheckOutPage(getDriver());
        Thread.sleep(3000);
        checkOutPage.clickOnPlaceOrderButton();
        checkOutPage.getInfoMessage();


    }

}
