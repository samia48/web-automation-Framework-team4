package com.Magento.test;

import base.CommonAPI;
import com.Magento.pages.HomePageMagento;
import com.Magento.pages.SigninPageMagento;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestEditAccountInformation extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestEditAccountInformation.class.getName());

    @Test
    public void EditAccountInformation() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
        homePage.clickOnSigninButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Sign in title page validation success");

        signinPageMagento.typeEmailAddress("email1@yahoo.fr");
        signinPageMagento.typePassword("password@1234");

        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        homePage.getHeaderText();
        LOG.info("Signin success");
        homePage.clickOnDropDown();
        homePage.clickOnMyAccount();
        String title2= getCurrentTitle();
        Assert.assertEquals(title2 , "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("My Account  title page validation success");
        //myAccountPage.clickOnEditButton();(//span[text()='Edit'])[2]
          //      Account Information Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites
            //    accountInformation.clickOnChangePassWord();(//input[@class='checkbox'])[2]
             //   accountInformation.clickOnCurrentPassword();//input[@id='current-password']
       // accountInformation.clickOnNewPassword();//input[@id='password']
       // accountInformation.clickOnConfirmNewPassword();//input[@id='password-confirmation']


    }
}
