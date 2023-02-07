package com.Scaledupit.test;

import base.CommonAPI;
import com.Scaledupit.pages.HomePageScaledupit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestConnectSocialMedia extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestConnectSocialMedia.class.getName());

    @Test
    public void ConnectFaceBook() {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        homePage.clickOnFaceBookButton();


    }

    public void ConnectInstagram() {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        homePage.clickOnInstagramButton();


    }

    public void ConnectSnapShot() {
        HomePageScaledupit homePage = new HomePageScaledupit(getDriver());
        homePage.clickOnSnapShotButton();


    }


}
