package com.Magento.test;

import base.CommonAPI;
import com.Magento.pages.CreatenewAccountPageMagento;
import com.Magento.pages.HomePageMagento;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestCreateNewAccount extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestCreateNewAccount.class.getName());

    @Test
    public void RegisterWithAnExistingCredentials() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        homePage.clickOnCreateanAccountButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Create New Customer Account Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("create an account title page validation success");
        CreatenewAccountPageMagento createnewAccountPageMagento = new CreatenewAccountPageMagento(getDriver());
        String FirstName  = ConnectDB.getTableColumnData("select * from cred","FirstName").get(0);
        createnewAccountPageMagento.typeFirstName(FirstName);
        String LastName  = ConnectDB.getTableColumnData("select * from cred","lastName").get(0);
        createnewAccountPageMagento.typeLastName(LastName);
        String email  = ConnectDB.getTableColumnData("select * from cred","email").get(0);
        createnewAccountPageMagento.typeEmailAddress(email);
        String password  = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        createnewAccountPageMagento.typePassword(password);
        createnewAccountPageMagento.typeConfirmPassword(password);
        createnewAccountPageMagento.clickOnCreateanAccountButton();
        String error = createnewAccountPageMagento.getErrorMessage1();
        Assert.assertEquals(error, "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.");
        LOG.info("Failing Creation of an account success");
    }

    @Test
    public void InvalidCredentials() {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        homePage.clickOnCreateanAccountButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Create New Customer Account Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("create an account title page validation success");
        CreatenewAccountPageMagento createnewAccountPageMagento = new CreatenewAccountPageMagento(getDriver());
        String FirstName = ConnectDB.getTableColumnData("select * from cred", "FirstName").get(0);
        createnewAccountPageMagento.typeFirstName(FirstName);
        String LastName  = ConnectDB.getTableColumnData("select * from cred","lastName").get(0);
        createnewAccountPageMagento.typeLastName(LastName);
        String invalidEmailAdress  = ConnectDB.getTableColumnData("select * from cred","invalidEmailAdress").get(0);
        createnewAccountPageMagento.typeEmailAddress(invalidEmailAdress);
        String password  = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        createnewAccountPageMagento.typePassword(password);
        createnewAccountPageMagento.typeConfirmPassword(password);
        createnewAccountPageMagento.clickOnCreateanAccountButton();
        String error = createnewAccountPageMagento.getErrorMessage();
        Assert.assertEquals(error, "Please enter a valid email address (Ex: johndoe@domain.com).");
        LOG.info("Failing Creation of an account success");
    }
    @Test
    public void RegisterNewAcount() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        homePage.clickOnCreateanAccountButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Create New Customer Account Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("create an account title page validation success");
        CreatenewAccountPageMagento createnewAccountPageMagento = new CreatenewAccountPageMagento(getDriver());
        createnewAccountPageMagento.typeFirstName("FirstName");
        createnewAccountPageMagento.typeLastName("LastName");
        createnewAccountPageMagento.typeEmailAddress("email7@yahoo.com");
        createnewAccountPageMagento.typePassword("password@1234");
        createnewAccountPageMagento.typeConfirmPassword("password@1234");
        createnewAccountPageMagento.clickOnCreateanAccountButton();
        String confirmation = createnewAccountPageMagento.getConfirmation();
        Assert.assertEquals(confirmation, "Thank you for registering with Fake Online Clothing Store.");
        LOG.info(" Creation of a new account success");
    }

}
