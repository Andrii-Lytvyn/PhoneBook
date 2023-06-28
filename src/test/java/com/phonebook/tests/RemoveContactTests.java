package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//public class RemoveContactTests extends TestBase {
//
//    @BeforeMethod
////    public void ensyrePreconditions() {
////        if(app.getUser().isLoginLinkPresent()){
////            app.getUser().login();
////            app.getContact().fillAddContactForm();
////        }
////    }
////}
//
//    @Test
//    public void removeContactTest() {
//        int sizeBefore = app.getContact().sizeOfContacts();
//        System.out.println(sizeBefore);
//        app.getContact().removeContact();
//
//        app.getContact().pause(2000);
//
//        int sizeAfter = app.getContact().sizeOfContacts();
//        System.out.println(sizeAfter);
//        Assert.assertEquals(sizeAfter,sizeBefore-1);
//    }}