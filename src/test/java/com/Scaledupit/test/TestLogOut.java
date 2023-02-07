package com.Scaledupit.test;

import base.CommonAPI;
import com.Scaledupit.pages.HomePageScaledupit;
import com.Scaledupit.pages.LoginPageScaledupit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestLogOut extends CommonAPI {

    Logger LOG = LogManager.getLogger(com.Scaledupit.test.TestLogin.class.getName());

    @Test
    public void loginWithValidcredential() {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        LoginPageScaledupit loginPage = new LoginPageScaledupit(getDriver());
        homePage.clickOnMyAccountButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "My account – Automation");
        LOG.info("login title page validation success");
        String username = ConnectDB.getTableColumnData("select * from cred", "username").get(0);
        loginPage.typeusername(username);
        String password = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
        loginPage.typepassword(password);
        loginPage.clickOnLoginButton();
        LOG.info("login page success");
        loginPage.clickOnLogOut();




    }


}
