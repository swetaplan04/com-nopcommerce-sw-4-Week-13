package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.GiftCardsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftCardsTabTest extends TestBase {

    HomePage homepage = new HomePage();
    GiftCardsPage giftcardspage = new GiftCardsPage();

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        homepage.clickonGiftCards();
        String expectedMessage = "Gift Cards";
        String actualMessage = giftcardspage.getGiftCardsTab();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");
    }

}


