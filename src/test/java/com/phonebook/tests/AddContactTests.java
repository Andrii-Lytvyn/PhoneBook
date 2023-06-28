package com.phonebook.tests;

import com.phonebook.fw.DataProviders;
import com.phonebook.model.Contact;
import com.phonebook.model.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class AddContactTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnSignOutButton();
        }
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginRegistrationForm(new User()
                .setEmail("kross1234@gmail.com")
                .setPassword("Kr123$_-$"));
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void addContactPositiveTest() {
        app.getContact().clickOnAddLink();
        //int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        app.getContact().fillAddContactForm(new Contact()
                .setName("Klara")
                .setLastName("Evio")
                .setPhone("1234567890")
                .setEmail("Evio@gm.com")
                .setAddress("Berlin")
                .setDesc("Different"));
        app.getContact().clickOnSaveButton();
        Assert.assertTrue(app.getContact().isContactCreated("Klara"));

    }

    @Test(dataProvider = "addContact", dataProviderClass = DataProviders.class)
    public void addContactPositiveFromDataProviderTest(String name, String lastName, String phone, String email, String address,
                                                       String disc) {
        app.getContact().clickOnAddLink();
        app.getContact().fillAddContactForm(new Contact()
                .setName(name)
                .setLastName(lastName)
                .setPhone(phone)
                .setEmail(email)
                .setAddress(address)
                .setDesc(disc));
        app.getContact().clickOnSaveButton();
        Assert.assertTrue(app.getContact().isContactCreated(name));

    }

    @Test(dataProvider = "addContactFromCsvFile", dataProviderClass = DataProviders.class)
    public void addContactPositiveFromCsvFileTest(Contact contact) {
        app.getContact().clickOnAddLink();
        app.getContact().fillAddContactForm(contact);
        app.getContact().clickOnSaveButton();
    }

    @AfterMethod
    public void postCondition() {
        app.getContact().removeContact();
    }


}