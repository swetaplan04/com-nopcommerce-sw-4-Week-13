package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {


    By computerTab = By.xpath("//h1[contains(text(),'Computers')]");


    public String getComputersTab() {
        return getTextFromElement(computerTab);

    }
}