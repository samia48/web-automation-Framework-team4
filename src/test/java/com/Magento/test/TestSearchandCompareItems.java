package com.Magento.test;

import base.CommonAPI;
import com.Magento.pages.CompareWatchPage;
import com.Magento.pages.HomePageMagento;
import com.Magento.pages.WatchPageMagento;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchandCompareItems extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestSearchandCompareItems.class.getName());

    @Test
    public void searchAndCompareTwoItems() {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        WatchPageMagento watchPageMagento = new WatchPageMagento(getDriver());
        CompareWatchPage compareWatchPage = new CompareWatchPage(getDriver());
        homePage.searchItem("watch");
        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Search results for: 'watch' Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("searchwatch title page validation success");
        watchPageMagento.hoverOverItem1(getDriver());
        watchPageMagento.clickOnAddToCompareButton1();
        String confirmation = watchPageMagento.getconfirmationMessage();
        Assert.assertEquals(confirmation, "You added product Dash Digital Watch to the comparison list.");
        watchPageMagento.hoverOverItem2(getDriver());
        watchPageMagento.clickOnAddToCompareButton2();
        String confirmation1 = watchPageMagento.getconfirmationMessage1();
        Assert.assertEquals(confirmation1, "You added product Aim Analog Watch to the comparison list.");
        watchPageMagento.clickOnCompareButton();
        compareWatchPage.clickOnAddToCartButton();

    }
}
