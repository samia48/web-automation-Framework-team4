package com.Magento.test;

import base.CommonAPI;
import com.Magento.pages.HomePageMagento;
import com.Magento.pages.OrderAndRuternPage;
import com.Magento.pages.Order000017128Page;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ReadFromExcel;

public class TestReorderAndRuturn extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestReorderAndRuturn.class.getName());

    ReadFromExcel read = new ReadFromExcel("D:\\BootCamp Selenium\\web-automation-framework-team4\\data\\titles.xlsx", "Magento");

    @Test
    public void orderAndRuturn() throws InterruptedException {
        HomePageMagento homePage = new HomePageMagento(getDriver());
        OrderAndRuternPage orderAndRuternPage = new OrderAndRuternPage(getDriver());
        Order000017128Page order000017128Page = new Order000017128Page(getDriver());
        homePage.clickOnOrderAndRuters();

        String title= getCurrentTitle();
        Assert.assertEquals(title, "Orders and Returns Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Orders and Returns  title page validation success");
        orderAndRuternPage.typeOrderID("000017128");
        orderAndRuternPage.typeBillingLastname("iddir");
        orderAndRuternPage.typeEmail("samia.mails@gmail.com");
        orderAndRuternPage.clickOnContinueButton();

        String title1= getCurrentTitle();
        Assert.assertEquals(title1, "Order # 000017128 Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Order # 000017128  title page validation success");
        order000017128Page.clickOnPrintOrder();

    }
}
