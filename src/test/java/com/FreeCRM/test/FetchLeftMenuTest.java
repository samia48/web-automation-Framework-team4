package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.HomePage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FetchLeftMenuTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(LoginTest.class.getName());


    @Test
    public void invalidPasswordErrorMessage() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        //String email = ConnectDB.getTableColumnData("select * from cred","password").get(0);

        loginPage.clickOnLoginBtn();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM");
        LOG.info("login title page validation success");

        loginPage.typeEmailAddress("tsrahman28@gmail.com");
        loginPage.typePassword("Testaccount1@");
        loginPage.clickOnLoginButton();

        homePage.setHoverOverLeftMenu(getDriver());
        List<WebElement> elements = driver.findElements(By.xpath("//span[@class='item-text']"));
        System.out.print("Elements size:" + elements.size());
        for (WebElement listofElements : elements) {
            System.out.println("Paragraph text:" + listofElements.getText());
        }

    }
}
