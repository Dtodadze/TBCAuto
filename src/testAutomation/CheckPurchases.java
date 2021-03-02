package testAutomation;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import PagesAndBrowsers.ShoppingCardSummery;

public class CheckPurchases {

    ShoppingCardSummery shoppingCardSummery = new ShoppingCardSummery();

    @Test(priority = 8)
    void OpenAndCheckCart() throws InterruptedException {

        Thread.sleep(1000);
        WebElement cart =shoppingCardSummery.Cart(setUp.driver);
        cart.click();
        Thread.sleep(2000);
        String purchase1=shoppingCardSummery.FristProduct(setUp.driver).getText();
        System.out.println(purchase1);
        String purchase2=shoppingCardSummery.SecondProduct(setUp.driver).getText();
        System.out.println(purchase2);
        if(purchase1.equals(setUp.firstProduct)&&purchase2.equals(setUp.secondProduct)){
            System.out.println("product match");
        }
        else {
            System.out.println("product do not match");
        }
    }
    @Test(priority = 9)
    void StartCheckOut() throws InterruptedException {

        WebElement startCheckOut=shoppingCardSummery.StartPurchase(setUp.driver);
        startCheckOut.click();
        Thread.sleep(2000);
    }

}
