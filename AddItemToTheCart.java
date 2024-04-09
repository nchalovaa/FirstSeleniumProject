import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class AddItemToTheCart extends TestBase {

    @Test
    public void addItemToTheCartPositiveTest(){
        click(By.cssSelector("[href='/login']"));
        type(By.name("Email"), "Chalovaaa@gmail.com");
        type(By.name("Password"), "Chalova1@");
        click(By.cssSelector("[class='button-1 login-button']"));
        click((By.cssSelector("[class='button-2 product-box-add-to-cart-button']")));
        //assert Checkout button is present


    }

    }

