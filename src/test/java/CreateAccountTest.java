import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {

    @Test
public void createNewAccountPositiveTest(){
        //click on Register link
        driver.findElement(By.cssSelector("[href='/register']")).click();
        // enter First Name
        driver.findElement(By.name("FirstName")).click();
        driver.findElement(By.name("FirstName")).clear();
        driver.findElement(By.name("FirstName")).sendKeys("Anastasiia");
        // enter Last Name
        driver.findElement(By.name("LastName")).click();
        driver.findElement(By.name("LastName")).clear();
        driver.findElement(By.name("LastName")).sendKeys("Chalova");
        // enter email
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("Chalovaaa@gmail.com");
        // enter Password
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("Chalova1@");
        // confirm Password
        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Chalova1@");
        // click on Registration button
        driver.findElement(By.cssSelector("[name='register-button']")).click();
        // assert Register button is present
        Assert.assertTrue(isElementFormPresent(By.cssSelector("[href='/logout']")));

}

}
