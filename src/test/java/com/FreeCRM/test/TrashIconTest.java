package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.HomePage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrashIconTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(TrashIconTest.class.getName());

    @Test
    public void trashIconCheckTest() throws InterruptedException{
        LoginPage loginPage = new LoginPage(getDriver());
        Logger LOG = LogManager.getLogger(HomePage.class.getName());
        //String email = ConnectDB.getTableColumnData("select * from cred","password").get(0);

        loginPage.clickOnLoginBtn();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");
        Thread.sleep(3000);

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();
        Thread.sleep(3000);

        loginPage.clickOnSettingsIcon();
        Thread.sleep(3000);
        loginPage.clickOnTrashIcon();
        Thread.sleep(3000);


    }
}
