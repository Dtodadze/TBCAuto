package testAutomation;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import PagesAndBrowsers.SigneUp;

public class SigneUpForShopping {

    SigneUp signeUp = new SigneUp();
    @Test(priority = 11)
    void SigneUpAccount() throws InterruptedException {

        signeUp.GetSingUpWebElements(setUp.driver);
        signeUp.genderMr.click();
        Thread.sleep(500);
        signeUp.firstName.sendKeys("David");
        Thread.sleep(500);
        signeUp.lastName.sendKeys("Todadze");
        Thread.sleep(500);
        signeUp.password.sendKeys("todadze1234");
        Thread.sleep(500);
        Select day = new Select(signeUp.birthDay);
        day.selectByValue("16");
        Thread.sleep(500);
        Select month = new Select(signeUp.birthMonth);
        month.selectByValue("8");
        Thread.sleep(500);
        Select year = new Select(signeUp.birthYear);
        year.selectByValue("1997");
        Thread.sleep(500);
        signeUp.newsletter.click();
        Thread.sleep(500);
        signeUp.addressFirstName.sendKeys("street");
        Thread.sleep(500);
        signeUp.addressLastName.sendKeys("toroshelidze");
        Thread.sleep(500);
        signeUp.addressCompany.sendKeys("LIBERTY");
        Thread.sleep(500);
        signeUp.addressAddress.sendKeys("28");
        Thread.sleep(500);
        signeUp.addressAddressLine2.sendKeys("line");
        Thread.sleep(500);
        signeUp.addressCity.sendKeys("tbilisi");
        Thread.sleep(500);
        Select statee = new Select(signeUp.addressState);
        statee.selectByValue("2");
        Thread.sleep(500);
        signeUp.addressPostalCode.sendKeys("00000");
        signeUp.addressAddInfo.sendKeys("holla");
        Thread.sleep(500);
        signeUp.addressHomePhone.sendKeys("+9954121555");
        Thread.sleep(500);
        signeUp.addressMobilePhone.sendKeys("+995598114422");
        Thread.sleep(500);
        signeUp.register.click();
    }
}
