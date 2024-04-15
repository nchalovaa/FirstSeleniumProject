package com.demo.tests;

import com.demo.tests.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
        @Test
        public void createNewAccountPositiveTest() {

                click(register());
                type(By.name("FirstName"), "Anastasiia");
                type(By.name("LastName"), "Chalova");
                type(By.name("Email"), "Chalovaaa@gmail.com");
                type(By.name("Password"), "Chalova1@");
                type(By.name("ConfirmPassword"), "Chalova1@");
                click(By.cssSelector("[name='register-button']"));
                Assert.assertTrue(isElementFormPresent(By.cssSelector("[href='/logout']")));

        }

        @Test
        public void createNewAccountWithExistedEmailNegativeTest() {
                //click on Register link
                click(register());
                // enter First Name
                type(By.name("FirstName"), "Anastasiia");
                // enter Last Name
                type(By.name("LastName"), "Chalova");
                // enter email
                type(By.name("Email"), "Chalovaaa@gmail.com");
                // enter Password
                type(By.name("Password"), "Chalova1@");
                // confirm Password
                type(By.name("ConfirmPassword"), "Chalova1@");
                // click on Registration button
                click(By.cssSelector("[name='register-button']"));
                // assert Register button is present
                Assert.assertTrue(isAlertPresent());

        }
}
