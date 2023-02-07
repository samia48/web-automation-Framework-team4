package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.CreateNewCampaignPage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewCampaignTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateNewCampaignTest.class.getName());

    @Test
    public void CreateNewCampaignVerify() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        CreateNewCampaignPage campaignPage = new CreateNewCampaignPage(getDriver());

        //loginPage.clickOnLoginBtn();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();

        campaignPage.setHoverOverLeftMenu(getDriver());
        campaignPage.clickOnCampaigns();
        Thread.sleep(2000);
        campaignPage.clickOnCreateBtn();
        Thread.sleep(2000);
        campaignPage.typeOnNameField("My New Campaign");
        Thread.sleep(2000);
        campaignPage.clickOnSaveButton();
    }
}
