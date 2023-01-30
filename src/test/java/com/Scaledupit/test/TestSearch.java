package com.Scaledupit.test;

import base.CommonAPI;
import com.Scaledupit.pages.HomePageScaledupit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI {

        Logger LOG = LogManager.getLogger(TestSearch.class.getName());

        @Test
        public void searchproduct() throws InterruptedException {
            HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
            homePage.typeItemToSearch("shirt");
            homePage.clickOnSearchButton();
            String title = getCurrentTitle();
            Assert.assertEquals(title, "Search Results for “shirt” – Automation");
            LOG.info("shirt search title validation success");
        }

    }


