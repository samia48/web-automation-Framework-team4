package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.CreateNewEventPage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewEventTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateNewEventTest.class.getName());

    @Test
    public void CreateNewEventVerify() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        CreateNewEventPage eventPage = new CreateNewEventPage(getDriver());

        loginPage.clickOnLoginBtn();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();

        eventPage.setHoverOverLeftMenu(getDriver());
        Thread.sleep(2000);
        eventPage.clickOnCalenderIcon();
        Thread.sleep(2000);
        eventPage.clickOnCreateBtn();
        Thread.sleep(2000);
        eventPage.clickOnCancelButton();
        Thread.sleep(2000);
        eventPage.clickOnCreateBtn();
        Thread.sleep(2000);
        eventPage.typeOnTitleField("New Year Event");
        Thread.sleep(2000);
        eventPage.clickOnSaveButton();
    }

}
