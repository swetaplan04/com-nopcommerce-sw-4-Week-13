package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ApparelPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.JewelryPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JewelryTabTest extends TestBase {

    HomePage homePage = new HomePage();
    JewelryPage jewelryPage = new JewelryPage();

@Test
    public void userShouldNavigateTojewelrylPageSuccessfully(){
    homePage.clickOnJewelryTab();
    String expectedMessage = "Jewelry";
    String actualMessage = jewelryPage.getjewelryTab();
    Assert.assertEquals(expectedMessage, actualMessage, "error");
}

    }

