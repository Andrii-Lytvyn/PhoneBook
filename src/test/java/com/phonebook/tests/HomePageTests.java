package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {

    @Test
    public void openHomePageTest() {
        // System.out.println("Home component is: " + isHomeComponentPresent1());
        Assert.assertTrue(app.getHomePage().isHomeComponentPresent());
        // isElementPresent(By.cssSelector("div:nth-child(2)>div>div")));
    }

}
//div:nth-child(2)>div>div
////h1[text()='Home Component']