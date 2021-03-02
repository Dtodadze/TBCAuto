package testAutomation;

import org.testng.annotations.Test;
import PagesAndBrowsers.AddressBeforeCheckOut;

public class ConfirmAddress {

    AddressBeforeCheckOut addressBeforeCheckOut =new AddressBeforeCheckOut();
    @Test(priority = 12)
    void ValidateAddress() throws InterruptedException {

        addressBeforeCheckOut.AddressPageWebElements(setUp.driver);
        addressBeforeCheckOut.proceedToCheckOut.click();
        Thread.sleep(2000);
    }
}
