package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.CreateNewContactPage;
import com.FreeCRM.pages.CreateNewDealPage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewDealTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateNewDealTest.class.getName());

    @Test
    public void CreateNewDealVerify() {
        LoginPage loginPage = new LoginPage(getDriver());
        CreateNewContactPage contactPage = new CreateNewContactPage(getDriver());
        CreateNewDealPage dealPage = new CreateNewDealPage(getDriver());

        //loginPage.clickOnLoginBtn();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();

        dealPage.clickOnDeals();
        dealPage.clickOnCreateButton();
        dealPage.typeOnTitle("New Deal");
        dealPage.clickOnSaveButton();

    }
}
