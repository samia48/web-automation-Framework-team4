package com.Magento.test;

import base.CommonAPI;
import com.Magento.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;
import utility.ReadFromExcel;

public class TestFonctionsProductPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestCheckOutCompareList.class.getName());

    ReadFromExcel read = new ReadFromExcel("D:\\BootCamp Selenium\\web-automation-framework-team4\\data\\titles.xlsx", "Magento");

    @Test
    public void SortingtheProducts() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        SigninPageMagento signinPageMagento= new SigninPageMagento(getDriver());
        WomenProductsPage womenPage = new WomenProductsPage(getDriver());
        JacketsPage jacketsPage=new JacketsPage(getDriver());
        homePage.clickOnWommenProducts();
        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Women Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Women title page validation success");
        womenPage.clickOnJackets();
        Thread.sleep(3000);
        String title2 = getCurrentTitle();
        Assert.assertEquals(title2, "Jackets - Tops - Women Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Jackets title page validation success");
        jacketsPage.clicKOnList();
        jacketsPage.clicKOnGrid();
        jacketsPage.clickOnSigninButton();
        String expectedTitle = read.getCellValueForGivenHeaderAndKey("key", "login page title");
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        String email = ConnectDB.getTableColumnData("select * from cred", "email").get(0);
        signinPageMagento.typeEmailAddress(email);
        String password = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
        signinPageMagento.typePassword(password);
        signinPageMagento.clickOnSigninButton();
        LOG.info("Signin success");
        jacketsPage.clickOnDropDown();
        jacketsPage.clickOnSignOut();
    }
    @Test
    public void displayingtheProducts() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        SigninPageMagento signinPageMagento= new SigninPageMagento(getDriver());
        PantsPage pantsPage = new PantsPage(getDriver());
        homePage.clickOnShopPantsToday();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Pants Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Pants title page validation success");
        pantsPage.clickOnStyleButton();
        pantsPage.clickOnBaseLayerButton();
        pantsPage.clickOnClimatBbutton();
        pantsPage.clickOnColdButton();

    }

}
