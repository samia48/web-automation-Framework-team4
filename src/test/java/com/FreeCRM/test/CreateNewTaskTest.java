package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.CreateNewTaskPage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewTaskTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateNewTaskTest.class.getName());

    @Test
    public void CreateNewTaskVerify() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        CreateNewTaskPage taskPage = new CreateNewTaskPage(getDriver());

        loginPage.clickOnLoginBtn();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();

        taskPage.setHoverOverLeftMenu(getDriver());
        taskPage.clickOnTaskIcon();
        taskPage.clickOnCreateBtn();
        Thread.sleep(2000);
        taskPage.typeTitle("New Task");
        Thread.sleep(2000);
        taskPage.clickOnSaveButton();





    }
}
