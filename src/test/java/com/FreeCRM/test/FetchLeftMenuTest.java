package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FetchLeftMenuTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(LoginTest.class.getName());


    @Test
    public void invalidPasswordErrorMessage() {
        LoginPage loginPage = new LoginPage(getDriver());
        //String email = ConnectDB.getTableColumnData("select * from cred","password").get(0);

        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("TestAccount1@");
        loginPage.clickOnLoginButton();

        String error = loginPage.getErrorMessage();
        Assert.assertEquals(error, "Something went wrong...");
        LOG.info("error message validation success");

    }
}
