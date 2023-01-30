package com.Magento.test;

import base.CommonAPI;
import com.Magento.pages.HomePageMagento;
import com.Magento.pages.SearchPageMagento;
import com.Magento.pages.WayfarerMessengerBagPageMagento;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckOutShoppingCart extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestCheckOutShoppingCart.class.getName());

    @Test
    public void addToCartAnItem() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        homePage.clickOnSigninButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("login title page validation success");
        String item = "Bag";
        homePage.typeItemToSearch(item);
        homePage.clickOnSearchButton();
        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Search results for: 'Bag' Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("search bag title page validation success");
        //add a product"Wayfarer Messenger Bag" to the cart
        SearchPageMagento searchPage = new SearchPageMagento(getDriver());
        searchPage.clickOnWayfarerMessengerBag();
        WayfarerMessengerBagPageMagento wayfarerMessengerBagPageMagento=new WayfarerMessengerBagPageMagento(getDriver());
        wayfarerMessengerBagPageMagento.clickOnAddToCartButton();



    }
}
