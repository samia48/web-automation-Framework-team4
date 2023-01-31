package com.Scaledupit.test;

import base.CommonAPI;
import com.Scaledupit.pages.HomePageScaledupit;
import com.Scaledupit.pages.LoginPageScaledupit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestLogin extends CommonAPI {

    Logger LOG = LogManager.getLogger(com.Scaledupit.test.TestLogin.class.getName());

    @Test
    public void testloginvalidcredential() {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        LoginPageScaledupit loginPage = new LoginPageScaledupit(getDriver());
        homePage.clickOnMyAccountButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "My account – Automation");
        LOG.info("login title page validation success");
        String email = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
        loginPage.typeusername("username");
        loginPage.typepassword("password");
        loginPage.clickOnLoginButton();
        LOG.info("login success");
    }

    @Test
    public void testloginInvalidemail() throws InterruptedException {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        LoginPageScaledupit loginPage = new LoginPageScaledupit(getDriver());
        homePage.clickOnMyAccountButton();

        String title = getCurrentTitle();
        Assert.assertEquals(title, "My account – Automation");
        LOG.info("login title page validation success");
        loginPage.typeusername("baruamousumi@aol");
        loginPage.typepassword("asd1245");
        loginPage.clickOnLoginButton();
        String error = loginPage.getErrorMessage();
        Assert.assertEquals(error, "Error: The username baruamousumi@aol is not registered on this site. If you are unsure of your username, try your email address instead.");
        LOG.info("error message validation success");

    }




}




