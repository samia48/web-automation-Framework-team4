package com.Magento.test;

import base.CommonAPI;
import com.Magento.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

import java.util.List;

public class TestCheckOutShoppingCart extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestCheckOutShoppingCart.class.getName());

    @Test
    public void searchAndAddToCartAnItem() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
        homePage.clickOnSigninButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Sign in title page validation success");

        String email = ConnectDB.getTableColumnData("select * from cred","email").get(0);
        signinPageMagento.typeEmailAddress(email);
        String password = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        signinPageMagento.typePassword(password);
        signinPageMagento.clickOnSigninButton();
        LOG.info("Signin success");
        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Sign in title page validation success");
        String item = "Bag";
        homePage.typeItemToSearch(item);
        homePage.clickOnSearchButton();
        String title2 = getCurrentTitle();
        Assert.assertEquals(title2, "Search results for: 'Bag' Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("search bag title page validation success");
        //add a product"Wayfarer Messenger Bag" to the cart
        SearchPageMagento searchPage = new SearchPageMagento(getDriver());
        searchPage.clickOnWayfarerMessengerBag();
        WayfarerMessengerBagPageMagento wayfarerMessengerBagPageMagento=new WayfarerMessengerBagPageMagento(getDriver());
        wayfarerMessengerBagPageMagento.clickOnAddToCartButton();
        wayfarerMessengerBagPageMagento.clickOnCartButton();
        wayfarerMessengerBagPageMagento.clickOnRemovetButton();
    }
    @Test
    public void ShoppingandAddToWishList() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
        homePage.clickOnSigninButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Sign in title page validation success");

        String email = ConnectDB.getTableColumnData("select * from cred","email").get(0);
        signinPageMagento.typeEmailAddress(email);
        String password = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        signinPageMagento.typePassword(password);
        signinPageMagento.clickOnSigninButton();
        LOG.info("Signin success");
        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Sign in title page validation success");
        homePage.ClickOnSaleButton();

        String title2= getCurrentTitle();
        Assert.assertEquals(title2, "Sale Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Sale title page validation success");
        SaleMagentoPage saleMagentoPage = new SaleMagentoPage(getDriver());
        saleMagentoPage.clickOnShopWomensDealButton();
        String title3 = getCurrentTitle();
        Assert.assertEquals(title3, "Women Sale Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Women's Deal title page validation success");
        //add a product"Wayfarer Messenger Bag" to the cart
        WomensDealPageMagento womensDealPageMagento = new WomensDealPageMagento(getDriver());
        womensDealPageMagento.hoverOverJosieYogaJacket(getDriver());
        womensDealPageMagento.clickOnSizeM();
        womensDealPageMagento.ClickOnColorBlackButton();
        womensDealPageMagento.ClickAddToCartButton();
        Thread.sleep(3000);
        womensDealPageMagento.ClickOnCartButton();
        Thread.sleep(3000);
        womensDealPageMagento.ClickOnViewAndEditCart(getDriver());

        String title4= getCurrentTitle();
        Assert.assertEquals(title4, "Shopping Cart Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Shopping Cart title page validation success");
        ShoppingCartPageMagento shoppingCartPageMagento = new ShoppingCartPageMagento(getDriver());
        Thread.sleep(3000);
        shoppingCartPageMagento.ClickOnMoveToWishListButton();
        shoppingCartPageMagento.ClickOnLUMAButton();
        String title5 = getCurrentTitle();
        Assert.assertEquals(title5, "Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("login title page validation success");
    }


    @Test
    public void UpdateShoppingCartAndCheckout() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
        homePage.clickOnSigninButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Sign in title page validation success");

        String email = ConnectDB.getTableColumnData("select * from cred","email").get(0);
        signinPageMagento.typeEmailAddress(email);
        String password = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        signinPageMagento.typePassword(password);
        signinPageMagento.clickOnSigninButton();
        LOG.info("Signin success");
        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Sign in title page validation success");

        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickOnFitnessEquipment();

        String title2= getCurrentTitle();
        Assert.assertEquals(title2, "Fitness Equipment - Gear Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Fitness equipment title page validation success");
        FitnessEquipmentMagentoPage fitnessEquipmentMagentoPage = new FitnessEquipmentMagentoPage(getDriver());
        fitnessEquipmentMagentoPage.hoverOverItem1(getDriver());
        fitnessEquipmentMagentoPage.clickOnAddToCart1();
        Thread.sleep(3000);
        fitnessEquipmentMagentoPage.hoverOverItem2(getDriver());
        Thread.sleep(3000);
        fitnessEquipmentMagentoPage.clickOnAddToCart2();
        Thread.sleep(3000);
        fitnessEquipmentMagentoPage.clickOnCartButton();
        Thread.sleep(3000);
        fitnessEquipmentMagentoPage.clickOnViewAndEditCart(getDriver());

        String title3= getCurrentTitle();
        Assert.assertEquals(title3, "Shopping Cart Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Shopping Cart title page validation success");
        ShoppingCartPageMagento shoppingCartPageMagento = new ShoppingCartPageMagento(getDriver());
        shoppingCartPageMagento.ClickOnRemoveButton();
        driver.findElement(By.xpath("(//input[@class='input-text qty'])[1]")).clear();
        driver.findElement(By.xpath("(//input[@class='input-text qty'])[1]")).sendKeys("2");
        LOG.info("update quantity success");
        shoppingCartPageMagento.ClickOnUpdateShoppingCart();
        Thread.sleep(3000);
        shoppingCartPageMagento.ClickOnProceedToCheckOutButton();
        CheckOutPageMagento checkOutPageMagento = new CheckOutPageMagento(getDriver());
        String title4= getCurrentTitle();
        Assert.assertEquals(title4, "Checkout Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("checkout title page validation success");



    }

}
