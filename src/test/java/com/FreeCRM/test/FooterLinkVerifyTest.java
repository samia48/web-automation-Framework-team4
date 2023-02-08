package com.FreeCRM.test;

import base.CommonAPI;
import com.FreeCRM.pages.FooterLinkVerifyPage;
import com.FreeCRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ReadFromExcel;

import java.util.ArrayList;

public class FooterLinkVerifyTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(FooterLinkVerifyTest.class.getName());
    ReadFromExcel read = new ReadFromExcel("C:\\Users\\Tasnia\\eclipse-workspace\\Final_Bootcamp_selenium\\web-automation-framework-team4\\data\\titles.xlsx", "FreeCRM");

    @Test
    public void twitterLinkVerifyTest(){
        LoginPage loginPage = new LoginPage(getDriver());
        FooterLinkVerifyPage footerPage = new FooterLinkVerifyPage(getDriver());

        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM and Business Cloud Solutions");
        LOG.info("login title page validation success");

        footerPage.clickOnTwitterIcon();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        String expectedTitle = read.getCellValueForGivenHeaderAndKey("key","Twitter Title");
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("The Twitter title is: "+actualTitle);
        LOG.info("Twitter page validation success");
    }


    @Test
    public void facebookLinkVerifyTest(){
        LoginPage loginPage = new LoginPage(getDriver());
        FooterLinkVerifyPage footerPage = new FooterLinkVerifyPage(getDriver());

        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM and Business Cloud Solutions");
        LOG.info("login title page validation success");

        footerPage.clickOnFacebookIcon();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        String fbTitle = getCurrentTitle();
        System.out.println("The facebook title is: "+fbTitle);
        LOG.info("Facebook page validation success");
    }

    @Test
    public void githubLinkVerifyTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        FooterLinkVerifyPage footerPage = new FooterLinkVerifyPage(getDriver());

        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM and Business Cloud Solutions");
        LOG.info("login title page validation success");

        footerPage.clickOnGithubIcon();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        String ghTitle = getCurrentTitle();
        System.out.println("The github title is: " + ghTitle);
        LOG.info("Github page validation success");
    }

    @Test
    public void paperPlaneLinkVerifyTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        FooterLinkVerifyPage footerPage = new FooterLinkVerifyPage(getDriver());

        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM and Business Cloud Solutions");
        LOG.info("login title page validation success");

        footerPage.clickOnPaperPlaneIcon();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        String ppTitle = getCurrentTitle();
        System.out.println("The paper plane title is: " + ppTitle);
        LOG.info("Paper plane page validation success");
    }

    @Test
    public void mediumLinkVerifyTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        FooterLinkVerifyPage footerPage = new FooterLinkVerifyPage(getDriver());

        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM and Business Cloud Solutions");
        LOG.info("login title page validation success");

        footerPage.clickOnMediumIcon();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        String mediumTitle = getCurrentTitle();
        System.out.println("The Medium title is: " + mediumTitle);
        LOG.info("Medium page validation success");
    }

    @Test
    public void linkedinLinkVerifyTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        FooterLinkVerifyPage footerPage = new FooterLinkVerifyPage(getDriver());

        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM and Business Cloud Solutions");
        LOG.info("login title page validation success");

        footerPage.clickOnLinkedinIcon();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        String lkTitle = getCurrentTitle();
        System.out.println("The Linkedin title is: " + lkTitle);
        LOG.info("Linkedin page validation success");
    }

    @Test
    public void youtubeLinkVerifyTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        FooterLinkVerifyPage footerPage = new FooterLinkVerifyPage(getDriver());

        String title = getCurrentTitle();
        Assert.assertEquals(title, "Cogmento CRM and Business Cloud Solutions");
        LOG.info("login title page validation success");

        footerPage.clickOnYoutubeIcon();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        String ytTitle = getCurrentTitle();
        System.out.println("The YouTube title is: " + ytTitle);
        LOG.info("YouTube page validation success");
    }

}
