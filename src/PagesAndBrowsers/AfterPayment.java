package PagesAndBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AfterPayment {

    public WebElement csd;
    public WebElement backToOrder;

    public void AfterPaymentWebElements(WebDriver driver){

        csd = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/a"));
        backToOrder = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a"));
    }
}
