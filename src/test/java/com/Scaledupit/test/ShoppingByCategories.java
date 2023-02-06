package com.Scaledupit.test;

import base.CommonAPI;
import com.Scaledupit.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class ShoppingByCategories extends CommonAPI {

    Logger LOG = LogManager.getLogger(ShoppingByCategories.class.getName());

    @Test
    public void shoppingByCategories() throws InterruptedException {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        homePage.clickOnCategoryButton();
        homePage.clickOnMenCollection();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Men Collection – Automation");
        LOG.info("collection Men page title validation success");

        MenCollectionPage menCollectionPage  = new MenCollectionPage(getDriver());
        menCollectionPage.clickOnAddTieButton();
        menCollectionPage.clickOnCategoryButton();
        menCollectionPage.clickOnMusic();
        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Music – Automation");
        LOG.info("music page title validation success");
        MusicPage musicPage = new MusicPage(getDriver());

        musicPage.selectOptionFromMenuDropdown("Sort by latest");
        musicPage.clickOnAddWooAlbum3();
    }

}
