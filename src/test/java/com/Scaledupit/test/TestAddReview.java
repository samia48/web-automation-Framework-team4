package com.Scaledupit.test;

import base.CommonAPI;
import com.Scaledupit.pages.GuitarPage;
import com.Scaledupit.pages.HomePageScaledupit;
import com.Scaledupit.pages.LoginPageScaledupit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestAddReview extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestAddReview.class.getName());

    @Test
    public void AddReview() throws InterruptedException {
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
        loginPage.clickOnHomeButton();

        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Automation – Automate eCommerce");
        LOG.info("login title page validation success");
        homePage.clickOnGuitar();

        String title2 = getCurrentTitle();
        Assert.assertEquals(title2, "Guitar – Automation");
        LOG.info("Guitar page validation success");
        GuitarPage guitarPage = new GuitarPage(getDriver());
        guitarPage.clickReviewButton();
        guitarPage.clickRating();
        guitarPage.typeReview("Good");
        guitarPage.clickOnSubmitButton();





    }
}
