package com.Scaledupit.test;

import base.CommonAPI;
import com.Scaledupit.pages.HomePageScaledupit;
import com.Scaledupit.pages.LoginPageScaledupit;
import com.Scaledupit.pages.SearhPageScaledupit;
import com.Scaledupit.pages.ShirtPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestSearch extends CommonAPI {

        Logger LOG = LogManager.getLogger(TestSearch.class.getName());

       @Test
        public void EmptyShoppingCart() throws InterruptedException {
           HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
           homePage.clickOnMyAccountButton();
           LoginPageScaledupit loginPage = new LoginPageScaledupit(getDriver());

           String title0 = getCurrentTitle();
           Assert.assertEquals(title0, "My account – Automation");
           LOG.info("login title page validation success");
           String username = ConnectDB.getTableColumnData("select * from cred", "username").get(0);
           loginPage.typeusername(username);
           String password = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
           loginPage.typepassword(password);
           loginPage.clickOnLoginButton();
           LOG.info("login success");
           loginPage.clickOnHomeButton();
           String title = getCurrentTitle();
           Assert.assertEquals(title, "Automation – Automate eCommerce");
           LOG.info("login title page validation success");
           homePage.typeItemToSearch("shirt");
           homePage.clickOnSearchButton();

           String title1 = getCurrentTitle();
           Assert.assertEquals(title1, "Search Results for “shirt” – Automation");
           LOG.info("shirt search title validation success");
           SearhPageScaledupit searhPageScaledupit  = new SearhPageScaledupit(getDriver());
           searhPageScaledupit.clickOnShirtButton();
           ShirtPage shirtPage  = new ShirtPage(getDriver());
           shirtPage.clickOnAddToCartButton();


           homePage.hoverOverCartButton(getDriver());
           Thread.sleep(3000);
           homePage.clickOnDeleteButton();

        }

        @Test
        public void searchAndAddProductToCart() throws InterruptedException {
            HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
            homePage.typeItemToSearch("shirt");
            homePage.clickOnSearchButton();

            String title = getCurrentTitle();
            Assert.assertEquals(title, "Search Results for “shirt” – Automation");
            LOG.info("shirt search title validation success");
            SearhPageScaledupit searhPageScaledupit  = new SearhPageScaledupit(getDriver());
            searhPageScaledupit.clickOnShirtButton();
            ShirtPage shirtPage  = new ShirtPage(getDriver());
            shirtPage.clickOnAddToCartButton();

        }







}


