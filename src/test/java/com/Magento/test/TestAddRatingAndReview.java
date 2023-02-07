package com.Magento.test;

import base.CommonAPI;
import com.Magento.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;
import utility.ReadFromExcel;

public class TestAddRatingAndReview extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestAddRatingAndReview.class.getName());

    ReadFromExcel read = new ReadFromExcel("D:\\BootCamp Selenium\\web-automation-framework-team4\\data\\titles.xlsx", "Magento");

    @Test
    public void AddThefirstratingAndReview() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
        ShopNewYogaPage shopNewYogaPage = new ShopNewYogaPage(getDriver());
        ElisaEverCoolTeePage elisaEverCoolTeePage = new ElisaEverCoolTeePage(getDriver());

        homePage.clickOnSigninButton();
        String expectedTitle = read.getCellValueForGivenHeaderAndKey("key", "login page title");
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        String email = ConnectDB.getTableColumnData("select * from cred", "email").get(0);
        signinPageMagento.typeEmailAddress(email);
        String password = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
        signinPageMagento.typePassword(password);
        signinPageMagento.clickOnSigninButton();
        String expectedTitle1 = read.getCellValueForGivenHeaderAndKey("key", "home page title");
        String actualTitle1 = getCurrentTitle();
        Assert.assertEquals(expectedTitle1, actualTitle1);
        LOG.info("Signin success");
        homePage.clickOnShopNewYoga();

        String title2= getCurrentTitle();
        Assert.assertEquals(title2, "New Luma Yoga Collection Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("shop New Yoga  title page validation success");

        shopNewYogaPage.clickOnElisaEverCoolTee();
        String title3= getCurrentTitle();
        Assert.assertEquals(title3, "Elisa EverCool™ Tee Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Elisa ever cool Tee  title page validation success");
        Thread.sleep(3000);
        elisaEverCoolTeePage.clickOnReviews();
        elisaEverCoolTeePage.hoverOverRatingButton(getDriver());

        elisaEverCoolTeePage.typeSummary("Nice product");
        Thread.sleep(3000);
        elisaEverCoolTeePage.typeReview("Perfect");
        elisaEverCoolTeePage.clickOnSubmitReview();

    }
    @Test
    public void AddratingAndReview() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
        ShopNewYogaPage shopNewYogaPage = new ShopNewYogaPage(getDriver());
        LaylaTeePage laylaTeePage = new LaylaTeePage(getDriver());

        homePage.clickOnSigninButton();
        String expectedTitle = read.getCellValueForGivenHeaderAndKey("key", "login page title");
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        String email = ConnectDB.getTableColumnData("select * from cred", "email").get(0);
        signinPageMagento.typeEmailAddress(email);
        String password = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
        signinPageMagento.typePassword(password);
        signinPageMagento.clickOnSigninButton();
        String expectedTitle1 = read.getCellValueForGivenHeaderAndKey("key", "home page title");
        String actualTitle1 = getCurrentTitle();
        Assert.assertEquals(expectedTitle1, actualTitle1);
        LOG.info("Signin success");
        homePage.clickOnShopNewYoga();

        String title2= getCurrentTitle();
        Assert.assertEquals(title2, "New Luma Yoga Collection Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("shop New Yoga  title page validation success");
        shopNewYogaPage.hoverOverLaylaTee(getDriver());
        shopNewYogaPage.clickOnReviews();

        String title3= getCurrentTitle();
        Assert.assertEquals(title3, "Layla Tee Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Layla Tee  title page validation success");
        Thread.sleep(3000);
        laylaTeePage.hoverOverRatingButton(getDriver());;
        laylaTeePage.typeSummary("Light, comfy");
        laylaTeePage.typeReview("This shirt is pretty good!");
        laylaTeePage.clickOnSubmitReview();

    }
}
