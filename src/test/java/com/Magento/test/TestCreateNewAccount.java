package com.Magento.test;

import base.CommonAPI;
import com.Magento.pages.CreatenewAccountPageMagento;
import com.Magento.pages.HomePageMagento;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestCreateNewAccount extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestCreateNewAccount.class.getName());

    @Test
    public void validCredentials() {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        homePage.clickOnCreateanAccountButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Create New Customer Account Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("create an account title page validation success");
        CreatenewAccountPageMagento createnewAccountPageMagento = new CreatenewAccountPageMagento(getDriver());
        String email = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        createnewAccountPageMagento.typeFirstName("FirstName");
        createnewAccountPageMagento.typeLastName("LastName");
        createnewAccountPageMagento.typeEmailAddress(email);
        createnewAccountPageMagento.typePassword("password");
        createnewAccountPageMagento.typeConfirmPassword("password");
        createnewAccountPageMagento.clickOnCreateanAccountButton();
        LOG.info("Creation of an account success");
    }

    @Test
    public void InvalidCredentials() {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        homePage.clickOnCreateanAccountButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Create New Customer Account Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("create an account title page validation success");
        CreatenewAccountPageMagento createnewAccountPageMagento = new CreatenewAccountPageMagento(getDriver());
        String email = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
        createnewAccountPageMagento.typeFirstName("FirstName");
        createnewAccountPageMagento.typeLastName("LastName");
        createnewAccountPageMagento.typeEmailAddress("invalidEmailAdress");
        createnewAccountPageMagento.typePassword("password");
        createnewAccountPageMagento.typeConfirmPassword("password");
        createnewAccountPageMagento.clickOnCreateanAccountButton();
        String error = createnewAccountPageMagento.getErrorMessage();
        LOG.info("Failing Creation of an account success");
    }
}
