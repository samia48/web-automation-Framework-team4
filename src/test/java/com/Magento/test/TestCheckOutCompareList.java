package com.Magento.test;

import base.CommonAPI;
import com.Magento.pages.CompareWatchPage;
import com.Magento.pages.HomePageMagento;
import com.Magento.pages.SigninPageMagento;
import com.Magento.pages.WatchPageMagento;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestCheckOutCompareList extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestCheckOutCompareList.class.getName());

    @Test
    public void searchAndCompareTwoItems() {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        WatchPageMagento watchPageMagento = new WatchPageMagento(getDriver());
        CompareWatchPage compareWatchPage = new CompareWatchPage(getDriver());
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
        homePage.clickOnSigninButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Sign in title page validation success");

        String email = ConnectDB.getTableColumnData("select * from cred","email").get(0);
        signinPageMagento.typeEmailAddress(email);
        String password = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        signinPageMagento.typePassword(password);
        signinPageMagento.clickOnSigninButton();

        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        homePage.getHeaderText();
        LOG.info("Signin success");
        homePage.ClickOnCompareProductsButton();
        String title3 = getCurrentTitle();
        Assert.assertEquals(title3, "Products Comparison List - Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Compare Products title page validation success");
        compareWatchPage.clickOnRemoveProductButton();
        compareWatchPage.clickOnOkButton(getDriver());
        compareWatchPage.clickOnAddToCartButton();
    }
}
