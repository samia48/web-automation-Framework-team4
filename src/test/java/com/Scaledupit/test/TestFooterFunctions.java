package com.Scaledupit.test;

import base.CommonAPI;
import com.Scaledupit.pages.HomePageScaledupit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFooterFunctions extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestFooterFunctions.class.getName());

    @Test
    public void TestNewArrival() {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        homePage.clickOnNewArrivalButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "New Arrival – Automation");
        LOG.info("New arrival page validation success");
    }

    @Test
    public void TestBlogButton() {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        homePage.clickOnBlogButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Blog – Automation");
        LOG.info("Blog page validation success");
    }


}

