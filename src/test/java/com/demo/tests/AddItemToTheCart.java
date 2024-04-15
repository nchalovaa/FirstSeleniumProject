package com.demo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddItemToTheCart extends TestBase {

    @Test
    public void addItemToTheCartPositiveTest(){
        click(By.cssSelector("[href='/login']"));
        type(By.name("Email"), "Chalovaaa@gmail.com");
        type(By.name("Password"), "Chalova1@");
        click(By.cssSelector("[class='button-1 login-button']"));
        click((By.cssSelector("[class='button-2 product-box-add-to-cart-button']")));
        //assert is Product added in Basket
        Assert.assertTrue(isProductAdded("14.1-inch Laptop"));

    }

        public boolean isProductAdded(String text) {

            List<WebElement> products = driver.findElements(By.cssSelector("[class='product-name']"));
            for (WebElement product : products) {
                if (product.getText().contains(text)) {
                    return true;
                }
            }
            return false;
        }

    }

