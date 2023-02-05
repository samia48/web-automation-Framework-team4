package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.DropDownPage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DropDownMenuTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(DropDownMenuTest.class.getName());

    @Test
    public void DropDownMenuVerifyTest() throws InterruptedException {
        DropDownPage dropDownPage = new DropDownPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());


        String title = getCurrentTitle();
        Assert.assertEquals(title, "#1 Free CRM Software for every business");
        LOG.info("login title page validation success");
        Thread.sleep(2000);


        dropDownPage.hoverOverCrm(getDriver());
        dropDownPage.clickOnDropDown();


    }
}
