package com.demo.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBase {

    WebDriver driver;

    public static By register() {
        return By.cssSelector("[href='/register']");
    }

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void isRegistrationFormPresentTest(){
        // System.out.println("Registration Form is " + isRegistrationFormPresent()); - пишем только для отладки
        Assert.assertTrue(isRegistrationFormPresent());
    }

    //адресный метод
    public boolean isRegistrationFormPresent() {
        return driver.findElements(By.cssSelector("[href*='register']")).size() > 0; //убедиться, что этот элемент существует
    }

    //создаем универсальный метод
    public boolean isElementFormPresent(By locator){ //внедряем переменную "Locator", BY - потомучто cssSelector
        return driver.findElements(locator).size()>0;
    }
    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }

    public void type(By locator, String text) {
            click(locator);
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
            driver.findElement(locator).click();
    }

    public boolean isAlertPresent() {
            Alert alert = new WebDriverWait(driver, Duration.ofSeconds(15))
                    .until(ExpectedConditions.alertIsPresent());
            if (alert == null) {
                    return false;
            } else {
                    return true;
            }
    }
}
