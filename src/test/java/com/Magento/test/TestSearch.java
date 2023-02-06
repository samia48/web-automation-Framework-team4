package com.Magento.test;

import base.CommonAPI;
import com.Magento.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;
import utility.ReadFromExcel;

public class TestSearch extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestCheckOutCompareList.class.getName());

    ReadFromExcel read = new ReadFromExcel("D:\\BootCamp Selenium\\web-automation-framework-team4\\data\\titles.xlsx", "Magento");

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
        watchPageMagento.hoverOverItem1(getDriver());
        watchPageMagento.clickOnAddToCompareButton1();
        String confirmation = watchPageMagento.getconfirmationMessage();
        Assert.assertEquals(confirmation, "You added product Dash Digital Watch to the comparison list.");
        Thread.sleep(3000);
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

    @Test
    public void searchAnItemAndAddToCart() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());

        String expectedTitle = read.getCellValueForGivenHeaderAndKey("key","home page title");
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("Sign in title page validation success");
        String item = "Bag";
        homePage.typeItemToSearch(item);
        Thread.sleep(3000);
        homePage.clickOnSearchButton();

        String expectedTitle1 = read.getCellValueForGivenHeaderAndKey("key","Bag search title");
        String actualTitle1 = getCurrentTitle();
        Assert.assertEquals(expectedTitle1, actualTitle1);

        LOG.info("search bag title page validation success");
        SearchPageMagento searchPage = new SearchPageMagento(getDriver());
        searchPage.clickOnWayfarerMessengerBag();
        WayfarerMessengerBagPageMagento wayfarerMessengerBagPageMagento=new WayfarerMessengerBagPageMagento(getDriver());
        wayfarerMessengerBagPageMagento.clickOnAddToCartButton();

    }
}
