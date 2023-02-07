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
    @Test
    public void AdvancedSearch() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        AdvancedSearchPage advancedSearchPage=new AdvancedSearchPage(getDriver());

        homePage.clickOnAdvancedSearchButton();

        String title1= getCurrentTitle();
        Assert.assertEquals(title1, "Advanced Search Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Advanced Search title page validation success");
        advancedSearchPage.typeProductName("pant");
        advancedSearchPage.typeSKU("pant");
        advancedSearchPage.typeDescription("large pant");
        advancedSearchPage.typeShortDescription("Black");
        advancedSearchPage.typePriceMinimum("20");
        advancedSearchPage.typePriceMaximum("70");
        advancedSearchPage.clickOnSearchButton();
        String errorMessage = advancedSearchPage.geterrorMessage();
        Assert.assertEquals(errorMessage, "We can't find any items matching these search criteria. Modify your search.");

    }
}
