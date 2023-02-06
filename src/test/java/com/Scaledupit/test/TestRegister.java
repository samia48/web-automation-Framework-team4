package com.Scaledupit.test;

import base.CommonAPI;
import com.Scaledupit.pages.HomePageScaledupit;
import com.Scaledupit.pages.LoginPageScaledupit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestRegister extends CommonAPI {

    Logger LOG = LogManager.getLogger(com.Scaledupit.test.TestLogin.class.getName());
    @Test
    public void testRegistervalidCredential() {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        LoginPageScaledupit loginPage = new LoginPageScaledupit(getDriver());
        homePage.clickOnMyAccountButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "My account – Automation");
        LOG.info("Registration title page validation success");
        String EmailAddress = ConnectDB.getTableColumnData("select * from cred", "EmailAddress").get(0);
        loginPage.typeusername(EmailAddress);
        String passwordRegister = ConnectDB.getTableColumnData("select * from cred", "passwordRegister").get(0);
        loginPage.typepassword(passwordRegister);
        loginPage.clickOnRegisterButton();
        LOG.info("Registration success");
    }

    @Test
    public void testRegisterinvalidCredential() {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        LoginPageScaledupit loginPage = new LoginPageScaledupit(getDriver());
        homePage.clickOnMyAccountButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "My account – Automation");
        LOG.info("Registration title page validation unsuccessful");

        loginPage.typeEmailAddress("register@gmail");
        loginPage.typepasswordRegister("register123");
        loginPage.clickOnRegisterButton();
        String error = loginPage.getErrorMessage();
        LOG.info("Registration unsuccessful");
    }

}



