package com.Magento.test;

import base.CommonAPI;
import com.Magento.pages.HomePageMagento;
import com.Magento.pages.SigninPageMagento;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestSignin extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestSignin.class.getName());

    @Test
    public void validCredentials() {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
        homePage.clickOnSigninButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Sign in title page validation success");
        String email = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        signinPageMagento.typeEmailAddress(email);
        signinPageMagento.typePassword("password");
        signinPageMagento.clickOnSigninButton();
        LOG.info("Signin success");
    }
    @Test
    public void invalidEmailAdress() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
        homePage.clickOnSigninButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("login title page validation success");
        String email = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        signinPageMagento.typeInvalidEmailAddress("invalidEmailAdress");
        signinPageMagento.typePassword("password");
        signinPageMagento.clickOnSigninButton();
        String error = signinPageMagento.getErrorMessage();
        Assert.assertEquals(error, "Please enter a valid email address (Ex: johndoe@domain.com).");

        LOG.info("error message validation success");
    }
    @Test
    public void invalidPassword() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
        homePage.clickOnSigninButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("login title page validation success");
        String email = ConnectDB.getTableColumnData("select * from cred","email").get(0);
        signinPageMagento.typeEmailAddress(email);
        signinPageMagento.typeInvalidPassword("invalidPassword");
        signinPageMagento.clickOnSigninButton();
        String error = signinPageMagento.getErrorMessage1();
        LOG.info("error message validation success");
    }
}
