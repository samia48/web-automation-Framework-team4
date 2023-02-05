package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.LoginPage;
import com.FreeCRM.pages.ReturnHomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnToHomePageTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(ReturnToHomePageTest.class.getName());

    @Test
    public void HomePageVerifyTest() throws InterruptedException {

        ReturnHomePage returnHomePage = new ReturnHomePage(getDriver());
        //String email = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        returnHomePage.clickOnAbout();
        Thread.sleep(2000);
        returnHomePage.clickOnHomePageLogo();

        String title = getCurrentTitle();
        Assert.assertEquals(title, "#1 Free CRM Software for every business");
        LOG.info("login title page validation success");
    }
}
