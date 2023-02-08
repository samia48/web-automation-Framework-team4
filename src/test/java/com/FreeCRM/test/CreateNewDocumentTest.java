package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.CreateNewDocumentPage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewDocumentTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateNewDocumentTest.class.getName());

    @Test
    public void CreateNewDocumentVerify() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        CreateNewDocumentPage documentPage = new CreateNewDocumentPage(getDriver());

        loginPage.clickOnLoginBtn();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();

        documentPage.setHoverOverLeftMenu(getDriver());
        documentPage.clickOnDocuments();
        Thread.sleep(3000);
        documentPage.clickOnCreateBtn();
        Thread.sleep(3000);
        documentPage.clickOnCancelButton();
        Thread.sleep(2000);
        documentPage.clickOnCreateBtn();
        Thread.sleep(2000);
        documentPage.typeTitleName("All Documents of 2022");
        Thread.sleep(2000);
        documentPage.clickOnSaveButton();
    }
}
