package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.CreateNewCallPage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewCallTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateNewCallTest.class.getName());

    @Test
    public void CreateNewCallVerify() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        CreateNewCallPage callPage = new CreateNewCallPage(getDriver());

        loginPage.clickOnLoginBtn();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();

        callPage.setHoverOverLeftMenu(getDriver());
        callPage.clickOnCallIcon();
        Thread.sleep(3000);
        callPage.clickOnCreateBtn();
        Thread.sleep(3000);
        callPage.ClickOnCallTimeBox();
        Thread.sleep(2000);
        callPage.enterDateAndTime("31/12/8764 23:00");
        Thread.sleep(2000);
        callPage.clickOnSaveButton();







    }
}
