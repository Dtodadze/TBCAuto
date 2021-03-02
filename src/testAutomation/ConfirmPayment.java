package testAutomation;

import PagesAndBrowsers.Payment;
import org.testng.annotations.Test;

public class ConfirmPayment {

    Payment payment =new Payment();
    @Test(priority = 14)
    void SelectPaymentMethod() throws InterruptedException {

        payment.PaymentWebElements(setUp.driver);
        String pAmount = payment.totalAmount.getText();
        pAmount = pAmount.substring(1);
        setUp.amount=Double.parseDouble(pAmount);
        System.out.println("Total amount ="+setUp.amount);
        Thread.sleep(500);
        payment.payByCheck.click();
        Thread.sleep(1000);

    }
}
