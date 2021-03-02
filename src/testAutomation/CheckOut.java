package testAutomation;

import PagesAndBrowsers.SignIN;
import org.testng.annotations.Test;

public class CheckOut {

    SignIN signIn =new SignIN();
    @Test(priority = 10)
    void SigneIn() throws InterruptedException {

        signIn.GetSignInWebElements(setUp.driver);

        signIn.email.sendKeys("dtodatest@gmail332.com");
        signIn.createAnAccount.click();
        Thread.sleep(2000);

    }
}
