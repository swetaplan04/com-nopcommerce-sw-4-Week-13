package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTabTest extends TestBase {
    HomePage homepage = new HomePage();
    ElectronicsPage electronicspage = new ElectronicsPage();

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
       homepage.clickOnElectronicsTab();
        String expectedMessage = "Electronics";
        String actualMessage = electronicspage.getElectronicsTab();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");


    }
}





