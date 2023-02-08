package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.AddNewFormPage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewFormTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(AddNewFormTest.class.getName());

    @Test
    public void AddNewFormVerify() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        AddNewFormPage formPage = new AddNewFormPage(getDriver());

        loginPage.clickOnLoginBtn();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();

        formPage.setHoverOverLeftMenu(getDriver());
        formPage.clickOnFormIcon();
        Thread.sleep(3000);
        formPage.clickOnAddButton();
        Thread.sleep(3000);
        formPage.typeOnNameField("New Form");
        Thread.sleep(2000);
        formPage.clickOnSaveButton();
}
}
