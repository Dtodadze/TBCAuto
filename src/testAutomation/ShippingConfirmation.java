package testAutomation;

import PagesAndBrowsers.Shipping;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ShippingConfirmation {

    Shipping shipping =new Shipping();
    @Test(priority = 13)
    void WithoutAgreement() throws InterruptedException {

        shipping.SippingPageWebElements(setUp.driver);
        shipping.proceedToCheckout.click();
        Thread.sleep(2000);
        WebElement alert = setUp.driver.findElement(By.xpath("//*[@id=\"order\"]/div[2]/div/div/div/div/p"));
        String alertMassage = alert.getText();
        System.out.println(alertMassage);
        if (alertMassage.equals("You must agree to the terms of service before continuing.")){
            setUp.driver.findElement(By.xpath("//*[@id=\"order\"]/div[2]/div/div/a")).click();
            System.out.println("alert worked properly");
            shipping.agreeWithTerms.click();
            Thread.sleep(1000);
            shipping.proceedToCheckout.click();
            Thread.sleep(1000);
        }
        else {
            System.out.println("alert does not work properly");
        }

    }
}
