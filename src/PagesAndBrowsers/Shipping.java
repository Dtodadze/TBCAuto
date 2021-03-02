package PagesAndBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shipping {

    public WebElement agreeWithTerms;
    public WebElement continueSopping;
    public WebElement proceedToCheckout;

    public void SippingPageWebElements(WebDriver driver){

        agreeWithTerms = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
        continueSopping = driver.findElement(By.xpath("//*[@id=\"form\"]/p/a"));
        proceedToCheckout = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")); ;

    }
}
