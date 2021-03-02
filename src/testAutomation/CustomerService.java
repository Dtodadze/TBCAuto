package testAutomation;

import PagesAndBrowsers.AfterPayment;
import org.testng.annotations.Test;

public class CustomerService {

    AfterPayment afterPayment = new AfterPayment();
    @Test(priority = 16)
    void customerService() throws InterruptedException {

        afterPayment.AfterPaymentWebElements(setUp.driver);
        afterPayment.csd.click();
        Thread.sleep(1000);
    }
}
