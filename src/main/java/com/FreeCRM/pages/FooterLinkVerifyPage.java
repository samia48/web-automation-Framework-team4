package com.FreeCRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterLinkVerifyPage extends CommonAPI {
    Logger LOG = LogManager.getLogger( FooterLinkVerifyPage.class.getName());

    public FooterLinkVerifyPage(WebDriver driver){PageFactory.initElements(driver, this);}


    @FindBy(xpath = "//a[@class='fa-twitter icon icon-blue icon-xs-square']")
    WebElement twitterIcon;

    @FindBy(xpath = "//a[@class='fa-facebook icon icon-blue icon-xs-square']")
    WebElement facebookIcon;

    @FindBy(xpath = "//a[@class='fa-github icon icon-blue icon-xs-square']")
    WebElement gitHubIcon;

    @FindBy(xpath = "//a[@class='fa-paper-plane icon icon-blue icon-xs-square']")
    WebElement paperPlaneIcon;

    @FindBy(xpath = "//a[@class='fa-medium icon icon-blue icon-xs-square']")
    WebElement mediumIcon;

    @FindBy(xpath = "//a[@class='fa-linkedin icon icon-blue icon-xs-square']")
    WebElement linkedinIcon;

    @FindBy(xpath = "//a[@class='fa-youtube icon icon-blue icon-xs-square']")
    WebElement youTubeIcon;

    public void clickOnTwitterIcon(){
        clickOn(twitterIcon);
        LOG.info("click  on twitter icon success");
    }

    public void clickOnFacebookIcon(){
        clickOn(facebookIcon);
        LOG.info("click on facebook icon success");
    }

    public void clickOnGithubIcon(){
        clickOn(gitHubIcon);
        LOG.info("click github icon success");
    }

    public void clickOnPaperPlaneIcon(){
        clickOn(paperPlaneIcon);
        LOG.info("click paper plane icon success");
    }

    public void clickOnMediumIcon(){
        clickOn(mediumIcon);
        LOG.info("click on medium icon success");
    }

    public void clickOnLinkedinIcon(){
        clickOn(linkedinIcon);
        LOG.info("click on linkedin icon success");
    }

    public void clickOnYoutubeIcon(){
        clickOn(youTubeIcon);
        LOG.info("click on youtube icon success");
    }

}
