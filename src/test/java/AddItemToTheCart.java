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
        //assert Computer is added
        Assert.assertTrue(isComputerAdded("2"));

    }

        public boolean isComputerAdded(String text) {

            List<WebElement> products = driver.findElements(By.cssSelector("[name='itemquantity4151570']"));
            for(WebElement element: products) {
                if(element.getText().contains(text))
                    return true;
            }
            return false;
        }
    }

