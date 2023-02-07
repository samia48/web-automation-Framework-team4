package com.Scaledupit.test;

import base.CommonAPI;
import com.Scaledupit.pages.HomePageScaledupit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDiscountSales extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestDiscountSales.class.getName());

    @Test
    public void DiscountSales() throws InterruptedException {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        homePage.clickOnShopNowButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Products – Automation");
        LOG.info("Discount sales page validation success");
    }
}

