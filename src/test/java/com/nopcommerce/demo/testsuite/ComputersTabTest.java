package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputersTabTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();

    @Test
    public void userShouldNavigateToComputersPageSuccessfully(){
        homePage.clickOnComputersTab();
        String expectedMessage = "Computers";
        String actualMessage = computersPage.getComputersTab();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");


    }
}
