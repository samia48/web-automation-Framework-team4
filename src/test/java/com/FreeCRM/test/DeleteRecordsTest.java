package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.DeleteRecordsPage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteRecordsTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(DeleteRecordsTest.class.getName());

    @Test
    public void DeleteRecordVerify() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        DeleteRecordsPage deleteRecordPage = new DeleteRecordsPage(getDriver());

        loginPage.clickOnLoginBtn();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();

        deleteRecordPage.clickOnTrashIcon();
        Thread.sleep(2000);
        deleteRecordPage.clickOnContactIcon();
        Thread.sleep(2000);
        deleteRecordPage.clickOnSelectIcon();
        Thread.sleep(2000);
        deleteRecordPage.clickOnRemoveIcon();
        Thread.sleep(2000);
        deleteRecordPage.clickOnOkButton();

    }
}
