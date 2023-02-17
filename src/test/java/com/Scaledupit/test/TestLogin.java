package com.Scaledupit.test;

import base.CommonAPI;
import com.Scaledupit.pages.HomePageScaledupit;
import com.Scaledupit.pages.LoginPageScaledupit;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestLogin extends CommonAPI {

    Logger LOG = LogManager.getLogger(com.Scaledupit.test.TestLogin.class.getName());
    Faker fakeData = new Faker();
    String username =fakeData.internet().emailAddress();


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
        LOG.info("login success");
    }

    @Test
    public void loginWithInValidemail() throws InterruptedException {
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


    @Test
    public void loginWithMissingPassword() {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        LoginPageScaledupit loginPage = new LoginPageScaledupit(getDriver());
        homePage.clickOnMyAccountButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "My account – Automation");
        LOG.info("login title page validation success");
        //String username = ConnectDB.getTableColumnData("select * from cred", "username").get(0);
        loginPage.typeusername(username);
        loginPage.typepassword("");
        loginPage.clickOnLoginButton();
        String error = loginPage.getErrorMessage();
        Assert.assertEquals(error, "Error: The password field is empty.");
        LOG.info("login Unsuccess");

    }





}




