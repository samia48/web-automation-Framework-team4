package com.Scaledupit.test;

import base.CommonAPI;
import com.Scaledupit.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShopping extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestShopping.class.getName());

    @Test
    public void shopping() throws InterruptedException {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        homePage.clickOnslickNavMenuButton();
        homePage.clickOnsShopButton();

        String title = getCurrentTitle();
        Assert.assertEquals(title, "Products – Automation");
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
        CheckOutPage checkOutPage = new CheckOutPage(getDriver());
        checkOutPage.clickOnProceedToCheckoutButton();

        String title4 = getCurrentTitle();
        Assert.assertEquals(title4, "Checkout – Automation");
        LOG.info("billing page title validation success");
        BillingPage billingPage = new BillingPage(getDriver());
        billingPage.getInfoMessage();


    }

}
