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

public class TestSignOut extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestCheckOutCompareList.class.getName());

    ReadFromExcel read = new ReadFromExcel("D:\\BootCamp Selenium\\web-automation-framework-team4\\data\\titles.xlsx", "Magento");

    @Test
    public void signOutFromHomepage() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
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

        homePage.clickOnDropDown();
        homePage.clickOnSignOut();
    }


}
