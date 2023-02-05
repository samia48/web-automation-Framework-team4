package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.CreateNewCompanyPage;
import com.FreeCRM.pages.CreateNewContactPage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateNewCompanyTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateNewCompanyTest.class.getName());

    @Test
    public void CreateNewCompanyVerify() throws InterruptedException{
        LoginPage loginPage = new LoginPage(getDriver());
        CreateNewContactPage contactPage = new CreateNewContactPage(getDriver());
        CreateNewCompanyPage companyPage = new CreateNewCompanyPage(getDriver());
        //String email = ConnectDB.getTableColumnData("select * from cred","password").get(0);

        loginPage.clickOnLoginBtn();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();

        contactPage.setHoverOverLeftMenu(getDriver());

        companyPage.clickOnAddCompanyButton();
        Thread.sleep(2000);
        companyPage.clickOnCompanyCreateBtn();
        companyPage.typeName("Will Smith");
        companyPage.clickOnSaveButton();
        companyPage.clickOnAddCompanyButton();
        Thread.sleep(2000);
        companyPage.clickdeleteButton();
        Thread.sleep(2000);
        companyPage.clickDelete();
    }
}
