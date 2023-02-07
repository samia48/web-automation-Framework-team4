package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.CreateNewCasePage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewCaseTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateNewTaskTest.class.getName());

    @Test
    public void CreateNewCaseVerify() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        CreateNewCasePage casePage = new CreateNewCasePage(getDriver());

        //loginPage.clickOnLoginBtn();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();

        casePage.setHoverOverLeftMenu(getDriver());
        casePage.clickOnTaskIcon();
        casePage.clickOnCreateBtn();
        Thread.sleep(2000);
        casePage.typeTitle("New Case");
        Thread.sleep(2000);
        casePage.clickOnSaveButton();





    }
}
