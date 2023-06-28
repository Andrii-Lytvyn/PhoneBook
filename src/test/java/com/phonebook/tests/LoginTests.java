package com.phonebook.tests;

import com.phonebook.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnSignOutButton();
        }
    }

    @Test(priority = 1)
    public void loginPositiveTest() {
        //click on login link
        //driver.findElement(By.cssSelector("href='/login'")).click();
        //click(By.cssSelector("[href='/login'")); ->>>>clickOnLoginLink();
        app.getUser().clickOnLoginLink();
        //enter e-mail
        app.getUser().fillLoginRegistrationForm(new User()
                .setEmail("kross1234@gmail.com")
                .setPassword("Kr123$_-$"));
        //click on Registration button
        app.getUser().clickOnLoginButton();
        // driver.findElement(By.name("registration")).click();
        //assert Sign out button is displayed
        // Assert.assertTrue(isElementPresent1(By.xpath("//button[.='Sign Out']")));
        Assert.assertTrue(app.getUser().isSignOutButtonPresent());
    }

    @Test (priority = 2)
    public void loginNegativeWithoutPasswordTest() {

        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginRegistrationForm(new User()
                .setEmail("kross1234@gmail.com"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isAlertPresent());
    }


}
