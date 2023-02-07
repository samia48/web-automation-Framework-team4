package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.CreateNewContactPage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewContactTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateNewContactTest.class.getName());

    @Test
    public void CreateNewContactVerify() {
        LoginPage loginPage = new LoginPage(getDriver());
        CreateNewContactPage contactPage = new CreateNewContactPage(getDriver());

        //String email = ConnectDB.getTableColumnData("select * from cred","password").get(0);

        //loginPage.clickOnLoginBtn();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();

        contactPage.setHoverOverLeftMenu(getDriver());
        contactPage.clickOnAddContactIcon();
        contactPage.clickOnCreateBtn();
        contactPage.typeFirstName("John");
        contactPage.typeLastName("Smith");
        contactPage.clickOnSaveButton();


    }
}
