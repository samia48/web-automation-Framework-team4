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
import utility.ReadFromExcel;

public class TestCheckOutCompareList extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestCheckOutCompareList.class.getName());
    ReadFromExcel read = new ReadFromExcel("D:\\BootCamp Selenium\\web-automation-framework-team4\\data\\titles.xlsx", "Magento");

    @Test
    public void CheckOutCompareList() throws InterruptedException {
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
        Thread.sleep(3000);
        homePage.ClickOnCompareProductsButton();
        String title3 = getCurrentTitle();
        Assert.assertEquals(title3, "Products Comparison List - Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Compare Products title page validation success");
        Thread.sleep(3000);

        compareWatchPage.clickOnRemoveProductButton();
        compareWatchPage.clickOnOkButton(getDriver());
        Thread.sleep(3000);

        compareWatchPage.clickOnAddToCartButton();
    }
    @Test
    public void searchAndCompareTwoItems() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        WatchPageMagento watchPageMagento = new WatchPageMagento(getDriver());
        CompareWatchPage compareWatchPage = new CompareWatchPage(getDriver());
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
        homePage.clickOnSigninButton();
        String expectedTitle = read.getCellValueForGivenHeaderAndKey("key","login page title");

        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        String email = ConnectDB.getTableColumnData("select * from cred","email").get(0);
        signinPageMagento.typeEmailAddress(email);
        String password = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        signinPageMagento.typePassword(password);
        signinPageMagento.clickOnSigninButton();

        String expectedTitle1 = read.getCellValueForGivenHeaderAndKey("key","home page title");
        String actualTitle1 = getCurrentTitle();
        Assert.assertEquals(expectedTitle1, actualTitle1);
        LOG.info("Signin success");

        homePage.searchItem("watch");
        String expectedTitle2 = read.getCellValueForGivenHeaderAndKey("key","wath search title");
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(expectedTitle2, actualTitle2);
        LOG.info("searchwatch title page validation success");
        Thread.sleep(3000);
        watchPageMagento.hoverOverItem1(getDriver());
        watchPageMagento.clickOnAddToCompareButton1();
        String confirmation = watchPageMagento.getconfirmationMessage();
        Assert.assertEquals(confirmation, "You added product Dash Digital Watch to the comparison list.");

        watchPageMagento.hoverOverItem2(getDriver());
        watchPageMagento.clickOnAddToCompareButton2();

        String confirmation1 = watchPageMagento.getconfirmationMessage1();
        Assert.assertEquals(confirmation1, "You added product Aim Analog Watch to the comparison list.");
        watchPageMagento.clickOnCompareButton();
        String expectedTitle3 = read.getCellValueForGivenHeaderAndKey("key","compare product page title");
        String actualTitle3 = getCurrentTitle();
        Assert.assertEquals(expectedTitle3, actualTitle3);
        LOG.info("Compare Products title page validation success");
    }
}
