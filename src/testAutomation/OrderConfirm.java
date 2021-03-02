package testAutomation;

import PagesAndBrowsers.ConfirmOrder;
import org.testng.annotations.Test;

public class OrderConfirm {

    ConfirmOrder confirmOrder = new ConfirmOrder();
    @Test(priority = 15)
    void CheckAndConfirmOrder() throws InterruptedException {

        confirmOrder.ConfirmOrderWebElements(setUp.driver);
        String sAmount = confirmOrder.tAmount.getText();
        sAmount = sAmount.substring(1);
        double realAmount=Double.parseDouble(sAmount);
        if(realAmount==setUp.amount){
            System.out.println("Amount is properly counted");
            Thread.sleep(500);
            confirmOrder.confirmOrder.click();
            Thread.sleep(500);

        }
    }
}
