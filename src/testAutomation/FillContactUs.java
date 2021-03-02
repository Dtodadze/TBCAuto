package testAutomation;

import PagesAndBrowsers.ContactUs;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FillContactUs {
    ContactUs contactUs = new ContactUs();
    @Test(priority = 17)
    void StartFill() throws InterruptedException {
        contactUs.ContactUsWebElements(setUp.driver);
        Select subject = new Select(contactUs.objectHeading);
        subject.selectByValue("2");
        Thread.sleep(500);
        Select product = new Select(contactUs.orderReference);
        product.selectByIndex(1);
        Thread.sleep(500);
        contactUs.message.sendKeys("thx for good service");
        Thread.sleep(500);
        contactUs.attachFile.sendKeys("C:\\Users\\davit.todadze\\NTUSER.DAT");
        Thread.sleep(500);
        contactUs.send.click();
        Thread.sleep(500);
    }
}
