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
    public void testRegister() {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        LoginPageScaledupit loginPage = new LoginPageScaledupit(getDriver());
        homePage.clickOnMyAccountButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "My account – Automation");
        LOG.info("Registration title page validation success");
        String email = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
        loginPage.typeEmailAddress("EmailAddress");
        loginPage.typepasswordRegister("passwordRegister");
        loginPage.clickOnRegisterButton();
        LOG.info("Regtration success");
    }

}



