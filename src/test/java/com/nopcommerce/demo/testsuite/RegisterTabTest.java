package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BooksPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTabTest extends TestBase {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

@Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
    homePage.clickOnRegisterLink();
    String expectedMessage = "Register";
    String actualMessage = registerPage.getRegisterTab();
    Assert.assertEquals(expectedMessage, actualMessage, "error");
}
    @Test
    public void userShouldRegisterAccountSuccessfully(){

    homePage.clickOnRegisterLink();
    registerPage.enterfirstName("Ramesh");
    registerPage.enterlastName("Patel");
    registerPage.enteremail("RameshPatel1234@gmail.com");
    registerPage.enterpassword("Temp1234");
    registerPage.enterConfirmPassword("Temp1234");
    registerPage.clickRegisterButton();
    String expectedMessage = "Your registration completed";
    String actualMessage = registerPage.getRegisterCompletionMessage();
    Assert.assertEquals(expectedMessage,actualMessage,"Register not completed");

}
}

